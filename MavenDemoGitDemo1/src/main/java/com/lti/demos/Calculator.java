package com.lti.demos;

public class Calculator {

	public String sayHello() {
		return "Hello World";
	}
	public int sum_no(int a,int b){
		return a+b;
	}
	public int sub_no(int a,int b){
		return a-b;
	}
	public void searchEmp(int empId)
	{
		if(empId==0) {
			throw new ArithmeticException(" u entered zero ");
			
		}
		else {
			System.out.println("Great");
		}
	}
}
