package com.java8.demo.finterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class DemoPredicate {
	public static void main(String[] args) {
		int arr[] = { 2, 3, 4, 56, 8, 9, 88, 45, 34, 24, 43, 57 };
		IntPredicate predicate = i -> i % 2 == 0;

		Arrays.stream(arr).filter(predicate).forEach(System.out::println);

		// printing numbers greterthan 3
		Predicate<Integer> numGreaterThan3 = x -> x > 3;

		List<Integer> listOfnumbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		List<Integer> collect = listOfnumbers.stream().filter(numGreaterThan3).collect(Collectors.toList());

		System.out.println(listOfnumbers);

		// multiple filters
		List<Integer> collectNumbers = listOfnumbers.stream().filter(x -> x > 5 && x < 8).collect(Collectors.toList());

		System.out.println(collectNumbers);

		// print name with starts with k
		List<String> name = new ArrayList<String>();
		name.add("jhon");
		name.add("kiran");
		name.add("kumar");
		name.add("rakesh");
		name.add("sunny");
		name.add("kiran");

		Predicate<String> pre = x -> x.startsWith("k");
		name.stream().filter(pre).forEach(System.out::println);

	}
}
