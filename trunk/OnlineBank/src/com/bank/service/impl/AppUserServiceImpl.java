/**
 * 
 */
package com.bank.service.impl;

import java.sql.PreparedStatement;
import java.util.List;

import com.bank.domain.sub.AppUser;
import com.bank.service.AppUserService;
import com.bank.utils.queries.AppUserQueries;

/**
 * @author Sudarsan
 * 
 */
public class AppUserServiceImpl extends ServiceImpl implements AppUserService {

	private PreparedStatement preparedStatement = null;

	private static AppUserServiceImpl appUserServiceImpl = new AppUserServiceImpl();

	/**
	 * Creates a SingleTon Service for <code>AppUser.</code> 
	 */
	private AppUserServiceImpl() {

	}

	/**
	 * @return <code>AppUserService</code>
	 * Provides a Single Instance for <code>AppUserService</code>.
	 */
	public static AppUserService getInstance() {
		return appUserServiceImpl;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.bank.service.AppUserService#authenticate(java.lang.String,
	 * java.lang.String)
	 */
	@Override
	public AppUser authenticate(String userame, String password)
			throws Exception {

		//TODO By Priyanka
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.bank.service.AppUserService#create(com.bank.domain.sub.AppUser)
	 */
	@Override
	public void create(AppUser appUser) throws Exception {
		preparedStatement = getConnection().prepareStatement(
				AppUserQueries.INSERT);
		preparedStatement.setString(1, appUser.getGuid());
		preparedStatement.setString(2, appUser.getUserName());
		preparedStatement.setString(3, appUser.getPassword());
		preparedStatement.setString(4, appUser.getQuestion());
		preparedStatement.setString(5, appUser.getAnswer());
		preparedStatement.setString(6, appUser.getUserRole());
		preparedStatement.setDate(7, new java.sql.Date(appUser.getCreatedOn()
				.getTime()));
		preparedStatement.setInt(8, appUser.getCreatedBy());
		preparedStatement.setDate(9, new java.sql.Date(appUser.getModifiedOn()
				.getTime()));
		preparedStatement.setInt(10, appUser.getModifiedBy());
		preparedStatement.setInt(11, appUser.getActive());
		preparedStatement.executeUpdate();
		preparedStatement.close();

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.bank.service.AppUserService#changePassword(java.lang.String,
	 * java.lang.String, java.lang.String)
	 */
	@Override
	public int changePassword(String userName, String oldPassword,
			String newPassword) throws Exception {
		// TODO By Yash
		return 0;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.bank.service.AppUserService#getPassword(java.lang.String,
	 * java.lang.String, java.lang.String)
	 */
	@Override
	public AppUser getPassword(String userName, String question, String answer)
			throws Exception {
		//TODO By Yash
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.bank.service.AppUserService#setStatus(java.lang.String)
	 */
	@Override
	public int setStatus(String userName, int status) throws Exception {
		// TODO By Priyanka
		return 0;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.bank.service.AppUserService#getAll()
	 */
	@Override
	public List<AppUser> getAll() throws Exception {
		//TODO By Suneel
		return null;
	}

}
