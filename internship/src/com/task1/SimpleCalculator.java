package com.task1;

import java.util.Scanner;

public class SimpleCalculator {

	 public static void main(String[] args) {
		 SimpleCalculator calculator = new SimpleCalculator();
	        Scanner scanner = new Scanner(System.in);
	        boolean continueCalc = true;

	        while (continueCalc) {
	            System.out.println("=== Simple Calculator ===");
	            System.out.println("1. Addition (+)");
	            System.out.println("2. Subtraction (-)");
	            System.out.println("3. Multiplication (*)");
	            System.out.println("4. Division (/)");
	            System.out.println("5. Exit");
	            System.out.print("Enter your choice: ");
	            int choice = scanner.nextInt();

	            if (choice == 5) {
	                System.out.println("Exiting Calculator. Goodbye!");
	                break;
	            }

	            System.out.print("Enter first number: ");
	            double num1 = scanner.nextDouble();
	            System.out.print("Enter second number: ");
	            double num2 = scanner.nextDouble();

	            double result = 0;
	            switch (choice) {
	                case 1:
	                    result = num1 + num2;
	                    System.out.println("Result: " + result);
	                    break;
	                case 2:
	                    result = num1 - num2;
	                    System.out.println("Result: " + result);
	                    break;
	                case 3:
	                    result = num1 * num2;
	                    System.out.println("Result: " + result);
	                    break;
	                case 4:
	                    if (num2 == 0) {
	                        System.out.println("Error! Division by zero.");
	                    } else {
	                        result = num1 / num2;
	                        System.out.println("Result: " + result);
	                    }
	                    break;
	                default:
	                    System.out.println("Invalid choice! Try again.");
	            }
	            System.out.println();
	        }

	        scanner.close();
	    }
}
