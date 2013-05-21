package com.bank.utils.queries;

/**
 * @author Sudarsan
 *
 */
public interface BankEmployeeQueries {

	
	public static final String INSERT = "INSERT INTO BANKUSER VALUES(?,?,?)";
	public static final String UPDATE = "UPDATE PASSWORD = ?,USERROLE = ? FROM BANKUSER WHERE USERNAME = ?";
	public static final String DELETE = "DELETE  FROM BANKUSER WHERE USERNAME = ?";
	public static final String AUTHENTICATE = "SELECT  * FROM BANKUSER WHERE USERNAME = ? AND PASSWORD = ?";
    public static final String FINDBY_USERNAME = "SELECT * FROM BANKUSER WHERE USERNAME = ?";
}
