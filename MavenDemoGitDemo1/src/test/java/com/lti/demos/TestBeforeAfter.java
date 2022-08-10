package com.lti.demos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestBeforeAfter {

	Calculator c=new Calculator();
	@BeforeAll
	public static void testStartAll() {
		System.out.println("Welcome");
	}
	
	@BeforeEach
	public void testStartUp() {
		System.out.println("Hello there");
	}
	
	@Test
	public void testsAddNo() {
		Assertions.assertEquals(600,c.sum_no(100,500));	

	}
	
	@Test//message is optional // if test case fails - msg displayed
	public void testSubNo() {
		Assertions.assertEquals(400,c.sub_no(900,500),"Please check substraction method");	

	}

	@AfterEach
	public void testShutDown() {
		System.out.println("ba-bye");
	}
	@AfterAll
	public static void testShutAll() {
		System.out.println("Have a nice day");
	}
}
