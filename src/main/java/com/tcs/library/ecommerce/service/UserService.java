package com.tcs.library.ecommerce.service;

import com.tcs.library.ecommerce.model.UserData;

public interface UserService {

	 public UserData saveUser(UserData user);
	 
	 public UserData getUser(Long id);
}
