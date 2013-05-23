/**
 * 
 */
package com.bank.service.impl;

import java.util.List;

import com.bank.domain.sub.Customer;
import com.bank.service.CustomerService;

/**
 * @author Sudarsan
 * 
 */
public class CustomerSerivceImpl extends ServiceImpl implements CustomerService {

	private static CustomerSerivceImpl customerSerivceImpl = new CustomerSerivceImpl();

	/**
	 *  Creates a SingleTon Service for <code>Customer.</code>
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
		// TODO Auto-generated method stub

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
