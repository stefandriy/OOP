package com.softserveinc.edu.tests;

import com.softserveinc.edu.oop.Cylinder;
import com.softserveinc.edu.oop.OOP;
import com.softserveinc.edu.oop.SolidFigure;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class OOPTest {

    OOP oop;
    double precision = 0.001;

    @Before
    public void setUp() throws Exception {
        oop = new OOP();
        assertFalse(oop == null);
    }

    @After
    public void tearDown() {
        oop = null;
        assertTrue(oop == null);
    }

    @Test
    public void testCreateCylinders() {
        oop.createCylinders();
        for (Cylinder cylinder : OOP.listOfCylinders) {
            assertTrue(cylinder instanceof SolidFigure);
            assertTrue(cylinder.getSquare() > 0);
            assertTrue(cylinder.getVolume() > 0);
        }
    }

    @Test
    public void testGetSumOfVolumes() {
        double expected = 0;
        for (Cylinder cylinder : OOP.listOfCylinders) {
            expected += cylinder.getVolume();
        }
//		assertTrue(oop.getSumOfVolumes() > 0);
        assertEquals(expected, oop.getSumOfVolumes(), precision);
    }
}
