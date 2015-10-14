package com.softserveinc.edu.oop;

import javax.persistence.*;

public abstract class PlaneFigure {
//    @Id
//    @GeneratedValue
    int id;
    abstract public double getSquare();

//    @Id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
