package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HomeController {
	
	@GetMapping("/")
	public String showHomePage() {
		
		System.out.println("in Home Page");
		
		return "home";
	}

}
