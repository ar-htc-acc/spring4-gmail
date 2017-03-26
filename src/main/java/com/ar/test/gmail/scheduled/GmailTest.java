package com.ar.test.gmail.scheduled;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class GmailTest {

	@Autowired
	private JavaMailSender mailSender;
	
	@Autowired
	private SimpleMailMessage mailMessageTemplate;
	
	@Scheduled(initialDelay=1*1000, fixedRate=24*60*60*1000)
	public void test() {
		System.out.println("Spring boot + Gmail test.");
		
		try {
			mailSender.send(mailMessageTemplate);
			System.out.println("Mail sent!");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
