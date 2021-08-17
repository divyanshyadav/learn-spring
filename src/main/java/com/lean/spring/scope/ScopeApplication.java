package com.lean.spring.scope;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ScopeApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(ScopeApplication.class);
	
	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = 
				SpringApplication.run(ScopeApplication.class, args);
		
		PersonDAO person1 = applicationContext.getBean(PersonDAO.class);
		PersonDAO person2 = applicationContext.getBean(PersonDAO.class);
		
		LOGGER.info("Person1: {}", person1);
		LOGGER.info("Person1 JDBC: {}", person1.getJdbcConnection());
		
		LOGGER.info("Person2: {}", person2);
		LOGGER.info("Person2 JDBC: {}", person2.getJdbcConnection());
	}
}
