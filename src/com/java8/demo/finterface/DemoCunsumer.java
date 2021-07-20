package com.java8.demo.finterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class DemoCunsumer {

	public static void main(String[] args) {
		//Consumer is a functional interface; it takes an argument and returns nothing
		Consumer<String> print = x -> System.out.println(x);//
        print.accept("kumar");
        
        
        
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        Consumer<Integer> consumer = (Integer x) -> System.out.println(x);
       forEach(list, consumer);
        forEach(list, (Integer x) -> System.out.println(x));

        //to find string lenth()
        List<String> lenth = Arrays.asList("a", "chinna", "Swamy");
        forEachString(lenth, (String x) -> System.out.println(x.length()));

    }
	static <String> void forEachString(List<String> lenth, Consumer<String> consumer) {
        for (String t : lenth) {
            consumer.accept(t);
        }
	}

	private static void forEach(List<Integer> list, Consumer<Integer> consumer) {
		for (int t : list) {
            consumer.accept(t);
        }
		
	}
}
