package com.java8.demo.fnctinalinterface;

import java.util.function.IntConsumer;

public class IntConsumerDemo {

	public static void main(String[] args) {
		// accepts a single int-valued argument as input but doesn't produce any output.

		IntConsumer displayNextInt = i -> System.out.println("Next Int Value: " + (i + 1));
		IntConsumer displaySquare = i -> System.out.println("Int Square Value: " + (i * i));
		
		//andThen() method
		IntConsumer Both = displayNextInt.andThen(displaySquare);
		Both.accept(5);
		IntConsumer consumer = IntConsumerDemo::print;
		consumer.accept(77);
	}

	static void print(int i) {
		System.out.println(i);
	}
}
