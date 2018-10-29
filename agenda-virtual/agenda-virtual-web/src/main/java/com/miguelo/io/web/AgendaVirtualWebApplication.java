package com.miguelo.io.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.miguelo.io")
public class AgendaVirtualWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(AgendaVirtualWebApplication.class, args);
	}
}
