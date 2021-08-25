package com.learn.spring.basic;

//import javax.annotation.PostConstruct;
//import javax.annotation.PreDestroy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class BinarySearchImpl {
	
	private Logger logger = LoggerFactory.getLogger(BinarySearchImpl.class);
	
	@Autowired
	@Qualifier("quick")
	private SortAlgorithm sortAlgo;

	BinarySearchImpl(SortAlgorithm sortAlgo) {
		super();
		this.sortAlgo = sortAlgo;
		logger.info("construct");
	}
	

	public int search(int[] arr, int target) {
		sortAlgo.sort(arr);
		return 0;
	}
	
//	@PostConstruct
	void postConstruct() {
		logger.info("postConstruct");
	}
	
//	@PreDestroy
	void preDestroy() {
		logger.info("preDestroy");
	}
}
