package com.sow.java.db;

import java.util.ArrayList;
import java.util.List;

import com.sow.java.model.User;

public class UserDB {
	public static List<User> users;
	
	static {
		users = new ArrayList<User>();
		users.add(new User(1L,"Franki", "Frank", 25, "adresse 1", "0744552169"));
		users.add(new User(2L, "Marki", "Mark", 55, "adresse 2", "0788995712"));
		users.add(new User(3L, "Jacki", "Jack", 65, "adresse 3", "0722143657"));
		
		//For Get All accounts by user
		users.add(new User(4L, "Maurice", "Test For Get All accounts By User", 65, "adresse 4", "0758962314"));
		
		//AccountManagerService
		//accountWithdraw
		users.add(new User(5L, "Marcus", "Test For accountWithdraw", 65, "adresse 4", "0758962314"));
	}
	
	public UserDB() {
		
	}
}
