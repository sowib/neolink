package com.sow.java.dao;

import java.util.List;

import com.sow.java.db.AccountDB;
import com.sow.java.model.Account;

public class AccountDao {
	public void add(Account account) {
		AccountDB.accounts.add(account);
	}
	
	public void delete(final Long number) {
		AccountDB.accounts.removeIf((Account accountLocal) -> accountLocal.getNumber().equals(number));
	}
	
	public void delete(Account account) {
		AccountDB.accounts.removeIf((Account accountLocal) -> accountLocal.getNumber().equals(account.getNumber()));
	}
	
	public Account get(Long number) {
		return AccountDB.accounts.stream().filter(account -> account.getNumber().equals(number)).findFirst().get();
	}
	
	public List<Account> getAll(){
		return AccountDB.accounts;
	}
}
