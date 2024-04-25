package com.ibge.api.application.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication (scanBasePackages = {"com.ibge"})
public class ApiIbgeApplication{

	public static void main(String[] args) {
		SpringApplication.run(ApiIbgeApplication.class, args);
	}

}
