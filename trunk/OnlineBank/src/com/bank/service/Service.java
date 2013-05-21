/**
 * 
 */
package com.bank.service;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * @author Sudarsan
 *
 */
public interface Service {

	
	/**
	 * @return
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 * To Establish a Connection with DataStore "BankDb"
	 */
	Connection getConnection() throws ClassNotFoundException, SQLException;
	
	/**
	 * @throws SQLException
	 * To Close Connection
	 */
	void closeConnection() throws SQLException;
	
	
}
