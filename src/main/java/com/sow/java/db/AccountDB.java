package com.sow.java.db;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.sow.java.model.Account;

public class AccountDB {
	public static List<Account> accounts;
	
	static {
		accounts = new ArrayList<Account>();
		
		//For get one account
		accounts.add(new Account(1L, 200, LocalDate.of(2017, 02, 10), new ArrayList<Double>()));
		
		//For withdraw
		accounts.add(new Account(2L, 300, LocalDate.of(2017, 10, 10), new ArrayList<Double>()));
		
		//For deposit
		accounts.add(new Account(3L, 500, LocalDate.of(2016, 04, 15), new ArrayList<Double>()));
		accounts.add(new Account(4L, 350, LocalDate.of(2016, 07, 18), new ArrayList<Double>()));
		accounts.add(new Account(5L, 100, LocalDate.of(2017, 07, 18), new ArrayList<Double>()));
		
		//For Get All accounts by user
		accounts.add(new Account(6L, 200, LocalDate.of(2015, 05, 15), new ArrayList<Double>()));
		accounts.add(new Account(7L, 100, LocalDate.of(2017, 07, 17), new ArrayList<Double>()));
		
		//AccountManagerService
		//accountWithdraw
		accounts.add(new Account(10L, 200, LocalDate.of(2015, 05, 15), new ArrayList<Double>()));
		
		//accountDeposit
		accounts.add(new Account(11L, 100, LocalDate.of(2017, 07, 17), new ArrayList<Double>()));
		
		//For Get All accounts by user
		accounts.add(new Account(12L, 200, LocalDate.of(2015, 05, 15), new ArrayList<Double>()));
		accounts.add(new Account(13L, 100, LocalDate.of(2017, 07, 17), new ArrayList<Double>()));
		accounts.add(new Account(14L, 300, LocalDate.of(2017, 07, 17), new ArrayList<Double>()));
				
	}
	
	public AccountDB() {
	}
}
