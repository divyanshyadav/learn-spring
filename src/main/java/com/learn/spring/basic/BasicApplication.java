package com.learn.spring.basic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class BasicApplication {

	public static void main(String[] args) {
				
		ConfigurableApplicationContext applicationContext = SpringApplication.run(BasicApplication.class, args);

		BinarySearchImpl bean = applicationContext.getBean(BinarySearchImpl.class);
		System.out.println(bean);
		BinarySearchImpl bean2 = applicationContext.getBean(BinarySearchImpl.class);
		System.out.println(bean2);
		
	}

}
