package com.module1;

public abstract class TwoDShape {
    private double width;
    private double height;

    public TwoDShape(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public TwoDShape() {

    }

    //Area of a rectangle
    public double getArea(double area) {
        area = width * height;
        return area;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public abstract void Colour();
}
