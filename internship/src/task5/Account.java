package com.task5;


import java.util.ArrayList;
import java.util.List;

public class Account {
    protected String accountNumber;
    protected String accountHolder;
    protected double balance;
    protected List<String> transactions;

    public Account(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
        this.transactions = new ArrayList<>();
        transactions.add("Account created with balance: " + balance);
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            transactions.add("Deposited: " + amount);
            System.out.println("✅ Deposited: " + amount);
        } else {
            System.out.println("❌ Invalid deposit amount!");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            transactions.add("Withdrawn: " + amount);
            System.out.println("✅ Withdrawn: " + amount);
        } else {
            System.out.println("❌ Insufficient balance!");
        }
    }

    public void showBalance() {
        System.out.println("💰 Current Balance: " + balance);
    }

    public void showTransactions() {
        System.out.println("📜 Transaction History:");
        for (String t : transactions) {
            System.out.println(" - " + t);
        }
    }
}
