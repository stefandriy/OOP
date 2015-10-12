package com.softserveinc.edu.oop;

public class Triangle extends PlaneFigure {
	private double sideA;
	private double sideB;
	private double sideC;

	public Triangle(double sideA, double sideB, double sideC) {
		if (sideA > 0 || sideB > 0 || sideC > 0) {
			double max = Math.max(sideA, Math.max(sideB, sideC));
			double sum = sideA + sideB + sideC - max;
			if (sum > max) {
				this.sideA = sideA;
				this.sideB = sideB;
				this.sideC = sideC;
			} else {
				throw new IllegalArgumentException();
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@Override
	public double getSquare() {
		double p = (sideA + sideB + sideC) / 2;
		return Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
	}

	public double getSideA() {
		return sideA;
	}

	public void setSideA(double sideA) {
		this.sideA = sideA;
	}

	public double getSideB() {
		return sideB;
	}

	public void setSideB(double sideB) {
		this.sideB = sideB;
	}

	public double getSideC() {
		return sideC;
	}

	public void setSideC(double sideC) {
		this.sideC = sideC;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		Triangle triangle = (Triangle) o;

		if (Double.compare(triangle.sideA, sideA) != 0) return false;
		if (Double.compare(triangle.sideB, sideB) != 0) return false;
		return Double.compare(triangle.sideC, sideC) == 0;

	}

	@Override
	public int hashCode() {
		int result;
		long temp;
		temp = Double.doubleToLongBits(sideA);
		result = (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(sideB);
		result = 31 * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(sideC);
		result = 31 * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
}
