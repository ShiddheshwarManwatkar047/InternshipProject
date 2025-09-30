package com.task5;


public class CurrentAccount extends Account {
    private double overdraftLimit;

    public CurrentAccount(String accountNumber, String accountHolder, double balance, double overdraftLimit) {
        super(accountNumber, accountHolder, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && balance + overdraftLimit >= amount) {
            balance -= amount;
            transactions.add("Withdrawn: " + amount + " (using overdraft if needed)");
            System.out.println("✅ Withdrawn: " + amount);
        } else {
            System.out.println("❌ Withdrawal exceeds overdraft limit!");
        }
    }
}
