package com.example.devops;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DevappApplication {

	public static void main(String[] args) {
		System.out.println("DevappApplication");
		SpringApplication.run(DevappApplication.class, args);
	}
}
