package com.bank.tests;

import java.util.ArrayList;
import java.util.List;

import com.bank.app.domain.BankUser;
import com.bank.domain.BankUserImpl;
import com.bank.service.BankUserService;
import com.bank.utils.service.ServiceUtils;

public class BankEmployeeTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 
		BankUser bankUser = null;		
		BankUserService bankUserService = null;
		
		/*try {
			
			bankUser =  new BankUserImpl();
			bankUser.setUserName("aaa");
			bankUser.setPassword("aaa");
			bankUser.setUserRole("Manager");
			
			bankUserService = ServiceUtils.getBankUserService();
			bankUserService.create(bankUser);
			
		} catch (Exception e) {
			e.printStackTrace();
		}*/
		
		List<BankUser> list = null;
		try {
			bankUserService = ServiceUtils.getBankUserService();
			
			list = bankUserService.getAll();
			
			for(int i = 1; i < list.size() ; i++){
				
				BankUser user = list.get(i);
				
				System.out.println("Name :"+user.getUserName()+"\t"+"Password :"+user.getPassword()+"\t"+"Role :"+user.getUserRole());

			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		

	}

}
