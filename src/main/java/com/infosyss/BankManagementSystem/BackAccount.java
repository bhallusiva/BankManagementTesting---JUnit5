package com.infosyss.BankManagementSystem;

public class BackAccount {

	private String name;
	private double balance;
	BackAccount(double balance,String name)
	{
		this.name=name;
		this.balance=balance;
	}
	
	//to Deposite money
	void Deposite(int amount)
	{
		if(amount<=0)
		{
			throw new IllegalArgumentException("your Amout is not sufficient to deposite");
		}
		balance+=amount;
		System.out.println("Current balance After Depositing "+amount+" "+"="+balance);
	}
 
	void Withdraw(int amount)
	{
		if(amount>balance)
		{
			throw new IllegalArgumentException("you don't have sufficient balance to withdraw"); 
		}
		balance-=amount;
		System.out.println("Current balance After withsrawing "+amount+" "+"="+balance);
	}
	
	double Balance()
	{
		return balance;
	}
	
}
