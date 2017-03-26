package com.ar.test.gmail.configuration;

import java.util.Properties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;

@Configuration
public class MailConfiguration {

	@Bean
	public JavaMailSenderImpl javamailSender() {
		
		JavaMailSenderImpl sender = new JavaMailSenderImpl();
		
		sender.setHost("smtp.gmail.com");
		sender.setPort(587);
		sender.setUsername("your.user.name");
		sender.setPassword("your.password");
		
		Properties properties = new Properties();
		properties.setProperty("mail.smtp.auth", "true");
		properties.setProperty("mail.smtp.starttls.enable", "true");
		properties.setProperty("mail.smtp.connecttimeout", "5000");
		properties.setProperty("mail.smtp.timeout", "3000");
		properties.setProperty("mail.smtp.writetimeout", "5000");
		
		sender.setJavaMailProperties(properties);
		
		return sender;
	}
	
	@Bean
	public SimpleMailMessage simpleMailMessage() {
		
		SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
		
		simpleMailMessage.setFrom("your.user.name@gmail.com");
		simpleMailMessage.setTo("your.target.client@gmail.com");
		simpleMailMessage.setSubject("This is a test.");
		simpleMailMessage.setText("This is a notice.");
		
		return simpleMailMessage;
	}
	
}
