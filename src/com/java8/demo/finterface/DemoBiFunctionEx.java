package com.java8.demo.finterface;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class DemoBiFunctionEx {

	public static void main(String[] args) {

		BiFunction<Integer, Integer, Integer> func = (x1, x2) -> x1 + x2;
		Integer result = func.apply(2, 3);
		System.out.println(result);
		
		
		Map<Integer, String> m = new HashMap<>();
	    m.put(1, "kumar");
	    m.put(2, "rakesh");
	    m.put(3, "ravi");
	    m.put(4, "rakesh");
	    m.put(5, "kumar");
	    m.put(6, "anand");
	    m.put(7, "chinna");
	    
	    BiFunction<Integer, String, String> f =
	        (key, value) -> "[Key="+key+", "+value+"("+Collections.frequency(m.values(), value)+")]";
	    
	    m.forEach((k,v)-> System.out.println(f.apply(k, v)));
	}
}
