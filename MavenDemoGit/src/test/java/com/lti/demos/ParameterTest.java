package com.lti.demos;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class ParameterTest {

	@Disabled
	@ParameterizedTest
	@ValueSource(ints= {8,10,12,16})
	public void testIntArr(int arg) {
		System.out.println(arg);
		Assertions.assertTrue(arg%2==0);
	}

	@Disabled
	@ParameterizedTest
	@ValueSource(strings= {"hello","","nullll"})
	public void testIntStr(String arg) {
		System.out.println(arg);
		Assertions.assertNotNull(arg);
	}
	
	@Disabled
	@Test
	public void testLambda()
	{
		Integer[] a= {10,21,33,4};
		List<Integer> l=Arrays.asList(a);
		
		Assertions.assertAll(
				()->assertEquals(10,l.get(0)),
				()->assertEquals(21,l.get(1)),
				()->assertEquals(33,l.get(2)),
				()->assertEquals(4,l.get(3))
				
				);
		
	}

	@RepeatedTest(value=3, name="Repeat thrice")
	public void repeatTest()
	{
		int a=10, b=20;
		Assertions.assertEquals(200,(a*b));
	}
}
