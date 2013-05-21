package com.bank.service.impl;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.bank.app.domain.BankUser;
import com.bank.service.BankUserService;
import com.bank.utils.queries.BankEmployeeQueries;

public class BankUserServiceImpl extends ServiceImpl implements BankUserService {

	private static BankUserServiceImpl bankUserServiceImpl = new BankUserServiceImpl();

	private PreparedStatement preparedStatement = null;

	public static BankUserService getInstance() {
		return bankUserServiceImpl;
	}

	private BankUserServiceImpl() {

	}

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

	public List<BankUser> getAll() {
		// to do
		return null;
	}

	@Override
	public BankUser authenticate(String username, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BankUser findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
