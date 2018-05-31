package com.sow.java.dao;

import java.util.Arrays;
import java.util.List;

import com.sow.java.db.UserAccountsDB;

public class UserAccountsDao {
	
	public void add(Long userId, Long accountId) {
		if(UserAccountsDB.userAccounts.keySet().contains(userId)) {
			UserAccountsDB.userAccounts.get(userId).add(accountId);
		}else {
			UserAccountsDB.userAccounts.put(userId, Arrays.asList(accountId));
		}
	}
	
	public void delete(Long userId, Long accountId) {
		if(UserAccountsDB.userAccounts.keySet().contains(userId)) {
			UserAccountsDB.userAccounts.get(userId).removeIf((Long accountLocalId) -> accountLocalId.equals(accountId));
		}
	}
	
	public List<Long> getAllAccountByUserId(Long userId) {
		return UserAccountsDB.userAccounts.get(userId);
	}
}
