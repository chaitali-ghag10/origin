package com.pojo;

public class Employee extends Person {
	
	private int empId;
	private double empSalary;
	
	public Employee() {
		//super();
		empId =0;
		empSalary=0;
	}
	
	public Employee(int empId,double empSalary,int age,String name) {
		super(age,name);
		this.empId = empId;
		this.empSalary = empSalary;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public double getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}

	public void display(int ten) {
		System.out.println("Employee ID: "+empId);
		System.out.println("Employee Salary: "+empSalary);
		/*System.out.println("Name: "+ getName());
		System.out.println("Age: "+ getAge());*/
		super.display();
		
	}

	@Override
	public String toString() {
		return super.toString()+ "Employee [empId=" + empId + ", empSalary=" + empSalary + "]";
	}
	
	
	
}
