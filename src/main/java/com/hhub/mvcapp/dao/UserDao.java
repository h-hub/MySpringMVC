package com.hhub.mvcapp.dao;

import java.util.List;

import com.hhub.mvcapp.model.User;

public interface UserDao {
	
	public void save(User p);
	
	public List<User> list();
}
