package com.instructormanagement.instructorapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan
public class InstructorapplicationApplication {

	public static void main(String[] args) {
		SpringApplication.run(InstructorapplicationApplication.class, args);
	}

}
