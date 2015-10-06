package com.softserveinc.edu.oopTest;

import org.junit.Before;
import org.junit.Test;

import com.softserveinc.edu.oop.Rectangle;

import junit.framework.TestCase;

public class TestRectangle extends TestCase {

	Rectangle [] rectangles = new Rectangle[4];
	double [] width = {1, 4, 7, -1};
	double [] height = {2, 3, 5, 0};
	
	@Before
	protected void setUp() throws Exception {
		for (int i = 0; i < width.length; i++) {
			rectangles[i] = new Rectangle(width[i], height[i]);
		}
	}

	@Test
	public void test() {
		for (int i = 0; i < width.length; i++) {
			assertEquals(width[i] * height[i], rectangles[i].getSquare());
		}
	}

}
