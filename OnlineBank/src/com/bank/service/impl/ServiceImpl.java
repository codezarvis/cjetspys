package com.bank.service.impl;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import com.bank.service.Service;

public class ServiceImpl implements Service {

	private Connection connection = null;
	private String driver;
	private String url = null;
	private String userName = null;
	private String password = null;
	private InputStream inputStream = null;
	private Properties properties = null;

	public ServiceImpl() throws FileNotFoundException, IOException {

		inputStream = new FileInputStream(new File("database.properties"));
		properties = new Properties();
		properties.load(inputStream);
		this.url = properties.getProperty("url");
		this.driver = properties.getProperty("driver");
		this.userName = properties.getProperty("userName");
		this.password = properties.getProperty("password");

	}

	@Override
	public Connection getConnection() throws ClassNotFoundException,
			SQLException {

		Class.forName(driver);
		connection = DriverManager.getConnection(url, userName, password);
		return connection;
	}

	@Override
	public void closeConnection() throws SQLException {

		if (connection != null) {
			connection.close();
		}
	}

}
