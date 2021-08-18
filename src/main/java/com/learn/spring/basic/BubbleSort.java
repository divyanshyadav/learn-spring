package com.learn.spring.basic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("bubble")
@Primary
public class BubbleSort implements SortAlgorithm {

	public int[] sort(int[] arr) {
		return arr;
	}
}
