package com.softserveinc.edu.oop;

public class Rectangle extends PlaneFigure {
	private double width;
	private double height;

	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	@Override
	public double getSquare() {
		return width * height;
	}
}
