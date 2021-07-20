package com.java8.demo.fnctinalinterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class BiFunctionDemo {
	public static void main(String[] args) {
		/*
		 * BiFunction<Integer, Integer, Integer> biFunctionObj = new BiFunction<Integer,
		 * Integer, Integer>() {
		 * 
		 * @Override public Integer apply(Integer t, Integer u) { return (t + u); } };
		 * 
		 * System.out.println(biFunctionObj.apply(10, 20));
		 */

		// And with a lambda expression:
		BiFunction<Integer, Integer, Integer> biFunction = (t, u) -> (t + u);

		BiFunction<Integer, Integer, Integer> substraction = (t, u) -> (t - u);
		
		Function<Integer, Integer> function = (number) -> number * number;
		Integer integer = biFunction.andThen(function).apply(10, 20);
		System.out.println(integer);

		System.out.println(biFunction.apply(10, 20));
		System.out.println(substraction.apply(200, 100));
		
		
		 //Using andThen()
		BiFunction < Integer, Integer, Integer > function1 = (a, b) -> a + b;
        Function < Integer, Integer > function2 = (n) -> n * n;

        System.out.println(function1.andThen(function2).apply(3,3));
        System.out.println(function1.andThen(function2).apply(4, 5));
        
        
        
	}

}
