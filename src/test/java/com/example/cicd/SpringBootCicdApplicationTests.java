package com.example.cicd;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBootCicdApplicationTests {

	@Autowired
	private SpringBootCicdApplication springBootCicdApplication;

	@Test
	void getMessageTest() {
		String response = springBootCicdApplication.getMessage();
		assertEquals("you are eligible for vote", response);
	}

}
