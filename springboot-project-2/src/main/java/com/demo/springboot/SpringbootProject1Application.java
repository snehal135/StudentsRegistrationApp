package com.demo.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ConfigurableApplicationContext;

import com.demo.springboot.entity.Courses;
import com.demo.springboot.entity.FullTimeCourse;
import com.demo.springboot.entity.PartTimeCourse;
import com.demo.springboot.repository.CoursesRepository;
import com.demo.springboot.repository.FullTimeRepository;
import com.demo.springboot.repository.PartTimRepository;



@SpringBootApplication
public class SpringbootProject1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext configurableApplicationContext =SpringApplication.run(SpringbootProject1Application.class, args);
	
		/*
		 * CoursesRepository
		 * fullTimeRepo=configurableApplicationContext.getBean(FullTimeRepository.class)
		 * ;
		 * 
		 * CoursesRepository
		 * partTimeRepo=configurableApplicationContext.getBean(PartTimRepository.class);
		 * 
		 * //public PartTimeCourse(String courseName, Integer duration, Double
		 * fees,String modeOfStudy) { // public FullTimeCourse(String courseName,
		 * Integer duration, Double fees,Double hostelFees) {
		 * 
		 * 
		 * Courses fullTime=new FullTimeCourse("Machine Learning", 12,10000.00,2000.0);
		 * Courses partTime=new
		 * PartTimeCourse("Environment Engineering",6,2000.0,"Online");
		 * 
		 * fullTimeRepo.save(fullTime); partTimeRepo.save(partTime);
		 */	}

}
