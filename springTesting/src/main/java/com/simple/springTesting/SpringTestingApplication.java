package com.simple.springTesting;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringTestingApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringTestingApplication.class, args);
		System.out.println("서버 시작됨...");
	}
}
