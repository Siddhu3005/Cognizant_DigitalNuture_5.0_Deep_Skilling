package com.sample.model;

public class Loan {
	 	private int loanId;
	    private String loanType;
	    private double amount;
	    private double interestRate;

	    public Loan(int loanId, String loanType, double amount, double interestRate) {
	        this.loanId = loanId;
	        this.loanType = loanType;
	        this.amount = amount;
	        this.interestRate = interestRate;
	    }

	    public int getLoanId() {
	        return loanId;
	    }

	    public String getLoanType() {
	        return loanType;
	    }

	    public double getAmount() {
	        return amount;
	    }

	    public double getInterestRate() {
	        return interestRate;
	    }
}
