package com.sow.java.dao;

import java.util.List;

import com.sow.java.db.UserDB;
import com.sow.java.model.User;

public class UserDao {
	
	public void add(User user) {
		UserDB.users.add(user);
	}
	
	public void delete(final Long id) {
		UserDB.users.removeIf((User user) -> user.getId().equals(id));
	}
	
	public void delete(User user) {
		UserDB.users.removeIf((User userLocal) -> userLocal.getId().equals(user.getId()));
	}
	
	public User get(Long id) {
		return UserDB.users.stream().filter(user -> user.getId().equals(id)).findFirst().get();
	}
	
	public List<User> getAll(){
		return UserDB.users;
	}
}
