package com.bank.app.domain;

public interface BankUser {

	/**
	 * @return the employeeId
	 */
	int getEmployeeId();

	/**
	 * @param employeeId
	 *            the employeeId to set
	 */
	void setEmployeeId(int employeeId);

	/**
	 * @return the employeeName
	 */
	String getEmployeeName();

	/**
	 * @param employeeName
	 *            the employeeName to set
	 */
	void setEmployeeName(String employeeName);

	/**
	 * @return the salary
	 */
	double getSalary();

	/**
	 * @param salary
	 *            the salary to set
	 */
	void setSalary(double salary);

}