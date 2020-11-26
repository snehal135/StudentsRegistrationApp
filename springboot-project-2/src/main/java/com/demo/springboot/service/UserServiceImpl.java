package com.demo.springboot.service;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.demo.springboot.entity.Role;
import com.demo.springboot.entity.User;
import com.demo.springboot.repository.UserRepository;
import com.demo.springboot.web.dto.UserRegistration;

@Service
public class UserServiceImpl implements UserService {

	
	private UserRepository userRepository;
	
	
	 public UserServiceImpl(UserRepository userRepository) { 
		 this.userRepository=userRepository;
		 }
	 
	
	@Autowired
	private BCryptPasswordEncoder passwordEncoder;
	
	@Override
	public User save(UserRegistration registration) {
		// TODO Auto-generated method stub
		
		/*
		 * User user=new
		 * User(registration.getFirstName(),registration.getLastName(),registration.
		 * getEmail(), registration.getPassword(),Arrays.asList(new Role("ROLE_USER")));
		 */

		User user=new User(registration.getFirstName(),registration.getLastName(),registration.getEmail(),
				passwordEncoder.encode(registration.getPassword()),Arrays.asList(new Role("ROLE_USER")));
		
		
		return userRepository.save(user);
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user=userRepository.findByEmail(username);
		
		if(user==null) {
			throw new UsernameNotFoundException("Invalid user id or password");
		}
		
	      return new org.springframework.security.core.userdetails.User(user.getEmail(), user.getPassword(), mapRolesToAuthorities(user.getRoles()));
	    }

	private Collection<?extends GrantedAuthority> mapRolesToAuthorities(Collection<Role> roles){
		return roles.stream().map(role->new SimpleGrantedAuthority(role.getName())).collect(Collectors.toList());
		
	}
	    
	}