package com.example.cicd;

import java.net.UnknownHostException;

import org.springframework.beans.factory.annotation.Value;
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

	@Value("${HOSTNAME:unknown}")
    private String podName;

    @GetMapping("/getMessage")
    public String getMessage() throws UnknownHostException {

        // Problem 1: Exposes internal infrastructure details
        // Pod name reveals deployment, replica, scaling info
        return "Response from pod..... " + podName;
    }
}
