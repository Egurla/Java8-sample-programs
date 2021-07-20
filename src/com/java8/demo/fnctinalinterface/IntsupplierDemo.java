package com.java8.demo.fnctinalinterface;

import java.time.LocalDate;
import java.util.function.IntSupplier;

public class IntsupplierDemo {
	public static void main(String[] args) {

//IntSupplier is the int-producing primitive specialization of Supplier functional interface.
		// The functional method of IntSupplier is getAsInt() which returns integer results
		
		IntSupplier dateIs = () -> LocalDate.now().getYear();
		System.out.println(dateIs.getAsInt());

		IntSupplier msgIs = () -> "Hi Kumar".length();
		System.out.println(msgIs.getAsInt());

		IntSupplier intsup = () -> {
			int num1 = 10;
			int num2 = 20;
			return num1 * num2;
		};
		System.out.println(intsup.getAsInt());
	}
}