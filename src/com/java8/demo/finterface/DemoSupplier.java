package com.java8.demo.finterface;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class DemoSupplier {

	private static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
	private Object supplier;

	public static void main(String[] args) {

		Supplier<LocalDateTime> s = () -> LocalDateTime.now();
		LocalDateTime time = s.get();

		System.out.println(time);

		Supplier<String> s1 = () -> dtf.format(LocalDateTime.now());
		String time2 = s1.get();

		System.out.println(time2);
/*
		DemoSupplier demoSupplier = new DemoSupplier();
		List<Object> list = demoSupplier.supplier().get();

	}

	private <T> Supplier<List<T>> supplier() {

		return ArrayList::new;
	}*/
	}
}
