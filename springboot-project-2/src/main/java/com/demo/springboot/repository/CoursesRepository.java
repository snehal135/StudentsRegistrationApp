package com.demo.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
import com.demo.springboot.entity.Courses;

@NoRepositoryBean
public interface CoursesRepository extends JpaRepository<Courses,Long> {

	
}
