package com.test2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Test2Application {

	public static void main(String[] args) {
		int x=100;
		String name="kishan";
		System.out.println("Hello world");
		System.out.println("Welcome Prabhat");
		int x=200;
		String name="prabaht";
		SpringApplication.run(Test2Application.class, args);
	}

}
