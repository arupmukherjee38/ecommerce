package com.tcs.library.ecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.library.ecommerce.model.UserData;
import com.tcs.library.ecommerce.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	private UserService userService;

	@PostMapping
	public UserData createUser(@RequestBody UserData user) {
		return userService.saveUser(user);
	}
	
	@GetMapping("/{userId}")
	public UserData createUser(@PathVariable Long userId) {
		return userService.getUser(userId);
	}
	
	
	
}
