package com.ffcs.mail;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author lihf
 * @version 1.0
 * @address 邮政
 */
public class ConfigutionTest {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringMailConfig.class);
        Main c = ctx.getBean("test", Main.class);
        System.out.println("" + c);

    }
}
