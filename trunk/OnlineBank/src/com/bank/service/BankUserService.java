/**
 * 
 */
package com.bank.service;

import java.util.List;

import com.bank.app.domain.BankUser;

/**
 * @author Sudarsan
 * 
 */
public interface BankUserService extends Service{

	void create(BankUser bankUser) throws Exception;

	List<BankUser> getAll() throws Exception;

	BankUser authenticate(String username, String password) throws Exception;

	BankUser findById(String username) throws Exception;
}
