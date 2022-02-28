package org.java.spring.aspectj.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String... a) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("annotations.xml");

        Operation operation = (Operation) applicationContext.getBean("opBean");
        System.out.println("Calling msg");
        operation.msg();
        System.out.println("Calling m");
        operation.m();
        System.out.println("Calling k");
        operation.k();

    }
}
