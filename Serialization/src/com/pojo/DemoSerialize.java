package com.pojo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class DemoSerialize {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter name:");
		String name = in.next();
		
		System.out.println("Enter roll no:");
		int roll = in.nextInt();
		
		System.out.println("Enter total:");
		int total = in.nextInt();
		
		Student st1 = new Student(roll, total, name);
		
		System.out.println("Enter name:");
		 name = in.next();
		
		System.out.println("Enter roll no:");
		 roll = in.nextInt();
		
		System.out.println("Enter total:");
		 total = in.nextInt();
		 
		Student st2 = new Student(roll, total, name);
		
		try {
			FileOutputStream fo = new FileOutputStream("Student.txt");
			ObjectOutputStream oo = new ObjectOutputStream(fo);
			oo.writeObject(st1);
			oo.writeObject(st2);
			oo.close();
			fo.close();
			System.out.println("Object written succesfully!");

			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
