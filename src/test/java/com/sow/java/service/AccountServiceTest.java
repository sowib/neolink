package com.sow.java.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.sow.java.model.Account;
import com.sow.java.service.AccountService;

import junit.framework.Assert;

public class AccountServiceTest {
	private AccountService accountService;
	
	private Account account1;
	
	@Before
	public void setUp() throws Exception {
		accountService = new AccountService();
		
		account1 = new Account(88L, 700, LocalDate.of(2018, 11, 25), new ArrayList<Double>());
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAdd() {
		accountService.add(account1);
		Assert.assertTrue(accountService.getAccounts().contains(account1));
	}

	@Test
	public void testDelete() {
		accountService.delete(8L);
		Assert.assertFalse(accountService.getAccounts().contains(account1));
	}
	
	@Test
	public void testGetUser() {
		Account accountLocal = accountService.getAccount(1L);
		Assert.assertEquals(new Long(1L), accountLocal.getNumber());
	}
	
	@Test
	public void testGetUsers() {
		Assert.assertEquals(12, accountService.getAccounts().stream().count());
	}

	@Test
	public void testWithdraw() {
		accountService.withdraw(2L, 100d);
		Assert.assertEquals(200d, accountService.getAccount(2L).getBalance());
	}
	
	@Test
	public void testDeposit() {
		accountService.deposit(3L, 100d);
		Assert.assertEquals(600d, accountService.getAccount(3L).getBalance());
	}
	
	@Test
	public void testGetAllAccountByUser() {
		List<Account> accounts = accountService.getAllAccountByUser(4L);
		
		Assert.assertEquals(2, accounts.size());
		Assert.assertTrue(accounts.contains(accountService.getAccount(6L)));
		Assert.assertTrue(accounts.contains(accountService.getAccount(7L)));
	}
	
	public void testGetSumBalancesAllAccountsByUser() {
		Assert.assertEquals(300d, accountService.getSumBalancesAllAccountsByUser(4L));
	}
	
	@Test
	public void testAddAccountToUser() {
		accountService.addAccountToUser(5L, 2L);
		Assert.assertTrue(accountService.getAllAccountByUser(2L).contains(accountService.getAccount(5L)));
	}
	
	@Test
	public void testDeleteAccountToUser() {
		accountService.deleteAccountToUser(5L, 2L);
		Assert.assertFalse(accountService.getAllAccountByUser(2L).contains(accountService.getAccount(5L)));
	}
	
	
}
