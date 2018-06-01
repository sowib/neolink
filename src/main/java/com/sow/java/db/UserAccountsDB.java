package com.sow.java.db;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserAccountsDB {
	public static Map<Long, List<Long>> userAccounts;
	
	static {
		userAccounts = new HashMap<Long, List<Long>>();
		
		userAccounts.put(1L, new ArrayList<Long>(Arrays.asList(1L, 2L)));
		userAccounts.put(2L, new ArrayList<Long>(Arrays.asList(3L)));
		userAccounts.put(3L, new ArrayList<Long>(Arrays.asList(4L)));
		
		//For Get All accounts by user
		userAccounts.put(4L, new ArrayList<Long>(Arrays.asList(6L, 7L)));
		
		//AccountManagerService
		userAccounts.put(5L, new ArrayList<Long>(Arrays.asList(12L, 13L, 14L)));
	}
	
	public UserAccountsDB() {
	}
}
