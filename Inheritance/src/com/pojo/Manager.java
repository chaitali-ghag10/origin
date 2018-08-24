package com.pojo;

public class Manager extends Employee {
	
	String dept;
	double[] incentives= new double[10];
	
	public Manager() {
		dept = "none";
		for(int i=0;i<incentives.length;i++) {
			incentives[i]=0;
		}
	}
	
	public Manager(String dept,double[] incentives,String name,int age,double salary,int empId) {
		super(empId,salary, age, name);
		this.dept = dept;
		for(int i=0;i<this.incentives.length;i++) {
			this.incentives[i]=incentives[i];
		}
		
	}
	
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public double[] getIncentives() {
		return incentives;
	}
	public void setIncentives(double[] incentives) {
		this.incentives = incentives;
	}
	
	public void display() {
		super.display();
		System.out.println("Department: "+dept);
		for(int i=0;i<this.incentives.length;i++) {
			System.out.println("Incentive "+i+" : "+incentives[i]);
		}
		
	}
	

}
