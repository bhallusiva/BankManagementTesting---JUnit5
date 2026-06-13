package com.infosyss.BankManagementSystem;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.BeforeEach;
public class TestBankAccount {
	
	BackAccount accHolder;
	 
	@AfterEach
	void message2()
	{
		//message after every transaction is completed
		System.out.println("Transaction done..");
	}
	@BeforeEach
	void userGeneration()
	{
		System.out.println("Transaction is begining");
		accHolder=new BackAccount(100,"Siva");
		
	}
	@Test
	void testDeposit() //has to pass
	{
		accHolder.Deposite(100);
		assertEquals(200,accHolder.Balance(),()->"deposite is not succesed");
	}
	@Test
	void testWithdraw()
	{
		accHolder.Withdraw(100);
		assertEquals(0,accHolder.Balance(),()->"withdraw is not succesed");
	}
	@Test
	void testWithdrwShouldMoreThanZero()
	{
		assertThrows(IllegalArgumentException.class,()->accHolder.Withdraw(200000),"exception Logic is not correct,verify it again....");
	}
	@Test
	void testDepositShouldBeMoreThanZero()
	{
		assertThrows(IllegalArgumentException.class,()->accHolder.Deposite(-100),"exception Logic is not correct,verify it again....");
	}
	@Test
	void TestBalance()
	{
		assertTrue(accHolder.Balance()>=0,()->"Your Account balance is in Negative Make Sure you have sufficient balance");
	}
	
}
