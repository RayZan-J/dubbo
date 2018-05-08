package com.alibaba.dubbo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * dubbo
 * Created by nantian on 2018/5/8.
 */
public class Provider {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("provider.xml");
        System.out.println(context.getDisplayName()+" :here");
        context.start();
        System.out.println("Service start...");
        System.in.read();
    }
}
