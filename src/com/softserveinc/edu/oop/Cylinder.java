package com.softserveinc.edu.oop;

public class Cylinder extends SolidFigure {
	private PlaneFigure figure;
	private double height;

	public Cylinder(PlaneFigure figure, double height) {
		this.figure = figure;
		this.height = height;
	}

	@Override
	public double getVolume() {
		return figure.getSquare() * height;
	}

	@Override
	public double getSquare() {
		return figure.getSquare();
	}
}
