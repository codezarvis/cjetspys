package com.bank.utils.queries;

/**
 * @author Sudarsan
 *
 */
public interface BankEmployeeQueries {

	
	public static final String INSERT = "INSERT INTO BankUser VALUES(?,?,?)";
	public static final String UPDATE = "UPDATE PASSWORD = ?,USERROLE = ? FROM BankUser WHERE USERNAME = ?";
	public static final String DELETE = "DELETE  FROM BankUser WHERE USERNAME = ?";
	public static final String AUTHENTICATE = "SELECT  * FROM BankUser WHERE USERNAME = ? AND PASSWORD = ?";
}
