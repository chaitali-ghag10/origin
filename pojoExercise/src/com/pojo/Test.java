package com.pojo;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the name:");
		String name = in.next();
		
		System.out.println("Enter the rollno:");
		int rollno = in.nextInt();
		
		int[] marks = new int[5];
		System.out.println("Enter the marks for 5 subjects:");
		for(int i=0;i<marks.length;i++) {
			marks[i]=in.nextInt();
		}
		
		Student s = new Student(name, marks, rollno);
		
		s.display();
		
	}

}
