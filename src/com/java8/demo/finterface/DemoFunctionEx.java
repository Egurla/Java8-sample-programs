package com.java8.demo.finterface;

import java.util.function.Function;

public class DemoFunctionEx {

	public static void main(String[] args) {
		Function<String, Integer> func = x -> x.length();

        Integer apply = func.apply("egurla ravi");
        System.out.println(apply);
        
        
        Function<Integer, Integer> func2 = x -> x * 2;
        Integer result = func.andThen(func2).apply("egurla ravi");   // 12
        System.out.println(result);
        
	}
}
