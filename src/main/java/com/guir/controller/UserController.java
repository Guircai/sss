package com.guir.controller;

import com.guir.pojo.User;
import com.guir.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Description：
 * 测速接口：
 * 			http://localhost:8080/user/findAll
 * 
 * Author: Guir
 * Create: 2021/10/13 2:27
 **/

@RestController
@RequestMapping(value = "/user")
public class UserController {
	@Autowired
	private UserService userService;

	@RequestMapping("/findAll")
	public List<User> findAll() {
		return userService.finAll();
	}

	// 使用restful接收id属性值restful风格：url:"user/findOne/10"
	@RequestMapping("/findOne/{id}")
	public User findOne(@PathVariable("id") Integer id) {
		return userService.findOne(id);
	}

	@RequestMapping("/update")
	public void update(@RequestBody User user) {
		userService.update(user);
	}
}
