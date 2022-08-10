package com.lti.demos;

//import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class TestBeforeAfter {

	Calculator c=new Calculator();
	int sum=0;
	
	@BeforeAll
	static void testBA() {
		System.out.println("Database Connected");
	}
	
	@AfterAll
	static void testAA() {
		System.out.println("Database Disconnected");
	}
	
	@BeforeEach
	public void testStartup()
	{
		sum=0;
		System.out.println("Sum is "+sum);
	}
	
	@Test
	public void testAddNos() {
		System.out.println("Test case 1");
		Assertions.assertEquals(700, c.addNos(500, 200));
	}
	
	@Test
	public void testSubNos() {
		System.out.println("Test case 2");
		Assertions.assertEquals(300, c.subNos(500, 200));
	}
	
	@AfterEach
	public void testShutdown() {
		System.out.println("Values nullified");
	}

}
