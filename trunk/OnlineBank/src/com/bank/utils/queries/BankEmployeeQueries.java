package com.bank.utils.queries;

/**
 * @author Sudarsan
 *
 */
public interface BankEmployeeQueries {

	
	public static final String INSERT = "INSERT INTO APPUSER VALUES(?,?,?)";
	public static final String UPDATE = "UPDATE PASSWORD = ?,USERROLE = ? FROM APPUSER WHERE USERNAME = ?";
	public static final String DELETE = "DELETE PASSWORD = ?,USERROLE = ? FROM APPUSER WHERE USERNAME = ?";
	public static final String AUTHENTICATE = "UPDATE USERROLE = ? FROM APPUSER WHERE USERNAME = ? AND PASSWORD = ?";
}
