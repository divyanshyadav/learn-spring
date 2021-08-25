package com.learn.spring.basic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class Application {
	private static Logger LOGGER = LoggerFactory.getLogger(Application.class);
	public static void main(String[] args) {
				
		ApplicationContext applicationContext = 
				new AnnotationConfigApplicationContext(Application.class);

		BinarySearchImpl bean1 = applicationContext.getBean(BinarySearchImpl.class);
		LOGGER.info("Bean1 {}", bean1);
		BinarySearchImpl bean2 = applicationContext.getBean(BinarySearchImpl.class);
		LOGGER.info("Bean2 {}", bean2);
	}
}
