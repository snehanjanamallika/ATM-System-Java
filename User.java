package com.project;

public class User {
	
	private long accountNumber;
	private String accountHolderName;;
	private double balance;
	private int pin;
	
	
	public User() {
		super();
	}
	
	
	public User(long accountNumber, String accountHolderName, double balance, int pin) {
		super();
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.balance = balance;
		this.pin = pin;
	}

	@Override
	public String toString() {
		return "User [accountNumber=" + accountNumber + ", accountHolderName=" + accountHolderName + ", balance="
				+ balance + ", pin=" + pin + "]";
	}


	public long getAccountNumber() {
		return accountNumber;
	}
	
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	public String getAccountHolderName() {
		return accountHolderName;
	}
	
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	
	public double getBalance() {
		return balance;
	}
	
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public int getPin() {
		return pin;
	}
	
	public void setPin(int pin) {
		this.pin = pin;
	}
	

}
