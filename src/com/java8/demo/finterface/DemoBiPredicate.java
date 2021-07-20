package com.java8.demo.finterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class DemoBiPredicate {

	public static void main(String[] args) {
		BiPredicate<String, Integer> filter = (x, y) -> {
			return x.length() == y;
		};

		boolean result = filter.test("Egurla", 6);
		System.out.println(result); // true

		boolean result2 = filter.test("kumar", 10);
		System.out.println(result2); // false

		BiPredicate<Integer, Integer> bip1 = (n1, n2) -> (n1 % n2 == 0);
		BiPredicate<Integer, Integer> bip2 = (n1, n2) -> (n1 * n2 > 100);

		System.out.println(bip1.and(bip2).test(120, 6));
		
		
		BiPredicate<String, String> bp1 = (s1, s2) -> s1.startsWith(s2);
	    BiPredicate<String, String> bp2 = (s1, s2) -> s1.endsWith(s2);
	    System.out.println(bp1.and(bp2).test("egurla", "e"));
	}
}
