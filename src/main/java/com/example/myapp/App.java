package com.example.myapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {	ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//        Dev ob = context.getBean(Dev.class);
//    	ob.build();
    }
}
