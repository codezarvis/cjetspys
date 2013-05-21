package com.bank.service.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.bank.app.domain.BankUser;
import com.bank.domain.BankUserImpl;
import com.bank.service.BankUserService;
import com.bank.utils.queries.BankEmployeeQueries;


public class BankUserServiceImpl extends ServiceImpl implements BankUserService {

	private static BankUserServiceImpl bankUserServiceImpl = new BankUserServiceImpl();

	private PreparedStatement preparedStatement = null;
	private Statement statement = null;
	private ResultSet resultSet = null;

	public static BankUserService getInstance() {
		return bankUserServiceImpl;
	}

	private BankUserServiceImpl() {

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.bank.service.BankUserService#create(com.bank.app.domain.BankUser)
	 */
	public void create(BankUser bankUser) throws Exception {
		preparedStatement = getConnection().prepareStatement(
				BankEmployeeQueries.INSERT);
		preparedStatement.setString(1, bankUser.getUserName());
		preparedStatement.setString(2, bankUser.getPassword());
		preparedStatement.setString(3, bankUser.getUserRole());
		preparedStatement.executeUpdate();

		preparedStatement.close();
		closeConnection();

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.bank.service.BankUserService#getAll()
	 */
	public List<BankUser> getAll() {
		
		List<BankUser> userList = new ArrayList<BankUser>();
		Statement statement = null;
		ResultSet resultSet = null;
		BankUser bankUser = null;
		 try {
			statement = getConnection().createStatement();
			resultSet = statement.executeQuery(BankEmployeeQueries.GETALL);
			
			while(resultSet.next()){
				
				String name = resultSet.getString(1);
				String password = resultSet.getString(2);
				String role = resultSet.getString(3);
				
				bankUser = new BankUserImpl();
				bankUser.setUserName(name);
				bankUser.setPassword(password);
				bankUser.setUserRole(role);
				
				userList.add(bankUser);				
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}finally{
			
			if(resultSet != null){
			
				try {
					resultSet.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(statement!= null){
				try {
					statement.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			
		}
		
		return userList;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.bank.service.BankUserService#authenticate(java.lang.String,
	 * java.lang.String)
	 */
	@Override
	public BankUser authenticate(String username, String password) throws  ClassNotFoundException,SQLException {
		
		BankUser bankUser = null;
		preparedStatement = getConnection().prepareStatement(BankEmployeeQueries.AUTHENTICATE);
		
		preparedStatement.setString(1,username);
		preparedStatement.setString(2, password);
		ResultSet resultSet = preparedStatement.executeQuery();
		
		if(resultSet.next()){
		    bankUser = new BankUserImpl();
			bankUser.setUserName(resultSet.getString(1));
			bankUser.setPassword(resultSet.getString(2));
			
		}
		return bankUser;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.bank.service.BankUserService#findById(int)
	 */
	@Override
	public BankUser findById(String username) throws SQLException,
			ClassNotFoundException {

		BankUser bankUser = null;

		preparedStatement = getConnection().prepareStatement(
				BankEmployeeQueries.FINDBY_USERNAME);
		preparedStatement.setString(1, username);
		resultSet = preparedStatement.executeQuery();

		if (resultSet.next()) {
			bankUser = new BankUserImpl();
			bankUser.setUserName(resultSet.getString(1));
			bankUser.setPassword(resultSet.getString(2));
			bankUser.setUserRole(resultSet.getString(3));
		}

		resultSet.close();
		preparedStatement.close();
		closeConnection();
		return bankUser;
	}

}
