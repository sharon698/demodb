package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController("api/v1")
public class ApiClass {

	@GetMapping("/allstudents")
	public void getAllStudents() {
		
	}
	
	@GetMapping("/student{id}")
	public void getOneStudent(@RequestParam String id) {
		
	}
}
