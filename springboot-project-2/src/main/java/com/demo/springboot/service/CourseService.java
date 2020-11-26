package com.demo.springboot.service;

import com.demo.springboot.entity.Courses;
import com.demo.springboot.entity.FullTimeCourse;
import com.demo.springboot.entity.PartTimeCourse;

public interface CourseService {

	Courses save(PartTimeCourse ptcourse);
	Courses save(FullTimeCourse ptcourse);

}
