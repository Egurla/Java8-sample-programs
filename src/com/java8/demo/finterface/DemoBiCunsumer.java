package com.java8.demo.finterface;

import java.util.function.BiConsumer;

public class DemoBiCunsumer {
public static void main(String[] args) {
	

	BiConsumer<Integer, Integer> addTwo = (x, y) -> System.out.println(x + y);
    addTwo.accept(30, 8);
    
    
    
    addTwo(8, 7, (x, y) -> System.out.println(x + y));
    addTwo("Egurla", "chinna", (x, y) -> System.out.println(x + y)); 
    
    
    math(40, 4, (x, y) -> System.out.println(x + y));
    math(3, 6, (x, y) -> System.out.println(x * y));     
}

static <Integer> void math(Integer a1, Integer a2, BiConsumer<Integer, Integer> c) {
    c.accept(a1, a2);
}

static <T> void addTwo(T a1, T a2, BiConsumer<T, T> c) {
    c.accept(a1, a2);
}
}
