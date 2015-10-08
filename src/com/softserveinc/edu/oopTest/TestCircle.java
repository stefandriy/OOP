package com.softserveinc.edu.oopTest;

import static org.junit.Assert.*;

import org.junit.*;

import com.softserveinc.edu.oop.Circle;

public class TestCircle {
	Circle circle;
	double radius = 10;
	double precision = 0.001;

	@Before
	public void setUp() {
		circle = new Circle(radius);
		assertTrue(circle != null);
	}

	@After
	public void tearDown() {
		circle = null;
		assertTrue(circle == null);
	}

	public void testConstructor() {
		Circle circle2 = new Circle(1);
		assertTrue(circle2 != null);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testConstructorIllegalArgument() {
		Circle circle2 = new Circle(-1);
		assertTrue(circle2 == null);
	}
	
	@Test
	public void testGetRadius() {
		assertEquals(radius, circle.getRadius(), precision);
	}
	
	 @Test
	 public void testSetRadius() {
		 double radius = 20;
		 circle.setRadius(radius);
		 assertEquals(radius, circle.getRadius(), precision);
	 }
	 
	 @Test
	 public void testGetSquare() {
		 assertEquals(Math.PI * Math.pow(radius,2), circle.getSquare(), precision);
	 }
	 
	 @Test
	 public void testHashCode() {
		 Circle circle2 = new Circle(2);
		 assertFalse(circle.hashCode() == circle2.hashCode());
	 }
	 
	 @Test
	 public void testEquals() {
		 Circle circle2 = new Circle(radius);
		 Circle circle3 = new Circle(3);
		 assertTrue(circle.equals(circle));
		 assertFalse(circle.equals(null));
		 assertFalse(circle.equals(new Double(2)));
		 assertFalse(circle.equals(circle3));
		 assertTrue(circle.equals(circle2));
	 }
}
