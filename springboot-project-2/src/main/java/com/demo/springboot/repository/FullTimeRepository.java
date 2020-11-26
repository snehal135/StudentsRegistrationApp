package com.demo.springboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.demo.springboot.entity.FullTimeCourse;

@Repository
public interface FullTimeRepository extends CoursesRepository{
	/*
	 * @Query("select * from courses") List list(FullTimeCourse course);
	 */
}
