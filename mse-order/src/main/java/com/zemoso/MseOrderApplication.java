package com.zemoso;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class MseOrderApplication {

	public static void main(String[] args) {
		SpringApplication.run(MseOrderApplication.class, args);
	}
}
