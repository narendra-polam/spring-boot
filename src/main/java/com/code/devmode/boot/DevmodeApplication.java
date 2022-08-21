package com.code.devmode.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@ComponentScan("com.code.devmode")

@SpringBootApplication
public class DevmodeApplication {

	public static void main(String[] args) {
		SpringApplication.run(DevmodeApplication.class, args);
	}
}
