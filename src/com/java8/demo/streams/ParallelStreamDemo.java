package com.java8.demo.streams;

import java.util.*;

public class ParallelStreamDemo {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Hello ", "Ravi ", "How ", "r ", "u\n");
		list.stream().forEach(System.out::print);
		
		  // method for parallel stream 
		//use parallel processing
        list.parallelStream().forEach(System.out::print);

	}
}
