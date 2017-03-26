package com.ar.test.gmail;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@EnableConfigurationProperties
@SpringBootApplication
public class GmailTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(GmailTestApplication.class, args);
	}
}
