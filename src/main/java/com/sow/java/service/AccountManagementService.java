package com.sow.java.service;

import java.util.List;

import com.sow.java.model.Account;

public class AccountManagementService {
	
	AccountService accountService = new AccountService();
	
	public void accountWithdraw(Long number, double value) {
		accountService.withdraw(number, value);
	}
	
	public void accountDeposit(Long number, double value) {
		accountService.deposit(number, value);
	}
	
	public List<Account> getAllAccountByUser(Long userId){
		return accountService.getAllAccountByUser(userId);
	}
	
	public double getSumBalancesAllAccountsByUser(Long userId) {
		return accountService.getSumBalancesAllAccountsByUser(userId);
	}
}
