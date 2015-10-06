package com.softserveinc.edu.oopTest;

import org.junit.Before;
import org.junit.Test;

import com.softserveinc.edu.oop.Circle;
import com.softserveinc.edu.oop.Cylinder;
import com.softserveinc.edu.oop.PlaneFigure;
import com.softserveinc.edu.oop.Rectangle;
import com.softserveinc.edu.oop.Triangle;

import junit.framework.TestCase;

public class TestCylinder extends TestCase {

	Cylinder[] cylinders = new Cylinder[4];
	PlaneFigure[] figures = new PlaneFigure[4];
	double[] height = { 1, 0, 4, 10 };

	@Before
	protected void setUp() throws Exception {
		figures[0] = new Circle(2);
		figures[1] = new Rectangle(2, 3);
		figures[2] = new Rectangle(0, 1);
		figures[3] = new Triangle(2, 3, 4);

		for (int i = 0; i < cylinders.length; i++) {
			cylinders[i] = new Cylinder(figures[i], height[i]);
		}
	}

	@Test
	public void test() {
		for (int i = 0; i < cylinders.length; i++) {
			assertEquals(figures[i].getSquare(), cylinders[i].getSquare());
			assertEquals(figures[i].getSquare() * height[i], cylinders[i].getVolume());
		}
	}

}
