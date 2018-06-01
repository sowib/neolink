package com.sow.java.service;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.sow.java.model.Account;
import com.sow.java.service.AccountManagementService;
import com.sow.java.service.AccountService;

import junit.framework.Assert;

public class AccountManagementServiceTest {
	
	private AccountManagementService accountManagementService;
	private AccountService accountService;
	
	@Before
	public void setUp() throws Exception {
		accountManagementService = new AccountManagementService();
		accountService = new AccountService();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAccountWithdraw() {
		accountManagementService.accountWithdraw(10L, 100);
		Assert.assertEquals(100d, accountService.getAccount(10L).getBalance());
	}
	
	@Test
	public void testAccountDeposit() {
		accountManagementService.accountDeposit(11L, 100);
		Assert.assertEquals(200d, accountService.getAccount(11L).getBalance());
	}
	
	@Test
	public void testGetAllAccountByUser() {
		List<Account> accounts = accountManagementService.getAllAccountByUser(5L);
		Assert.assertTrue(accounts.contains(accountService.getAccount(12L)));
		Assert.assertTrue(accounts.contains(accountService.getAccount(13L)));
		Assert.assertTrue(accounts.contains(accountService.getAccount(14L)));
	}
	
	@Test
	public void testGetSumBalancesAllAccountsByUser() {
		Assert.assertEquals(600d, accountManagementService.getSumBalancesAllAccountsByUser(5L));
	}

}
