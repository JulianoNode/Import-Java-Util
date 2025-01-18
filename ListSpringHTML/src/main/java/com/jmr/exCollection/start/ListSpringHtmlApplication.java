package com.jmr.exCollection.start;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ListSpringHtmlApplication {

	public static void main(String[] args) {
		SpringApplication.run(ListSpringHtmlApplication.class, args);
		
		
		System.out.println("GET http://localhost:8080/produtos");
		System.out.println("PUT http://localhost:8080/produtos");
	}

}
