package com.example.Twintech;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;


import org.springframework.beans.factory.annotation.Autowired;

@Service
public class EmailService {

    @Autowired
    private JavaMailSender mailSender;

    public void sendContactMail(ContactRequest request) {
        try {
            SimpleMailMessage mail = new SimpleMailMessage();
            mail.setTo("twintechnologies25@gmail.com");
            mail.setSubject("New Contact Form Message");

            mail.setText(
                    "Name: " + request.getName() + "\n" +
                            "Company: " + request.getCompany() + "\n" +
                            "Phone: " + request.getPhone() + "\n" +
                            "Location: " + request.getLocation() + "\n\n" +
                            "Message:\n" + request.getMessage()
            );

            mailSender.send(mail);
            System.out.println("✅ MAIL SENT SUCCESSFULLY");

        } catch (Exception e) {
            System.out.println("❌ MAIL FAILED");
            e.printStackTrace();
            throw e;
        }
    }
}
