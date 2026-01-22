package com.example.Twintech;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/contact")
@CrossOrigin(origins ="http://localhost:3000")
public class ContactController {

    @Autowired
    private EmailService emailService;

    @PostMapping("/send")
    public ResponseEntity<String> sendContact(@RequestBody ContactRequest request) {
        emailService.sendContactMail(request);
        return ResponseEntity.ok("Mail Sent Successfully");
    }
}
