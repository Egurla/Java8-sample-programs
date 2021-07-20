package com.java8.demo.functinalprograming;

import java.util.Arrays;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(11, 22, 33, 44, 55, 66, 77, 88, 99, 100);
		/*
		 * for (Integer n : numbers) { System.out.print(n + " "); }
		 */
		numbers.forEach(number -> System.out.print(number + " "));
	}
}
