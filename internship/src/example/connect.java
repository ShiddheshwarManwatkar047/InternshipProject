package com.example;

import java.sql.*;
import java.util.Scanner;

public class connect {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // Load driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Connection
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3307/jdbc", "root", "root");

            while (true) {
                System.out.println("\n--- Employee CRUD Menu ---");
                System.out.println("1. Add Employee");
                System.out.println("2. View Employees");
                System.out.println("3. Update Employee");
                System.out.println("4. Delete Employee");
                System.out.println("5. Exit");
                System.out.print("Enter choice: ");
                int choice = sc.nextInt();

                switch (choice) {
                    case 1: // ADD
                        System.out.print("Enter ID: ");
                        int id = sc.nextInt();
                        sc.nextLine(); // consume newline
                        System.out.print("Enter Name: ");
                        String name = sc.nextLine();
                        System.out.print("Enter City: ");
                        String city = sc.nextLine();

                        String insertSQL = "INSERT INTO employee (id, name, city) VALUES (?, ?, ?)";
                        PreparedStatement psInsert = con.prepareStatement(insertSQL);
                        psInsert.setInt(1, id);
                        psInsert.setString(2, name);
                        psInsert.setString(3, city);
                        psInsert.executeUpdate();
                        System.out.println(" Employee Added Successfully!");
                        break;

                    case 2: // VIEW
                        String selectSQL = "SELECT * FROM employee";
                        PreparedStatement psSelect = con.prepareStatement(selectSQL);
                        ResultSet rs = psSelect.executeQuery();
                        System.out.println("\nID\tName\tCity");
                        while (rs.next()) {
                            System.out.println(rs.getInt("id") + "\t" + rs.getString("name") + "\t" + rs.getString("city"));
                        }
                        break;

                    case 3: // UPDATE
                        System.out.print("Enter Employee ID to Update: ");
                        int updateId = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Enter New Name: ");
                        String newName = sc.nextLine();
                        System.out.print("Enter New City: ");
                        String newCity = sc.nextLine();

                        String updateSQL = "UPDATE employee SET name=?, city=? WHERE id=?";
                        PreparedStatement psUpdate = con.prepareStatement(updateSQL);
                        psUpdate.setString(1, newName);
                        psUpdate.setString(2, newCity);
                        psUpdate.setInt(3, updateId);
                        int updated = psUpdate.executeUpdate();
                        if (updated > 0) {
                            System.out.println("✅ Employee Updated Successfully!");
                        } else {
                            System.out.println("⚠️ Employee Not Found!");
                        }
                        break;

                    case 4: // DELETE
                        System.out.print("Enter Employee ID to Delete: ");
                        int deleteId = sc.nextInt();

                        String deleteSQL = "DELETE FROM employee WHERE id=?";
                        PreparedStatement psDelete = con.prepareStatement(deleteSQL);
                        psDelete.setInt(1, deleteId);
                        int deleted = psDelete.executeUpdate();
                        if (deleted > 0) {
                            System.out.println(" Employee Deleted Successfully!");
                        } else {
                            System.out.println(" Employee Not Found!");
                        }
                        break;

                    case 5:
                        System.out.println("Exiting...");
                        con.close();
                        sc.close();
                        return;

                    default:
                        System.out.println(" Invalid Choice!");
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
