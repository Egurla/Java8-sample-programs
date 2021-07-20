package com.java8.demo.streams;

import java.util.List;

public class Student {
	private int id;
    private String name;
    private List<String> addresses;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public Student(int id, String name, List<String> addresses) {
		super();
		this.id = id;
		this.name = name;
		this.addresses = addresses;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getAddresses() {
		return addresses;
	}
	public void setAddresses(List<String> addresses) {
		this.addresses = addresses;
	}
}
