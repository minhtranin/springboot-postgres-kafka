package com.javatechie.spring.boot.docker.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = { "com.javatechie.spring.boot.docker.demo.controller",
		"com.javatechie.spring.boot.docker.demo.model", "com.javatechie.spring.boot.docker.demo.service",
		"com.javatechie.spring.boot.docker.demo.repository" })
public class SpringBootDockerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDockerApplication.class, args);

	}

}
