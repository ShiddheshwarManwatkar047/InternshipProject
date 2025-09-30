package com.tasks5;

public class Main {

	public static void main(String[] args) {
		Account account=new Account();
		account.setBalance(3980000);
		account.setAccountNumber(23432423l);
		account.setAccountHolder("Rameshwar Manwatkar");
		account.displayAccountInfo();
		account.withdraw(80000);
		account.withdraw(80000,"ATM");

		
	
		
		
	
	/*	System.out.println("*************************");
		SavingAccount s=new SavingAccount(8767227751l, "SAM", 2000000.00);
		s.withdraw(1500.00);
		s.displayAccountInfo();
	    s.withdraw(1500.00);
	*/
		
		
		//System.out.println("********************************");
		//CurrentAccount c=new CurrentAccount(8767227751l,"RAM",45000);
		//c.withdraw(5000);
	//	c.setAccountHolder("Sam");
	//	c.setAccountNumber(8767227751l);
	//	c.setBalance(20000.00);
		//c.displayAccountInfo();
	//	System.out.println(c.getBalance());
	
	}
}
