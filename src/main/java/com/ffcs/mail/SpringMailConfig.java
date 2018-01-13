package com.ffcs.mail;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.MailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;

import java.util.Properties;

/**
 * @author lihf
 * @version 1.0
 * @address 邮政
 */
@Configuration
public class SpringMailConfig {
    @Bean
    public MailSender getJavaMailSender() {
        JavaMailSenderImpl sender = new JavaMailSenderImpl();
        sender.setPort(465);
        sender.setHost("smtp.qq.com");
        sender.setUsername("************");
        sender.setPassword("***********");//授权码
        sender.setJavaMailProperties(properties());
        return sender;
    }

    @Bean()
    public Properties properties() {
        Properties properties = new Properties();
        properties.put("mail.smtp.auth", "true");//必须写成字符串的形式
        properties.put("mail.smtp.ssl.enable", true);
        properties.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        properties.put("mail.smtp.timeout", 25000);
        return properties;

    }

    @Bean(name="test")
    public Main main() {
        return new Main((JavaMailSenderImpl) getJavaMailSender());
    }
}
