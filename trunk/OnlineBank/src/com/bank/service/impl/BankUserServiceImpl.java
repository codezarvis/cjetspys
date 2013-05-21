package com.bank.service.impl;

import java.sql.PreparedStatement;
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

	/* (non-Javadoc)
	 * @see com.bank.service.BankUserService#create(com.bank.app.domain.BankUser)
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

	/* (non-Javadoc)
	 * @see com.bank.service.BankUserService#getAll()
	 */
	public List<BankUser> getAll() {
		// to do
		return null;
	}

	/* (non-Javadoc)
	 * @see com.bank.service.BankUserService#authenticate(java.lang.String, java.lang.String)
	 */
	@Override
	public BankUser authenticate(String username, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.bank.service.BankUserService#findById(int)
	 */
	@Override
	public BankUser findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
