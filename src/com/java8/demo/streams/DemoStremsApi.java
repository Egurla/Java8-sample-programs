package com.java8.demo.streams;

import java.util.*;
import java.util.stream.Collectors;

public class DemoStremsApi {
	public static void main(String[] args) {
			
			List<Student> student=new ArrayList<Student>();
			
			List<String> address1 =Arrays.asList("TS","600076");
			List<String> address2 =Arrays.asList("MP","600005");
			
			List<String> address3 =Arrays.asList("KN","600097");
			
			List<String> address4 =Arrays.asList("TN","600088");
			
			List<String> address5 =Arrays.asList("AP","600092");
			
			
			student.add(new Student(101,"kiran", address1));
			student.add(new Student(102,"rakesh", address2));
			student.add(new Student(103,"raju", address3));
			student.add(new Student(104,"rame", address4));
			student.add(new Student(105,"siva", address5));
			
			//using map
			List<Integer> list=student.stream().map(( x->{
				
				return x.getId();
				
			})).collect(Collectors.toList());
			System.out.println(list);
			
		List<String> names=student.stream().map(( x->{
				
				return x.getName();
				
			})).collect(Collectors.toList());
			System.out.println(names +" "+names.size());
			
				/*
				 * list.stream() .flatMap(x -> x.stream()) .collect(Collectors.toList());
				 */


			//using flatmap 
			List<String> ad1=student.stream().flatMap(x->x.getAddresses().stream())
					.collect(Collectors.toList());

			System.out.println(ad1+" "+ad1.size());
			
			List<String> ad=student.stream().flatMap(( x->{
				return x.getAddresses().stream();	
			})).collect(Collectors.toList());
			
			
			System.out.println(ad +" "+ad.size());
	}

}