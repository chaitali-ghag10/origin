package com.pojo;

public class Person {
	
	@Override
	public String toString() {
		return "Person [age=" + age + ", name=" + name + "]";
	}

	private int age;
	private String name;
	
	public Person() {
		age=10;
		name = "ABC";
	}
	
	public Person(int age, String name) {
		this.age=age;
		this.name=name;
	}
	
	public void display() {
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public boolean equals(Object obj) {
		Person p = (Person) obj;
		return p.name.equals(name) && p.age ==this.age;
	}
	
	
		

}
