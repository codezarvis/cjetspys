package com.bank.tests;

import com.bank.domain.BankEmployee;

public class BankEmployeeTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 
		BankEmployee bankEmployee = new BankEmployee();
		bankEmployee.setEmployeeId(101);
		bankEmployee.setEmployeeName("priyanka");
		bankEmployee.setSalary(300);
		System.out.println(bankEmployee.getEmployeeId()+"\t"+bankEmployee.getEmployeeName()+"\t"+bankEmployee.getSalary()+"\n");
		

	}

}
