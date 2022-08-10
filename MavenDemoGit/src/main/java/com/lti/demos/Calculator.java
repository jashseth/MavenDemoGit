package com.lti.demos;

public class Calculator {
	
	public String sayHello() {
		return "Hello World";
	}

	public int addNos(int x, int y) {
		return x+y;
	}
	
	public int subNos(int x, int y) {
		return x-y;
	}
	
	public void search(int id) {
		if(id==0)
		{
			throw new ArithmeticException("You Entered 0");
		}
		else {
			System.out.println("Something");
		}
	}
}
