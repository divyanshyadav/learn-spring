package com.learn.spring.cdi;

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
		
		SomeCdiBusiness business = applicationContext.getBean(SomeCdiBusiness.class);
		LOGGER.info("{}", business);
	}
}
