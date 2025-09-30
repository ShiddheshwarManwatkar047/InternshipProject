
package com.task5;

public class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(String accountNumber, String accountHolder, double balance, double interestRate) {
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }

    public void addInterest() {
        double interest = balance * interestRate / 100;
        balance += interest;
        transactions.add("Interest added: " + interest);
        System.out.println("✅ Interest added: " + interest);
    }
}
