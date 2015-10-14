package com.softserveinc.edu.tests;

import com.softserveinc.edu.oop.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by cam on 12.10.15.
 */
public class CylinderTest {

    Cylinder cylinder;
    PlaneFigure rectangle = new Rectangle(6, 5);
    double height = 10;
    double precision = 0.001;

    @Before
    public void setUp() throws Exception {
        cylinder = new Cylinder(rectangle, height);
        assertTrue(cylinder != null);
    }

    @After
    public void tearDown() throws Exception {
        cylinder = null;
        assertTrue(cylinder == null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorIllegalArgumentFigure() {
        Cylinder cylinder1 = new Cylinder(null, 2);
        assertTrue(cylinder1 == null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorIllegalArgumentHeight() {
        Cylinder cylinder1 = new Cylinder(rectangle, -2);
        assertTrue(cylinder1 == null);
    }

    @Test
    public void testGetVolume() throws Exception {
        assertEquals(rectangle.getSquare() * height, cylinder.getVolume(), precision);
    }

    @Test
    public void testGetSquare() throws Exception {
        assertEquals(rectangle.getSquare(), cylinder.getSquare(), precision);
    }

    @Test
    public void testGetFigure() throws Exception {
        assertTrue(rectangle.equals(cylinder.getFigure()));
    }

    @Test
    public void testSetFigure() throws Exception {
        Triangle triangle = new Triangle(3, 4, 5);
        cylinder.setFigure(triangle);
        assertTrue(triangle.equals(cylinder.getFigure()));
    }

    @Test
    public void testGetHeight() throws Exception {
        assertEquals(height, cylinder.getHeight(), precision);
    }

    @Test
    public void testSetHeight() throws Exception {
        double expected = 100;
        cylinder.setHeight(expected);
        assertEquals(expected, cylinder.getHeight(), precision);
    }

    @Test
    public void testEquals() throws Exception {
        Cylinder cylinder1 = new Cylinder(rectangle, height);
        Cylinder cylinder2 = new Cylinder(new Triangle(3, 4, 5), 4);
        assertTrue(cylinder.equals(cylinder1));
        assertFalse(cylinder.equals(null));
        //noinspection EqualsBetweenInconvertibleTypes
        assertFalse(cylinder.equals(new Double(2)));
        assertFalse(cylinder.equals(cylinder2));
        assertTrue(cylinder.equals(cylinder1));
    }

    @Test
    public void testHashCode() throws Exception {
        Cylinder cylinder1 = new Cylinder(new Circle(3), 4);
        assertFalse(cylinder.hashCode() == cylinder1.hashCode());
    }
}