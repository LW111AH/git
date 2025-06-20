package com.lww.git;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitApplication {

	public static void main(String[] args) {
		System.out.println("hello git");
		System.out.println("pull test");
		SpringApplication.run(GitApplication.class, args);
	}

}
