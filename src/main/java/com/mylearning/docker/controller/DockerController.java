package com.mylearning.docker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/dockerApi")
@RestController
public class DockerController {

	@GetMapping("/message")
	public String getMessage() {
		
		return "Hello Message from Docker";
	}
}
