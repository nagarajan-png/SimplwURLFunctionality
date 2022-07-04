package com.example.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/")
	public String index() {
		return "Greetings from Spring Boot!";
	}

	@GetMapping("hi")
	public String index2() {
		return "Greetings from Spring Boot! part 2 !! adding for a comment part !! added in dev branch now";
	}
	
}
