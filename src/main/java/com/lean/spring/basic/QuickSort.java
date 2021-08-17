package com.lean.spring.basic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("quick")
public class QuickSort implements SortAlgorithm {
	public int[] sort(int[] arr) {
		return arr;
	}
}
