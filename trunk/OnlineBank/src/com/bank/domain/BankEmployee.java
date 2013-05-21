package com.bank.domain;

import com.bank.app.domain.BankUser;

/**
 * @author Sudarsan
 * 
 */
public class BankEmployee implements BankUser {

	private int employeeId;
	private String employeeName;
	private double salary;

	/* (non-Javadoc)
	 * @see com.bank.domain.BankUser#getEmployeeId()
	 */
	@Override
	public int getEmployeeId() {
		return employeeId;
	}

	/* (non-Javadoc)
	 * @see com.bank.domain.BankUser#setEmployeeId(int)
	 */
	@Override
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	/* (non-Javadoc)
	 * @see com.bank.domain.BankUser#getEmployeeName()
	 */
	@Override
	public String getEmployeeName() {
		return employeeName;
	}

	/* (non-Javadoc)
	 * @see com.bank.domain.BankUser#setEmployeeName(java.lang.String)
	 */
	@Override
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	/* (non-Javadoc)
	 * @see com.bank.domain.BankUser#getSalary()
	 */
	@Override
	public double getSalary() {
		return salary;
	}

	/* (non-Javadoc)
	 * @see com.bank.domain.BankUser#setSalary(double)
	 */
	@Override
	public void setSalary(double salary) {
		this.salary = salary;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("BankEmployee [employeeId=");
		builder.append(employeeId);
		builder.append(", employeeName=");
		builder.append(employeeName);
		builder.append(", salary=");
		builder.append(salary);
		builder.append("]");
		return builder.toString();
	}

}
