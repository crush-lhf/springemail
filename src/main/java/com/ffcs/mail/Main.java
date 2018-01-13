package com.ffcs.mail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;

import java.util.Properties;

/**
 * @author lihf
 * @version 1.0
 * @address 邮政
 */
public class Main {

    private JavaMailSenderImpl email;

    private SimpleMailMessage message;

    //发送邮件
    public void send() {
        message = new SimpleMailMessage();
        message.setFrom("*********");
        message.setTo("***********");
        message.setSubject("spring 发送邮件功能");
        message.setText("我想你懂我的意思吧 求友杰");
        email.send(message);
    }

    Main(JavaMailSenderImpl javaMailSender ){
        this.email=javaMailSender;
        send();
    }

}