package com.pojo;

import java.util.Scanner;

public class TestEmployee {

	public static void main(String[] args) {
		
		/*Scanner in = new Scanner(System.in);
		
		System.out.println("Enter name:");
		String name = in.next();
		
		System.out.println("Enter age:");
		int age = in.nextInt();
		
		System.out.println("Enter id:");
		int id = in.nextInt();
		
		System.out.println("Enter salary:");
		double sal = in.nextDouble();*/
		
		
		Employee emp = new Employee(1001,20000,23,"ydfgyafs");
		//emp.display();
		
		System.out.println(emp);
		
		

	}

}
