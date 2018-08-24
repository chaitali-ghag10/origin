package com.pojo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeoDeserialization {

	public static void main(String[] args) {
		try {
			FileInputStream fi = new FileInputStream("Student.txt");
			ObjectInputStream oi = new ObjectInputStream(fi);
			
			Object obj = oi.readObject();
			Student st =(Student)obj;
			
			System.out.println(st.getName());
			System.out.println(st.getRollno());
			System.out.println(st.getTotal());
			
			Object obj1 = oi.readObject();
			Student st1 =(Student)obj1;
			

			System.out.println(st1.getName());
			System.out.println(st1.getRollno());
			System.out.println(st1.getTotal());
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
