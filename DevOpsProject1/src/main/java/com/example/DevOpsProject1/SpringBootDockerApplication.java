package com.example.DevOpsProject1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SpringBootDockerApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringBootDockerApplication.class, args);
	}
}

@RestController
@RequestMapping("/")
class HelloController {
	@GetMapping
	public String home() {
		return "Hello, this is a Spring Boot web application running inside a Docker container!";
	}
}
