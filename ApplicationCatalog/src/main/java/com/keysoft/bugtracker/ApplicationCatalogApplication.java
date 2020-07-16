package com.keysoft.bugtracker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.keysoft.bugtracker.repositories")
public class ApplicationCatalogApplication {

	public static void main(String... args) {
		SpringApplication.run(ApplicationCatalogApplication.class, args);

	}
}
