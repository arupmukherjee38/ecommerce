package com.tcs.library.ecommerce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tcs.library.ecommerce.model.UserData;
import com.tcs.library.ecommerce.repository.UserDataRepository;
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDataRepository userRepository;

	@Override
	public UserData saveUser(UserData user) {
		return userRepository.save(user);
	}

	@Override
	public UserData getUser(Long id) {
		return userRepository.findById(id).orElse(null);
	}

}
