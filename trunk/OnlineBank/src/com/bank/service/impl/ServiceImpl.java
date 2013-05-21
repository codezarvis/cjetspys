package com.bank.service.impl;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import com.bank.service.Service;

/**
 * @author Sudarsan
 * Service Implementation for the DataStore "BankDb"
 */
public class ServiceImpl implements Service {

	private Connection connection = null;
	private String driver;
	private String url = null;
	private String userName = null;
	private String password = null;
	private InputStream inputStream = null;
	private Properties properties = null;

	/**
	 * Database Properties from the Properties File 
	 */
	public ServiceImpl() {

		try {
			inputStream = new FileInputStream(new File("database.properties"));
			properties = new Properties();
			properties.load(inputStream);
			this.url = properties.getProperty("url");
			this.driver = properties.getProperty("driver");
			this.userName = properties.getProperty("userName");
			this.password = properties.getProperty("password");
		} catch (FileNotFoundException exception) {
			exception.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	/* (non-Javadoc)
	 * @see com.bank.service.Service#getConnection()
	 */
	@Override
	public Connection getConnection() throws ClassNotFoundException,
			SQLException {

		Class.forName(driver);
		connection = DriverManager.getConnection(url, userName, password);
		return connection;
	}

	/* (non-Javadoc)
	 * @see com.bank.service.Service#closeConnection()
	 */
	@Override
	public void closeConnection() throws SQLException {

		if (connection != null) {
			connection.close();
		}
	}

}
