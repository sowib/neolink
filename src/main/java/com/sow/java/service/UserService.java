package com.sow.java.service;

import java.util.List;

import com.sow.java.dao.UserDao;
import com.sow.java.model.User;

public class UserService {
	
	UserDao userDao = new UserDao();
	
	public void add(User user) {
		userDao.add(user);
	}
	
	public void delete(final Long id) {
		userDao.delete(id);
	}
	
	public void delete(User user) {
		userDao.delete(user);
	}
	
	public User getUser(Long id) {
		return userDao.get(id);
	}
	
	public List<User> getUsers(){
		return userDao.getAll();
	}
}
