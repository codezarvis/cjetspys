package com.bank.service.impl;

import java.util.List;

import com.bank.app.domain.BankUser;
import com.bank.service.BankUserService;

public class BankUserServiceImpl implements BankUserService {

	private static BankUserServiceImpl bankUserServiceImpl = new BankUserServiceImpl();

	public static BankUserService getInstance() {
		return bankUserServiceImpl;
	}

	private BankUserServiceImpl() {

	}

	public void create(BankUser bankUser) {
		// To do

	}

	public List<BankUser> getAll() {
		// to do
		return null;
	}


	@Override
	public BankUser authenticate(String username, String password) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public BankUser findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
