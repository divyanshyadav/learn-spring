package com.learn.spring.basic;

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

		BinarySearchImpl bean1 = applicationContext.getBean(BinarySearchImpl.class);
		LOGGER.info("Bean1 {}", bean1);
		BinarySearchImpl bean2 = applicationContext.getBean(BinarySearchImpl.class);
		LOGGER.info("Bean2 {}", bean2);
	}
}
