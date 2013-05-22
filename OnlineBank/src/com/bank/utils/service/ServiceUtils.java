/**
 * 
 */
package com.bank.utils.service;

import com.bank.service.AppUserService;
import com.bank.service.impl.AppUserServiceImpl;

/**
 * @author Sudarsan
 * 
 */
public class ServiceUtils {

	/**
	 * @return <code>AppUserService<code>
	 * Utility method for using AppUserService.
	 */
	public static AppUserService getAppUserService() {
		return AppUserServiceImpl.getInstance();
	}
}
