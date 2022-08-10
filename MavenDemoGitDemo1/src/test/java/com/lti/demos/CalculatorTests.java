package com.lti.demos;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class CalculatorTests {
	
	Calculator c = new Calculator();
	
	@Disabled
	@Test
	public void testSayHello() {
		Assertions.assertEquals("Hello World",c.sayHello());	
	}
	
	@Disabled
	@Test
	public void testsAddNo() {
		Assertions.assertEquals(600,c.sum_no(100,500));	

	}
	@Disabled
	@Test//message is optional // if test case fails - msg displayed
	public void testSubNo() {
		Assertions.assertEquals(400,c.sub_no(900,500),"Please check substraction method");	

	}
	@Test
	public void testArrays() {
		ArrayList<Integer> myList=new ArrayList<>();
		Assertions.assertEquals(0,myList.size());
		Assertions.assertTrue(myList.isEmpty());
		
		myList.add(100);
		myList.add(200);
		Assertions.assertEquals(2,myList.size());

		
	}
}
