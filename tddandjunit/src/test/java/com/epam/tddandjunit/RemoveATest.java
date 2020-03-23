package com.epam.tddandjunit;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

public class RemoveATest {
	
	
	@Test
	public void test2Chars() {
		RemoveA removeA =  new RemoveA();
		assertEquals("B",removeA.deleteA("BA"));
	}
	@Test
	public void test4Chars() {
		RemoveA removeA =  new RemoveA();
		assertEquals("BA",removeA.deleteA("AABA"));
	}
	@Test
	public void testNChars() {
		RemoveA removeA =  new RemoveA();
		assertEquals("BAACC",removeA.deleteA("AABAACC"));
	}
	@Test
	public void test1Chars() {
		RemoveA removeA =  new RemoveA();
		assertEquals("B",removeA.deleteA("B"));
	}
	@Test
	public void testEmptyChars() {
		RemoveA removeA =  new RemoveA();
		assertEquals("",removeA.deleteA(""));
	}
}
