package com.tasks5;
import java.util.Scanner;
public class CurrentAccount extends Account{
	int overdrafts=100;
	int withdrawals=0;
	private double balance;
	private int password;
	
	public double getBalance() {
		return balance;
	}


	public void setBalance(double balance) {
		this.balance = balance;
	}


	
	
	public CurrentAccount(long accountNumber, String acoountHolder, double balance) {
		this.accountNumber=accountNumber;
		this.accountHolder=acoountHolder;
		this.balance=balance;	}


	private int getOverdrafts() {
		return overdrafts;
	}


	private void setOverdrafts(int overdrafts) {
		this.overdrafts = overdrafts;
	}


	private int getWithdrawals() {
		return withdrawals;
	}


	private void setWithdrawals(int withdrawals) {
		this.withdrawals = withdrawals;
	}

	public void displayAccountInfo() {
		System.out.println("Account Number Is:"+accountNumber);
		System.out.println("Account Holder Name Is:"+accountHolder);
		System.out.println("Balance Is:"+balance);
	}

	@Override
	public void withdraw(double amount) {
		this.password=password;
		password=8767;
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter Password:");
		password=scn.nextInt();
		if(password==password) {
		if(amount<0) {
			System.out.println("Amount Is less than Zero...");
		}
		else if(withdrawals<overdrafts) {
			balance-=amount;
			System.out.println("After Withdraw Balance Is:"+balance);
		}
		}	
		else {
			System.out.println("You Enter Wrong Password....");
		}
	}
	
	public static void main(String[] args) {
	/*			Account account=new Account();
				account.setBalance(4000);
				account.setAccountHolder("Rameshwar Manwatkar");
				account.displayAccountInfo();
				account.withdraw(2000);
				account.withdraw(1000,"ATM");
*/
			
		
				
				
			
	/*	    	System.out.println("*************************");
				SavingAccount s=new SavingAccount(8767227751l, "SAM", 2000000.00);
				s.displayAccountInfo();
				s.withdraw(1500.00);
			   // s.withdraw(1500.00);
*/		
				
				
			System.out.println("********************************");
				CurrentAccount c=new CurrentAccount(8767227751l,"RAM",45000);
				c.displayAccountInfo();
				c.withdraw(5000);
			//	c.setAccountHolder("Sam");
			//	c.setAccountNumber(8767227751l);
			//	c.setBalance(20000.00);
				
			//	System.out.println(c.getBalance());
		
			}
}
