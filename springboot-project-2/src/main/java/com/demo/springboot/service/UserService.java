package com.demo.springboot.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.demo.springboot.entity.User;
import com.demo.springboot.web.dto.UserRegistration;

public interface UserService extends UserDetailsService {
	
	User save(UserRegistration registration);

}
