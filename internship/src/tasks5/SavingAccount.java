package com.tasks5;

public class SavingAccount extends Account{
	int limit=200;
	private double balance;
	int withdraw=2;
	int withdrawals=0;
	
	public SavingAccount(long accountNumber,String acoountHolder,double balance) {
		this.accountNumber=accountNumber;
		this.accountHolder=acoountHolder;
		this.balance=balance;
	}
	
	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	public void displayAccountInfo() {
		System.out.println("Account Number Is:"+accountNumber);
		System.out.println("Account Holder Name Is:"+accountHolder);
		System.out.println("Balance Is:"+balance);
	}
	
	@Override
	public void withdraw(double amount) {
		
		if(amount<0) {
			System.out.println("Amount Is Less Than Zero,,Please Provide Correvt Amount...");
		}
		else if(amount>limit) {
			System.out.println("Yours Amount Is Out Of Number...Please Provide Limited Amount");
		}

		else if(withdrawals>withdraw) {
			System.out.println("You Can't Withdraw ");
		}
		else {
			balance-=amount;
			withdrawals++;
			System.out.println("After Withdraw:"+balance);
		
		}
	}
}
