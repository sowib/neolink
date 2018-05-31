package com.sow.java.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.DoubleStream;

import com.sow.java.dao.AccountDao;
import com.sow.java.dao.UserAccountsDao;
import com.sow.java.model.Account;

public class AccountService {
	AccountDao accountDao = new AccountDao();
	UserAccountsDao userAccountsDao = new UserAccountsDao();
	
	public void add(Account account) {
		accountDao.add(account);
	}
	
	public void delete(final Long number) {
		accountDao.delete(number);
	}
	
	public void delete(Account account) {
		accountDao.delete(account);
	}
	
	public Account getAccount(Long number) {
		return accountDao.get(number);
	}
	
	public List<Account> getAccounts(){
		return accountDao.getAll();
	}
	
	public void withdraw(Long number, double value) {
		accountDao.get(number).getOperations().add(- value);
		accountDao.get(number).setBalance(accountDao.get(number).getBalance() - value);
	}
	
	
	public void deposit(Long number, double value) {
		accountDao.get(number).getOperations().add(value);
		accountDao.get(number).setBalance(accountDao.get(number).getBalance() + value);
	}
	
	public List<Account> getAllAccountByUser(Long userId) {
		List<Account> accounts = new ArrayList<Account>();
		for(Long accountNumber : userAccountsDao.getAllAccountByUserId(userId)) {
			accounts.add(accountDao.get(accountNumber));
		}
		
		return accounts;
	}
	
	public double getSumBalancesAllAccountsByUser(Long userId) {
		List<Account> accounts = getAllAccountByUser(userId);
		double sum = accounts.stream().flatMapToDouble(account -> DoubleStream.of(account.getBalance())).sum();
		
		return sum;
	}
	
	public void addAccountToUser(Long accountNumber, Long userId) {
		userAccountsDao.add(userId, accountNumber);
	}
	
	public void deleteAccountToUser(Long accountNumber, Long userId) {
		userAccountsDao.delete(userId, accountNumber);
	}
}
