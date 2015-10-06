package com.softserveinc.edu.oopTest;

import static org.junit.Assert.*;

import org.junit.rules.ExpectedException;

import org.junit.*;

import com.softserveinc.edu.oop.Circle;


public class TestCircle {

	Circle[] circles = new Circle[4];
	final double[] radius = { -1, 0, 1, 1000 };

//	@Before
//	public void setUp() throws Exception {
//		for (int i = 1; i < circles.length; i++) {
//			circles[i] = new Circle(radius[i]);
//		}
//	}
	
	 @Rule
	 public ExpectedException thrown= ExpectedException.none();

	
	@Test
	public void testempty() { 
		circles[3] = new Circle(radius[3]);
		assertTrue(circles[3] != null);
		thrown.expect(IndexOutOfBoundsException.class);
        throw new IndexOutOfBoundsException(); 
	}
	
//	@Test(expected = ArithmeticException.class)  
//	public void testdivisionWithException() {
//		circles[3] = new Circle(radius[3]);
//		assertTrue(circles[3] != null);
////	  int i = 1/0;
//		throw new ArithmeticException();
//	}
	
	
	
	@Test(expected = IllegalArgumentException.class)
	public void testConstructor() {
		for (int i = 0; i < 2; i++) {
			circles[i] = new Circle(radius[i]);
			assertTrue(circles[i] == null);
		}
	}


//	@Test
//	public void testGetSquare() {
//		for (int i = 1; i < circles.length; i++) {
//			assertEquals(Math.PI * Math.pow(radius[i], 2), circles[i].getSquare());
//		}
//	}
}
