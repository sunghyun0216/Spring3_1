package com.iu.s3.account;

public class AccountDTO {
	
	private String accountNumber;
	private long accountBalance;
	private long accountDate;
	private String id;
	private long bookNumber;
	
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public long getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(long accountBalance) {
		this.accountBalance = accountBalance;
	}
	public long getAccountDate() {
		return accountDate;
	}
	public void setAccountDate(long accountDate) {
		this.accountDate = accountDate;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public long getBookNumber() {
		return bookNumber;
	}
	public void setBookNumber(long bookNumber) {
		this.bookNumber = bookNumber;
	}
	
	
	
}
