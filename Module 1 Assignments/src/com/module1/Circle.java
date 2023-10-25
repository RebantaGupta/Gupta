package com.module1;

public class Circle extends TwoDShape {
    public final double Pi = Math.PI;
    private double radius;
    private double area;

    //Gets the Area
    Circle(double radius) {
        super();
        double area = Pi * (radius * radius);
        System.out.println(area);
    }
    public double getArea() {
        return area;
    }

    //Inputs the COLOUR from the Enum class file
    public void Colour() {
        Colour c1 = Colour.RED;
    }
}
