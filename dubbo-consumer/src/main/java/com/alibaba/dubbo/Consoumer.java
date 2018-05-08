package com.alibaba.dubbo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class Consoumer
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("consumer.xml");
        context.start();
        System.out.println("Consumer start...");
        DemoService demoService = context.getBean(DemoService.class);
        System.out.println(demoService.getPermissons(1L));

    }
}
