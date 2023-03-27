package com.adrainty.sample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @author AdRainty
 * @version V1.0.0
 * @date 2023/3/27 23:10
 */
public class UserApplication {

    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("user-provider.xml");
        context.start();
        System.in.read();
    }

}
