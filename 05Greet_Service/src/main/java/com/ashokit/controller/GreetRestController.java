package com.ashokit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ashokit.client.WelcomeFeignClient;

@RestController
public class GreetRestController {
	
	@Autowired
	private WelcomeFeignClient welComeFeign;
	
	@GetMapping("/greet")
	public String greet() {
		String welcomeMsg = welComeFeign.GetWelcomeMsg() ;
		String greet = "good morning....";
		
		return  greet+welcomeMsg;
	}

}
