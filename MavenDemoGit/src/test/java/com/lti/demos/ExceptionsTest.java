package com.lti.demos;

//import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ExceptionsTest {
	
	Calculator c=new Calculator();

	@Test
	void testExceptions() {
		
		Assertions.assertThrows(IllegalArgumentException.class,
				()->{Integer.parseInt("One");}
				);
		
	}
	
	@Test
	void testmethodExp() {
		
		final Exception e= Assertions.assertThrows(ArithmeticException.class,
				()->{c.search(0);}
				);
		Assertions.assertEquals("You Entered 0", e.getMessage());
		
	}


}
