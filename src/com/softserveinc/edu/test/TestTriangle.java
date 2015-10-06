package com.softserveinc.edu.test;

import org.junit.Before;
import org.junit.Test;

import com.softserveinc.edu.oop.Triangle;

import junit.framework.TestCase;

public class TestTriangle extends TestCase {

	Triangle[] triangles = new Triangle[4];
	double[] sideA = { 2, 4, 6, 8 };
	double[] sideB = { 1, 3, 5, 7 };
	double[] sideC = { -1, 0, 2, 10 };

	@Before
	protected void setUp() throws Exception {
		for (int i = 0; i < triangles.length; i++) {
			triangles[i] = new Triangle(sideA[i], sideB[i], sideC[i]);
		}
	}

	@Test
	public void test() {
		for (int i = 0; i < triangles.length; i++) {
			double p = (sideA[i] + sideB[i] + sideC[i]) / 2;
			assertEquals(Math.sqrt(p * (p - sideA[i]) * (p - sideB[i]) * (p - sideC[i])),
					triangles[i].getSquare());
		}
	}

}
