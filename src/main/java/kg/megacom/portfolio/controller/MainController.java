package kg.megacom.portfolio.controller;

import kg.megacom.portfolio.config.EmailConfig;
import kg.megacom.portfolio.model.Feedback;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.ValidationException;

@RestController
public class MainController {

    private EmailConfig emailConfig;


    public MainController(EmailConfig emailConfig) {
        this.emailConfig = emailConfig;
    }


    @GetMapping("/")
    public String getHomePage(){
        return "index";
    }

//    @PostMapping("/index")
//    public void sendFeedback(@RequestBody Feedback feedback,
//                             BindingResult bindingResult) {
//        if (bindingResult.hasErrors()) {
//            throw new ValidationException("Feedback is not valid");
//        }
//
//        // Create a mail sender
//        JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
//        mailSender.setHost(this.emailConfig.getHost());
//        mailSender.setPort(this.emailConfig.getPort());
//        mailSender.setUsername(this.emailConfig.getUsername());
//        mailSender.setPassword(this.emailConfig.getPassword());
//
//        // Create an email instance
//        SimpleMailMessage mailMessage = new SimpleMailMessage();
//        mailMessage.setFrom(feedback.getEmail());
//        mailMessage.setTo("gejaf21262@rubygon.com");
//        mailMessage.setSubject("New feedback from - " + feedback.getName());
//        mailMessage.setText(feedback.getMessage());
//
//        // Send mail
//        mailSender.send(mailMessage);
//    }
}
