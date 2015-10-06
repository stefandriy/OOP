package com.softserveinc.edu.oop;

public class Circle extends PlaneFigure {
	private double radius;

	public Circle(double radius) throws IllegalArgumentException {
		if (radius > 0) {
			this.radius = radius;
		} else
			throw new IllegalArgumentException("radius is less than or equal 0");
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public double getSquare() {
		return Math.PI * Math.pow(radius, 2);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(radius);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Circle other = (Circle) obj;
		if (Double.doubleToLongBits(radius) != Double.doubleToLongBits(other.radius))
			return false;
		return true;
	}
}
