package com.adrainty.sample;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @author AdRainty
 * @version V1.0.0
 * @date 2023/3/28 2:02
 */
public class OrderApplication {

    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("order-consumer.xml");
        context.start();
        System.in.read();
    }
}
