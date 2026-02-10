package com.example.cicd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/msg")
public class SpringBootCicdApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootCicdApplication.class, args);
	}

	@GetMapping("/getMessage")
	public String getMessage() {
		int age = 21;
		return age > 19 ? "Congratulations to YOU! your age is eligible for vote" : "you are not eligible for vote";
	}
}
