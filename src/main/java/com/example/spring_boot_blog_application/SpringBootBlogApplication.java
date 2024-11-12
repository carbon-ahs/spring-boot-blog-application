package com.example.spring_boot_blog_application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootBlogApplication {

	public static void main(String[] args) {
		System.out.println("Hello Spring Boot Blog Application");
		SpringApplication.run(SpringBootBlogApplication.class, args);
	}

}
