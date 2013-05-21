package com.bank.tests;

import com.bank.app.domain.BankUser;
import com.bank.domain.BankUserImpl;

public class BankEmployeeTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 
		BankUser bankUser = new BankUserImpl();
		bankUser.setEmployeeId(101);
		bankUser.setEmployeeName("priyanka");
		bankUser.setSalary(300);
		System.out.println(bankUser.getEmployeeId()+"\t"+bankUser.getEmployeeName()+"\t"
		                  +bankUser.getSalary()+"\n");
		

	}

}
