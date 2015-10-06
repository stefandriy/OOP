package com.softserveinc.edu.test;

import org.junit.*;

import com.softserveinc.edu.oop.Circle;

import junit.framework.TestCase;

public class TestCircle extends TestCase {

	Circle[] circles = new Circle[4];
	final double[] radius = { -1, 0, 1, 1000 };

	@Before
	public void setUp() throws Exception {
		for (int i = 0; i < circles.length; i++) {
			circles[i] = new Circle(radius[i]);
		}
	}

	@After
	public void tearDown() {

	}

	@Test
	public void testGetSquare() {
		for (int i = 0; i < circles.length; i++) {
			assertEquals(Math.PI * Math.pow(radius[i], 2), circles[i].getSquare());
		}
	}
}
