package com.keysoft.bugtracker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableJpaRepositories("com.keysoft.bugtracker.repositories")
@EntityScan("com.keysoft.bugtracker")
@ComponentScan("com.keysoft")
public class ApplicationCatalogApplication {

	public static void main(String... args) {
		SpringApplication.run(ApplicationCatalogApplication.class, args);

	}
}
