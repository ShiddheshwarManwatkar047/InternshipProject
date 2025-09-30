package com.tasks5;

public class Account {
	
	public long accountNumber;
	public String accountHolder;
	private double balance;
	
	public long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccountHolder() {
		return accountHolder;
	}
	public  void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
	public void withdraw(double amount) {
		this.balance-=amount;
	}
	public void withdraw(double amount,String atm) {
		this.balance-=amount;
		System.out.println("After Withdraw balance Is:"+balance);
		System.out.println("Withdraw Amount Is:"+amount);
		//System.out.println("Through:"+atm);
	}
	
	public void displayAccountInfo() {
		System.out.println("Account Number Is:"+accountNumber);
		System.out.println("Account Holder Name Is:"+accountHolder);
		System.out.println("Balance Is:"+balance);
	}
	public void deposit(double amount) {
		this.balance=balance+amount;
	}

	
}
