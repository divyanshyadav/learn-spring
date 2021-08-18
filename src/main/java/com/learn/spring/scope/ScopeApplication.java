package com.learn.spring.scope;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.learn.spring.basic.BinarySearchImpl;

@SpringBootApplication
@ComponentScan("com.learn.spring.basic") // search components in the given package
@ComponentScan("com.learn.spring.scope")
public class ScopeApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(ScopeApplication.class);
	
	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = 
				SpringApplication.run(ScopeApplication.class, args);
		
		PersonDAO person1 = applicationContext.getBean(PersonDAO.class);
		PersonDAO person2 = applicationContext.getBean(PersonDAO.class);
		BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
		
		LOGGER.info("Person1: {} {}", person1, person1.getJdbcConnection());
		LOGGER.info("Person2: {} {}", person2, person2.getJdbcConnection());
		LOGGER.info("BinarySearch: {}", binarySearch);
	}
}
