package org.java.beans;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

    public static void main(String... s){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("employeebean.xml");
        Employee e1 = context.getBean("employee",Employee.class);

        System.out.println(e1);

        context.close();

    }

}
