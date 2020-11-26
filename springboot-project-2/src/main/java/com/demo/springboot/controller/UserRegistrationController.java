package com.demo.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.demo.springboot.service.UserService;
import com.demo.springboot.web.dto.UserRegistration;

@Controller
@RequestMapping("/registration")
public class UserRegistrationController {
	
	
	private UserService userService;

	public UserRegistrationController(UserService userService) {
		super();
		this.userService = userService;
	}
	
	
	/*
	 * @ModelAttribute("user") public UserRegistration registration() { return new
	 * UserRegistration(); }
	 */	
	
	@GetMapping
	public String showRegistrationForm(Model model) {
		
		model.addAttribute("user", new UserRegistration());
		return "registration";
	}
	
	@PostMapping
	public String registerUserAccount(@ModelAttribute("user") UserRegistration registration) {
		
		userService.save(registration);
		
		return "redirect:/registration?success";
		
	}
	
	

}
