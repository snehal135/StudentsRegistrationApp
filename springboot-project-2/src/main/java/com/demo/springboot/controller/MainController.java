package com.demo.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.demo.springboot.entity.Courses;
import com.demo.springboot.entity.FullTimeCourse;
import com.demo.springboot.entity.PartTimeCourse;
import com.demo.springboot.repository.CoursesRepository;
import com.demo.springboot.repository.FullTimeRepository;
import com.demo.springboot.repository.PartTimRepository;
import com.demo.springboot.service.CourseService;

@Controller
public class MainController {
		/*
		 * @Autowired private FullTimeRepository fullTimerepo;
		 * 
		 * @Autowired private PartTimRepository partTimerepo;
		 */
	@Autowired
	private CourseService courseService;
	
	@GetMapping("/login")
	public String login() {
		return "login";
	}
	
	@GetMapping("/showFormForPartTime")
	public String showFormForAdd(Model theModel) {
		
		//create model attribute to create form data
		Courses partTimeCourse=new PartTimeCourse();
		
		theModel.addAttribute("partTimeCourse", partTimeCourse);
		return "part-time";
	}
	
	/*
	 * @PostMapping("/save") public String saveEmployee(@ModelAttribute("employees")
	 * Employee theEmployee) {
	 * 
	 * empService.save(theEmployee); return "redirect:/employees/list"; }
	 */
	
	@GetMapping("/showFormForFullTime")
	public String showFormForPart(Model theModel) {
		
		//create model attribute to create form data
		Courses fullTimeCourse=new FullTimeCourse();
		
		theModel.addAttribute("fullTimeCourse", fullTimeCourse);
		return "full-time";
	}
	
	@GetMapping("/showForm")
	public String showForm() {
		
		//create model attribute to create form data
	//	Courses fullTimeCourse=new FullTimeCourse();
		
	//	theModel.addAttribute("fullTimeCourse", fullTimeCourse);
		return "index";
	}
	
	
	@PostMapping("/partTimeRegistration")
	public String savecourseDetails(@ModelAttribute("partTimeCourse") PartTimeCourse emp) {
		courseService.save(emp);
		
	//	partTimerepo.save("partTimeCourse");
		return "redirect:/showForm?success";
	}
	
	
	@PostMapping("/fullTimeRegistration")
	public String savefullTimecourseDetails(@ModelAttribute("fullTimeCourse") FullTimeCourse course) {
		//.save(course);
		courseService.save(course);
	//	fullTimerepo.list(course);
		return "redirect:/showForm?success";
	}
}
