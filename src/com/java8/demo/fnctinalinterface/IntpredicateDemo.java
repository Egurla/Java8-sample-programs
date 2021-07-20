package com.java8.demo.fnctinalinterface;

import java.util.List;
import java.util.function.IntPredicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class IntpredicateDemo {

	public static <R> void main(String[] args) {
		
		IntPredicate lower = num -> num >= 100;
		IntPredicate higher = num -> num <= 999;
		//and()
		IntPredicate range = lower.and(higher);
		boolean result = range.test(500);
		
		System.out.println(result);//true
		
		
		//IntPredicate has a negate() method which is used to reverse its result
		boolean reverese = range.negate().test(500);
		
		System.out.println("reverese");//false
		
		
		IntPredicate isOdd = argument -> argument % 2 == 1;
		 
        System.out.println( isOdd.test(9) );    //true
        System.out.println( isOdd.test(10) );   //false
         
      //using filter   
        IntStream stream = IntStream.range(1, 10); 
         
        List<Integer> oddNumbers = stream.filter(isOdd).boxed().collect(Collectors.toList());
         
        System.out.println(oddNumbers);
	}
}
