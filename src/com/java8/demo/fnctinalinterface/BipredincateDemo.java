package com.java8.demo.fnctinalinterface;

import java.util.function.BiPredicate;


//Represents a predicate (boolean-valued function) of two arguments
//bipredicate taking arguments and return boolean type true or false
public class BipredincateDemo {

	public static void main(String[] args) {

		BiPredicate<Integer, String> biPredicate = (x, y) -> {
			if (x == Integer.parseInt(y))
				return true;
			return false;
		};

		System.out.println(biPredicate.test(30, "30"));
		BiPredicate<Integer, String> biPredicate1 = (n, s) -> {
			if (n > Integer.parseInt(s))
				return true;
			return false;
		};

		// AND method
		BiPredicate<Integer, String> biPredicate2 = biPredicate.and(biPredicate1);
		System.out.println(biPredicate2.test(2, "3"));

		// OR method
		biPredicate2 = biPredicate.or(biPredicate1);
		System.out.println(biPredicate2.test(3, "2"));

		// Negate method
		biPredicate2 = biPredicate.negate();
		System.out.println(biPredicate2.test(3, "2"));
	}

}
