package com.learn.spring.cdi;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {
	private static Logger LOGGER = LoggerFactory.getLogger(Application.class);
	public static void main(String[] args) {
				
		ConfigurableApplicationContext applicationContext = SpringApplication.run(Application.class, args);
		
		SomeCdiBusiness business = applicationContext.getBean(SomeCdiBusiness.class);
		LOGGER.info("{}", business);
	}
}
