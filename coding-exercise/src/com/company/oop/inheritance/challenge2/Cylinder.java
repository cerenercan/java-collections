package com.company.oop.inheritance.challenge2;

public class Cylinder extends Circle{

    private double height;

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
        if (this.height < 0)
            this.height = 0;


    }

    public double getVolume() {
        return getArea() * getHeight();

    }

    public double getHeight() {
        return height;
    }


}
