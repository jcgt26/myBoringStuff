package com.example.boring_stuff_boy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class BoringStuffBoyApplication {

	private static final Logger log = LoggerFactory.getLogger(BoringStuffBoyApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(BoringStuffBoyApplication.class, args);
	}

	@Bean
	ApplicationRunner init(Environment environment) {
		return args -> log.info(environment.getProperty("spring.profiles.active"));
	}
}
