package com.softserveinc.edu.tests;

import com.softserveinc.edu.oop.Rectangle;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RectangleTest {

    Rectangle rectangle;
    double width = 7, height = 8;
    double precision = 0.001;

    @Before
    public void setUp() {
        rectangle = new Rectangle(width, height);
        assertTrue(rectangle != null);
    }

    @After
    public void tearDown() {
        rectangle = null;
        assertTrue(rectangle == null);
    }

    @Test
    public void testConstructor() {
        Rectangle rectangle1 = new Rectangle(3, 4);
        assertTrue(rectangle1 != null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorIllegalArgument() {
        Rectangle rectangle1 = new Rectangle(0, -3);
        assertTrue(rectangle1 == null);
    }

    @Test
    public void testGetSideA() {
        assertEquals(width, rectangle.getWidth(), precision);
    }

    @Test
    public void testGetSideB() {
        assertEquals(height, rectangle.getHeight(), precision);
    }

    @Test
    public void testSetWidth() {
        double newWidth = 20;
        rectangle.setWidth(newWidth);
        assertEquals(newWidth, rectangle.getWidth(), precision);
    }

    @Test
    public void testSetHeight() {
        double newHeight = 20;
        rectangle.setHeight(newHeight);
        assertEquals(newHeight, rectangle.getHeight(), precision);
    }

    @Test
    public void testGetSquare() {
        double expected = width * height;
        assertEquals(expected, rectangle.getSquare(), precision);
    }

    @Test
    public void testHashCode() {
        Rectangle rectangle = new Rectangle(3, 4);
        assertFalse(this.rectangle.hashCode() == rectangle.hashCode());
    }

    @Test
    public void testEquals() {
        Rectangle rectangle1 = new Rectangle(width, height);
        Rectangle rectangle2 = new Rectangle(3, 4);
        assertTrue(rectangle.equals(rectangle));
        assertFalse(rectangle.equals(null));
        assertFalse(rectangle.equals(new Double(2)));
        assertFalse(rectangle.equals(rectangle2));
        assertTrue(rectangle.equals(rectangle1));
    }
}
