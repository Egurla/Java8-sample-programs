package com.java8.demo.fnctinalinterface;

import java.util.function.DoubleToLongFunction;
import java.util.function.IntToDoubleFunction;
import java.util.function.ToIntFunction;

//It represents a function which takes in an argument of type T and produces an int-valued result.
//takes in one parameter value which is an argument of type T and returns an int-valued result.
public class PrimitiveFunctionalDemo {

	public static void main(String[] args) {
		ToIntFunction<Double> ob = a -> (int) (a * 10);
		// using applyAsInt()
		System.out.println(ob.applyAsInt(3.2));

		// applyAsDouble takes an int as input and do the conversion, return double
		// value of the integer.
		IntToDoubleFunction function = (n) -> (n / 10d);
		System.out.println(function.applyAsDouble(80));
		System.out.println(function.applyAsDouble(35));
		
		
		//applyAsLong takes an input as double and return value as lang
		DoubleToLongFunction function1 = (d) -> (long) d;
		System.out.println(function1.applyAsLong(45.50));
	}

}
