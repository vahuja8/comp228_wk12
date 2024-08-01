package com.va.week12.lab6;

public class Transaction implements Runnable {

	// declare the instance variables.. 
	private Account account; 
	private String  transactionType;
	private double amount; 
	
	
	/*
	 * Draft a constructor for intilizing the instance
	 * all 3 variables. 
	 */
	
	public Transaction(Account account, String transactionType)
	{
        this.account = account;
        this.transactionType = transactionType;
	}

	@Override
	public void run() {
		
		/*
		if("deposit".equals(transactionType)) {
			account.deposit(amount);
			else if .... 
		}
		*/
	}

}
