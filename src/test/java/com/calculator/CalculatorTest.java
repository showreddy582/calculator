package com.calculator;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {

	private Calculator calcualtor = new Calculator();

	@Test
	public void testSum() {
		assertEquals(30, calcualtor.sum(10, 20));
	}

	@Test
	public void testSub() {
		assertEquals(10, calcualtor.sub(20, 10));
	}

	@Test
	public void testMul() {
		assertEquals(200, calcualtor.mul(20, 10));
	}

}
