package com.guir.service;

import com.guir.pojo.User;

import java.util.List;

public interface UserService {
	List<User> finAll();
	User findOne(int id);
	void update(User user);
}
