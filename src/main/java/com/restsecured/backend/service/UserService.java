package com.restsecured.backend.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.restsecured.backend.model.User;
import com.restsecured.backend.repositories.UserRepository;

@Service
public class UserService {

	@Resource
	private UserRepository urepo;

	public User save(User user) {
		return urepo.save(user);
	}

	public User getUser(String userName) {
		return urepo.findByUsername(userName);
	}
}
