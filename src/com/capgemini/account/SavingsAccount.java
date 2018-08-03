package com.capgemini.account;
import java.util.Random;

/*blue print of a savings account which contain account holder name, balance and account number*/
public class SavingsAccount {
	
	private String customerName;
	double initialBalance;
	int accountNumber;
	static int change = 1000000;
	
	//ctor to initialise the name and initial balance
	public SavingsAccount(String customerName, double initialBalance) {
		super();
		this.customerName = customerName;
		this.initialBalance = initialBalance;
	}
	
	//ctor to intialise the account number uniquely
	public SavingsAccount() {
		
		change++;
		accountNumber = change;
		
		initialBalance = 0.0;
	}
	
	//method to withdraw amount
	public boolean withdraw(double amount) {
		
		if(amount < initialBalance) {
			initialBalance -= amount;
			return true;
		}
			
		else
			return true;
	}
	
	//method to deposit the amount
	public boolean deposit(double amount) {
		
		initialBalance += amount;
		return true;
	}

	

	@Override
	public String toString() {
		return "SavingsAccount [customerName=" + customerName + ", Balance=" + initialBalance
				+ ", accountNumber=" + accountNumber + "]";
	}
	
	//method to get the account number
	public static int getNextAccountNumber() {
		
		Random random = new Random();
		
		int temporary = random.nextInt();
		
		return temporary;
	}

	
	//method to get customer's name
	public String getCustomerName() {
		return customerName;
	}

	
	//method to assign value to customer's name
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	//method to get the account balance

	public double getInitialBalance() {
		return initialBalance;
	}
	
	//method to assign the account balance

	public void setInitialBalance(double initialBalance) {
		this.initialBalance = initialBalance;
	}
	
	//method to get the account number

	public int getAccountNumber() {
		return accountNumber;
	}
	
	//method to assign account number

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	

}
