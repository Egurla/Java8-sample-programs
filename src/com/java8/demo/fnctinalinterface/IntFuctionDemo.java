package com.java8.demo.fnctinalinterface;

import java.util.function.BiFunction;
import java.util.function.IntFunction;

public class IntFuctionDemo {
	public static void main(String[] args) {

		
		//Parameters: This method takes in one parameter value which is an int-valued argument. 
		//Returns: This method returns a value of type R.
		
		IntFunction<Double> ob = x -> x / 2.0;
		System.out.println(ob.apply(3));
		
		
       // two arguments and returns R type
		BiFunction<Integer, Integer, Integer> result = (a, b) -> a + b;
		BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;

		// apply()
		System.out.println("Sum = " + add.apply(2, 3));

		// Using addThen() method
		// It returns a composed function wherein the parameterized function
		// will be executed after the first one.
		result = result.andThen(a -> 2 * a);
		System.out.println("Composite1 = " + result.apply(2, 3));
		BiFunction<Integer, Integer, Integer> bifunction = (a, b) -> a * b;

		bifunction = bifunction.andThen(a -> 3 * a);
		System.out.println("Composite2 = " + bifunction.apply(2, 3));
	}

}
