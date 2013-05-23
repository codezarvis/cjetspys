/**
 * 
 */
package com.bank.service.impl;

import java.sql.PreparedStatement;
import java.util.List;

import com.bank.domain.sub.Customer;
import com.bank.service.CustomerService;
import com.bank.utils.queries.CustomerQueries;

/**
 * @author Sudarsan
 * 
 */
public class CustomerSerivceImpl extends ServiceImpl implements CustomerService {

	private PreparedStatement preparedStatement = null;

	private static CustomerSerivceImpl customerSerivceImpl = new CustomerSerivceImpl();

	/**
	 * Creates a SingleTon Service for <code>Customer.</code>
	 */
	private CustomerSerivceImpl() {

	}

	/**
	 * @return <code>CustomerService<code>
	 * 
	 */
	public static CustomerService getInstance() {
		return customerSerivceImpl;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.bank.service.CustomerService#create(com.bank.domain.sub.Customer)
	 */
	@Override
	public void create(Customer customer) throws Exception {

		preparedStatement = getConnection().prepareStatement(
				CustomerQueries.INSERT);

		preparedStatement.setString(1, customer.getGuid());
		preparedStatement.setString(2, customer.getAccountNumber());
		preparedStatement.setString(3, customer.getFirstName());
		preparedStatement.setString(4, customer.getLastName());
		preparedStatement.setString(5, customer.getGender());
		preparedStatement.setString(6, customer.getDateOfBirth());
		preparedStatement.setString(7, customer.getEmail());
		preparedStatement.setString(8, customer.getMobile());
		preparedStatement.setBlob(9, customer.getUserPic());
		preparedStatement.setBlob(10, customer.getSignature());
		preparedStatement.setDate(11, new java.sql.Date(customer.getCreatedOn()
				.getTime()));
		preparedStatement.setInt(12, customer.getCreatedBy());
		preparedStatement.setDate(13, new java.sql.Date(customer
				.getModifiedOn().getTime()));
		preparedStatement.setInt(14, customer.getModifiedBy());
		preparedStatement.setInt(15, customer.getActive());

		preparedStatement.executeUpdate();
		preparedStatement.close();

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.bank.service.CustomerService#getAll()
	 */
	@Override
	public List<Customer> getAll() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.bank.service.CustomerService#findByAccountNumber(java.lang.String)
	 */
	@Override
	public Customer findByAccountNumber(String accountNumber) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
