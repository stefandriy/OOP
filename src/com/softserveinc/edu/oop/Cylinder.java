package com.softserveinc.edu.oop;

public class Cylinder extends SolidFigure {
    private PlaneFigure figure;
    private double height;

    public Cylinder(PlaneFigure figure, double height) {
        setFigure(figure);
        setHeight(height);
    }

    @Override
    public double getVolume() {
        return figure.getSquare() * height;
    }

    @Override
    public double getSquare() {
        return figure.getSquare();
    }

    public PlaneFigure getFigure() {
        return figure;
    }

    public void setFigure(PlaneFigure figure) {
        if (figure != null) {
            this.figure = figure;
        } else {
            throw new IllegalArgumentException("wrong figure");
        }
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height > 0) {
            this.height = height;
        } else {
            throw new IllegalArgumentException("height is less or equal 0");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cylinder cylinder = (Cylinder) o;

        if (id != cylinder.id) return false;
        if (Double.compare(cylinder.height, height) != 0) return false;
        return !(figure != null ? !figure.equals(cylinder.figure) : cylinder.figure != null);

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = id;
        result = 31 * result + (figure != null ? figure.hashCode() : 0);
        temp = Double.doubleToLongBits(height);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
