package com.java8.demo.lamdaex;


import java.util.Arrays;
import java.util.List;


public class DemoLamdaExpression {

	public static void main(String[] args) {

		// adding 2 numbers
		Arthemetic addition = (int a, int b) -> (a + b);
		System.out.println(addition.operation(5, 20));

		// Subtraction
		Arthemetic subtraction = (int a, int b) -> (a - b);
		// Arithmetic addition = (int a, int b) -> {return a - b;};
		System.out.println(subtraction.operation(5, 3));

		///printing even numbers
		LamdaExpressionTest evenOdd = (int a) -> {
			if (a % 2 == 0) {
				System.out.println("Number " + a + " is even.");
			} else {
				System.out.println("Number " + a + " is odd.");
			}
		};

		evenOdd.check(5);
		evenOdd.check(8);
		
		//to check even or not
		int arr[] = {2,3,4,56,8,9,88,45,34,24,43,57};
		Arrays.stream(arr).filter(i->i%2==0).forEach(System.out::println);
		
		System.out.println("List even numbers");
		Integer[] tihNumbers = {11,12,22,15,86,55,33,64};
		List<Integer> numberList = Arrays.asList(tihNumbers);

		numberList.stream().filter(n -> n%2!=0).forEach(System.out::println);
			
	}
}
