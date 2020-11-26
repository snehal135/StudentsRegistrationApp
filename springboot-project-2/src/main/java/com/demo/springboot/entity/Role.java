package com.demo.springboot.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="role")
public class Role {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	
	
	
	public Role() {
		
	}
	
	public Role(String name) {
		// TODO Auto-generated constructor stub
		this.name=name;
	}
	/*
	 * public Role(long id, String name) { super(); this.id = id; this.name = name;
	 * }
	 */
	public long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	

}
