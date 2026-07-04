package com.sample.model;

public class Account {
	  private int accountId;
	    private String accountHolder;
	    private String accountType;
	    private double balance;

	    public Account(int accountId, String accountHolder, String accountType, double balance) {
	        this.accountId = accountId;
	        this.accountHolder = accountHolder;
	        this.accountType = accountType;
	        this.balance = balance;
	    }

	    public int getAccountId() {
	        return accountId;
	    }

	    public String getAccountHolder() {
	        return accountHolder;
	    }

	    public String getAccountType() {
	        return accountType;
	    }

	    public double getBalance() {
	        return balance;
	    }
}
