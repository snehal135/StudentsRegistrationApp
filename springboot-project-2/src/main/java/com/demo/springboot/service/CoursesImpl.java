package com.demo.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.springboot.entity.Courses;
import com.demo.springboot.entity.FullTimeCourse;
import com.demo.springboot.entity.PartTimeCourse;
import com.demo.springboot.repository.FullTimeRepository;
import com.demo.springboot.repository.PartTimRepository;

@Service
public class CoursesImpl implements CourseService{

	
	@Autowired
	private FullTimeRepository  fullTimerepo;
	
	@Autowired
	private PartTimRepository  partTimerepo;

	
	@Override
	public Courses save(PartTimeCourse ptcourse) {
		return partTimerepo.save(ptcourse);
	}

	@Override
	public Courses save(FullTimeCourse ptcourse) {
		return fullTimerepo.save(ptcourse);
	}

}
