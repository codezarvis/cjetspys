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

	
	Connection getConnection() throws ClassNotFoundException, SQLException;
	
	void closeConnection() throws SQLException;
	
	
}
