/**
 * 
 */
package com.bank.utils.service;

import com.bank.service.BankUserService;
import com.bank.service.impl.BankUserServiceImpl;

/**
 * @author Sudarsan
 * 
 */
public class ServiceUtils {

	public static BankUserService getBankUserService() {
		return BankUserServiceImpl.getInstance();
	}
}
