package com.demo.springboot.entity;

import javax.persistence.Entity;

@Entity
public class PartTimeCourse extends Courses {
	
	
	private Long id;
		
	private Double percentage;
	
	
	public PartTimeCourse() {
		
	}

	public PartTimeCourse(String courseName, String duration, String name,Double percentage) {
		super(courseName, "1 year", name);
		this.percentage=percentage;
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Double getPercentage() {
		return percentage;
	}

	public void setPercentage(Double percentage) {
		this.percentage = percentage;
	}

		
	
	

}
