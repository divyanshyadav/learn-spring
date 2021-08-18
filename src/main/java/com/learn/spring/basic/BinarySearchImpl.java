package com.learn.spring.basic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class BinarySearchImpl {
	
	@Autowired
	@Qualifier("quick")
	private SortAlgorithm sortAlgo;

	BinarySearchImpl(SortAlgorithm sortAlgo) {
		super();
		this.sortAlgo = sortAlgo;
	}
	

	public int search(int[] arr, int target) {
		System.out.println(sortAlgo);
		sortAlgo.sort(arr);
		return 0;
	}
}
