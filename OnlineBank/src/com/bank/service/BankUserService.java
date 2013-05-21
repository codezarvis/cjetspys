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
public interface BankUserService {

	
	void create(BankUser bankUser);
	
	List<BankUser> getAll();
}
