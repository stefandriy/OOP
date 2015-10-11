package com.softserveinc.edu.oop;

import java.util.ArrayList;

public class OOP {
	public static ArrayList<Cylinder> listOfCylinders = new ArrayList<Cylinder>();
	
	public static void main(String[] args) {
		OOP o = new OOP();
		o.createCylinders();
		System.out.println(o.getSumOfVolumes());
	}
	
	void createCylinders() {
		listOfCylinders.add(new Cylinder(new Circle(1), 1));
		listOfCylinders.add(new Cylinder(new Rectangle(1, 2), 2));
		listOfCylinders.add(new Cylinder(new Triangle(3, 4, 5), 3));
	}
	
	double getSumOfVolumes () {
		double sum = 0;
		for (Cylinder cylinder : listOfCylinders) {
			sum += cylinder.getVolume();
			System.out.println(cylinder.getVolume());
		}
		return sum;
	}
}