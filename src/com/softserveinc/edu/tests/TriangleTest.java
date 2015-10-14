package com.softserveinc.edu.tests;

import com.softserveinc.edu.oop.Triangle;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


public class TriangleTest {
    Triangle triangle;
    double sideA = 7, sideB = 8, sideC = 10;
    double precision = 0.001;

    @Before
    public void setUp() {
        triangle = new Triangle(sideA, sideB, sideC);
        assertTrue(triangle != null);
    }

    @After
    public void tearDown() {
        triangle = null;
        assertTrue(triangle == null);
    }

    @Test
    public void testConstructor() {
        Triangle triangle2 = new Triangle(3, 4, 5);
        assertTrue(triangle2 != null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorNegativeArgument() {
        Triangle triangle2 = new Triangle(-1, -2, 0);
        assertTrue(triangle2 == null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorIllegalArgument() {
        Triangle triangle2 = new Triangle(6, 3, 3);
        assertTrue(triangle2 == null);
    }

    @Test
    public void testGetSideA() {
        assertEquals(sideA, triangle.getSideA(), precision);
    }

    @Test
    public void testGetSideB() {
        assertEquals(sideB, triangle.getSideB(), precision);
    }

    @Test
    public void testGetSideC() {
        assertEquals(sideC, triangle.getSideC(), precision);
    }

    @Test
    public void testSetSideA() {
        double newSide = 20;
        triangle.setSideA(newSide);
        assertEquals(newSide, triangle.getSideA(), precision);
    }

    @Test
    public void testSetSideB() {
        double newSide = 20;
        triangle.setSideB(newSide);
        assertEquals(newSide, triangle.getSideB(), precision);
    }

    @Test
    public void testSetSideC() {
        double newSide = 20;
        triangle.setSideC(newSide);
        assertEquals(newSide, triangle.getSideC(), precision);
    }

    @Test
    public void testGetSquare() {
        double p = (sideA + sideB + sideC) / 2;
        double expected = Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
        assertEquals(expected, triangle.getSquare(), precision);
    }

    @Test
    public void testHashCode() {
        Triangle triangle2 = new Triangle(3, 4, 5);
        assertFalse(triangle.hashCode() == triangle2.hashCode());
    }

    @Test
    public void testEquals() {
        Triangle triangle2 = new Triangle(sideA, sideB, sideC);
        Triangle triangle3 = new Triangle(3, 4, 5);
        assertTrue(triangle.equals(triangle));
        assertFalse(triangle.equals(null));
        assertFalse(triangle.equals(new Double(2)));
        assertFalse(triangle.equals(triangle3));
        assertTrue(triangle.equals(triangle2));
    }
}
