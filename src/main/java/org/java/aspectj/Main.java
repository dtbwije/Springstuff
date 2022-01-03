package org.java.aspectj;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
     public static void main(String... a){
          ApplicationContext applicationContext = new ClassPathXmlApplicationContext("customerservice.xml");
          CustomerService customerService = (CustomerService) applicationContext.getBean("customerServiceProxyForAll");
          System.out.println("BBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBB");
          customerService.printAge();
          System.out.println("BBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBB");
          customerService.printName();
          System.out.println("BBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBB");
          customerService.printURL();
     }
}
