package com.vasudha.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	//Can have methods that map url requests
	@RequestMapping("/hello")
	public String sayHi(){
		return "Hi";
	}
	
	
}
