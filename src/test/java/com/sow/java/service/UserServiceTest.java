package com.sow.java.service;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.sow.java.model.User;

import junit.framework.Assert;

public class UserServiceTest {
	
	private UserService userService;
	
	private User user1;
	
	@Before
	public void setUp() throws Exception {
		userService = new UserService();
		
		user1 = new User(8L, "Hanani", "Hanna", 47, "Adresse 8", "0748457877");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAdd() {
		userService.add(user1);
		Assert.assertTrue(userService.getUsers().contains(user1));
	}

	@Test
	public void testDelete() {
		userService.delete(8L);
		Assert.assertFalse(userService.getUsers().contains(user1));
	}
	
	@Test
	public void testGetUser() {
		User userLocal = userService.getUser(1L);
		Assert.assertEquals(new Long(1L), userLocal.getId());
	}
	
	@Test
	public void testGetUsers() {
		Assert.assertEquals(4, userService.getUsers().stream().count());
	}

}
