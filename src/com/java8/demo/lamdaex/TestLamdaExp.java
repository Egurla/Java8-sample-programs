package com.java8.demo.lamdaex;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestLamdaExp {

	public static void main(String[] args) {
		
	
	Stream<String> stream = Stream.of("INdea", "canada", "US", "Aus", "UK", "Chia");
	stream.filter(x -> x.startsWith("U")).forEach(System.out::println);

	// adding integer in List
	List<Integer> list1 = Arrays.asList(1, 2, 3);
	List<Integer> list2 = Arrays.asList(4, 5, 6);
	List<Integer> list3 = Arrays.asList(7, 8, 9);

	List<List<Integer>> list = Arrays.asList(list1, list2, list3);

	// using flatmap to diplay all integers
	List<Integer> listOIntegers = list.stream().flatMap(x -> x.stream()).collect(Collectors.toList());

	System.out.println(listOIntegers);

	// useing stream and lambda expression to filter list and forEach print
	listOIntegers.stream().filter(n -> n % 2 == 0).forEach(System.out::println);

	String[][] arr = new String[][] { { "a", "b" }, { "c", "d" }, { "e", "f" }, { "g", "h" } };

	List<String> cc = Arrays.stream(arr).flatMap(x -> Arrays.stream(x)).collect(Collectors.toList());

	System.out.println(cc);
}
}