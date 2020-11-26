package com.demo.springboot.entity;

import javax.persistence.Entity;

@Entity
public class FullTimeCourse extends Courses {

	private Long id;
	
	private Double ieltsScore;
	
	
	public FullTimeCourse() {
		
	}

	public FullTimeCourse(String courseName, String duration, String name,Double ieltsScore) {
		super(courseName, duration, name);
		this.ieltsScore=ieltsScore;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Double getIeltsScore() {
		return ieltsScore;
	}

	public void setIelstsScore(Double ieltsScore) {
		this.ieltsScore = ieltsScore;
	}

		
	
	/*
	 * public void setDuration(String duration) { this.duration = duration; }
	 * 
	 * public String getDuration() { return duration; }
	 */

	public void setIeltsScore(Double ieltsScore) {
		this.ieltsScore = ieltsScore;
	}

	
}
