package org.java.spring.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;

@org.springframework.boot.autoconfigure.SpringBootApplication
public class SpringBootApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(SpringBootApplication.class, args);
		Customers customers = context.getBean(Customers.class);
		System.out.println(customers);
	}

}
