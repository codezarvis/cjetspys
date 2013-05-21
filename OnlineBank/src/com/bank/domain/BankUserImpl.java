package com.bank.domain;

import com.bank.app.domain.BankUser;

/**
 * @author Sudarsan
 * 
 */
public class BankUserImpl implements BankUser {

	private String userName;
	private String password;
	private String userRole;
	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}
	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * @return the userRole
	 */
	public String getUserRole() {
		return userRole;
	}
	/**
	 * @param userRole the userRole to set
	 */
	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("BankUserImpl [userName=");
		builder.append(userName);
		builder.append(", password=");
		builder.append(password);
		builder.append(", userRole=");
		builder.append(userRole);
		builder.append("]");
		return builder.toString();
	}
	
	

}
