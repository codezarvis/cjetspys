package com.bank.app.domain;

public interface BankUser {

	void setUserName(String userName);
	
	String getUserName();
	
	void setPassword(String password);
	
	String getPassword();
	
	void setUserRole(String userRole);
	
	String getUserRole();

}