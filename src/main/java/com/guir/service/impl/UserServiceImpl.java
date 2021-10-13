package com.guir.service.impl;

import com.guir.dao.UserDao;
import com.guir.pojo.User;
import com.guir.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Description：
 * Author: Guir
 * Create: 2021/10/13 2:19
 **/

@Service
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;

	@Override
	public List<User> finAll() {
		return userDao.findAll();
	}

	@Override
	public User findOne(int id) {
		return userDao.findById(id).orElse(null);
	}

	@Override
	public void update(User user) {
		userDao.save(user);
	}
}
