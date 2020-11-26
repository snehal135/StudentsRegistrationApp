package com.demo.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.springboot.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
	
	User findByEmail(String email);

}
