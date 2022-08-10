package com.lti.demos;

//import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class CalculatorTests {

	Calculator c=new Calculator();
	
	@Disabled
	@Test
	public void testSayHello() {
		Assertions.assertEquals("Hello World", c.sayHello());
	}
	
	public void testSubNos() {
		Assertions.assertEquals(300, c.subNos(500, 200));
	}
	
	@Test
	public void testArr()
	{
		ArrayList<Integer> l=new ArrayList<>();
		Assertions.assertTrue(l.isEmpty());
		l.add(100);
		l.add(8);
		//Assertions.assertTrue(l.isEmpty());
	}
}
