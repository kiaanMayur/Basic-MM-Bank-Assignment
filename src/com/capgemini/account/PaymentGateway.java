package com.capgemini.account;

//class to transfer the amount from one account to another
public class PaymentGateway {
	// Method to transfer the given amount from source to target account 
	public static boolean transferBalance(SavingsAccount source, SavingsAccount target, double amount) {
		
		if(source.getInitialBalance() == amount) {
			target.setInitialBalance(amount);
			return true;
		}
		
		else
			return false;
	}
}
