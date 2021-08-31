package com.learn.spring.scope;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.learn.spring.basic.BinarySearchImpl;

@Configuration
@ComponentScan("com.learn.spring.basic") // search components in the given package
@ComponentScan("com.learn.spring.scope")
public class Application {

	private static Logger LOGGER = LoggerFactory.getLogger(Application.class);
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = 
				new AnnotationConfigApplicationContext(Application.class);
		
		PersonDAO person1 = applicationContext.getBean(PersonDAO.class);
		PersonDAO person2 = applicationContext.getBean(PersonDAO.class);
		BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
		
		LOGGER.info("Person1: {} {}", person1, person1.getJdbcConnection());
		LOGGER.info("Person2: {} {}", person2, person2.getJdbcConnection());
		LOGGER.info("BinarySearch: {}", binarySearch);
		
		applicationContext.close();
	}
}
