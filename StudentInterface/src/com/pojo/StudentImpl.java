package com.pojo;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

import com.myinterfaces.StudentFileIO;
import com.myinterfaces.StudentIO;
import com.pojo.Student;

public class StudentImpl implements StudentFileIO, StudentIO {

	@Override
	public Student[] readFromUser() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of studets:");
		int no_of_students =in.nextInt();
		
		Student[] students = new Student[no_of_students];
		
		for(int i=0;i<no_of_students;i++) {
			students[i] = new Student();
			System.out.println("Enter name:\n");
			students[i].setName(in.next());
			
			System.out.println("Enter roll no:\n");
			students[i].setRollno(in.nextInt());
			
			System.out.println("Enter total marks:");
			students[i].setTotal(in.nextInt());
			
		}
		in.close();		
		return students;
	}

	@Override
	public void writeToUser(Student[] students) {
		for(int i=0;i<students.length;i++) {
			System.out.println(i+". Name:"+students[i].getName());
			System.out.println("Roll no:"+students[i].getRollno());
			System.out.println("Total:"+students[i].getTotal());

		}
	}

	@Override
	public Student[] readStudents() {
		try {
			FileInputStream fi = new FileInputStream("file1.txt");
			ObjectInputStream oi = new ObjectInputStream(fi);
			
			//Object obj = oi.readObject();
			Student[] students =(Student[])oi.readObject();
			return students;
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return null;
		
	}

	@Override
	public int writeStudents(Student[] student) {
	
		try {
			FileOutputStream fo = new FileOutputStream("file1.txt");
			ObjectOutputStream oo = new ObjectOutputStream(fo);
			for(Student s:student) {
				oo.writeObject(s);
			}
			oo.close();
			fo.close();
			System.out.println("File Written successfully!");

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return 0;
	}

}
