package com.task5;


import java.util.Scanner;

public class BankApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create accounts
        SavingsAccount sa = new SavingsAccount("S001", "Sam", 1000, 5);
        CurrentAccount ca = new CurrentAccount("C001", "Avinash", 2000, 500);

        int choice;
        do {
            System.out.println("\n===== BANK MENU =====");
            System.out.println("1. Deposit (Savings)");
            System.out.println("2. Withdraw (Savings)");
            System.out.println("3. Add Interest (Savings)");
            System.out.println("4. Show Balance (Savings)");
            System.out.println("5. Deposit (Current)");
            System.out.println("6. Withdraw (Current)");
            System.out.println("7. Show Balance (Current)");
            System.out.println("8. Show Transactions (Savings)");
            System.out.println("9. Show Transactions (Current)");
            System.out.println("0. Exit");
            System.out.print("👉 Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> sa.deposit(500);
                case 2 -> sa.withdraw(300);
                case 3 -> sa.addInterest();
                case 4 -> sa.showBalance();
                case 5 -> ca.deposit(1000);
                case 6 -> ca.withdraw(2500);
                case 7 -> ca.showBalance();
                case 8 -> sa.showTransactions();
                case 9 -> ca.showTransactions();
                case 0 -> System.out.println("🚪 Exiting...");
                default -> System.out.println("❌ Invalid choice!");
            }
        } while (choice != 0);

        sc.close();
    }
}
