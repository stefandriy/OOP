package com.softserveinc.edu.oopTest;

import org.junit.Before;
import org.junit.Test;

import com.softserveinc.edu.oop.Cylinder;
import com.softserveinc.edu.oop.OOP;
import com.softserveinc.edu.oop.SolidFigure;

import junit.framework.TestCase;

public class TestOOP extends TestCase {

	OOP oop;

	@Before
	protected void setUp() throws Exception {
		oop = new OOP();
	}

	@Test
	public void testCreateCylinders() {
		for (Cylinder cylinder : oop.listOfCylinders) {
			assertTrue(cylinder instanceof SolidFigure);
			assertTrue(cylinder.getSquare() >= 0);
			assertTrue(cylinder.getVolume() >= 0);
		}
	}

	@Test
	public void testGetSumOfVolumes() {
		double expected = 0;
		for (Cylinder cylinder : oop.listOfCylinders) {
			expected += cylinder.getVolume();
		}
		assertTrue(oop.getSumOfVolumes() >= 0);
		assertEquals(expected, oop.getSumOfVolumes());
	}

}
