package com.module1;

public class Triangle extends TwoDShape implements Rotate {
    private double side1;
    private double side2;
    private double side3;
    private double area;
    private double width;

    //Gets the area of the Triangle
    public Triangle(double side1, double side2, double side3) {
        double semi = 0.5 * (side1 + side2 + side3);
        area = Math.sqrt(semi * (semi - side1) * (semi - side2) * (semi - side3));
        System.out.println(area);
    }

    public Triangle() {
        super();
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        side2 = width;
    }

    public double getArea(double area) {
        return area;
    }

    //Inputs the COLOUR from the Enum class file
    @Override
    public void Colour() {
        Colour c2 = Colour.GREEN;
    }

    //Gets the height of the Triangle
    private double heronsHeight(double height) {
        height = 2 * (area / width);
        return height;
    }

    @Override
    public double rotate90() {
        return 90;
    }

    @Override
    public double rotate180() {
        return 180;
    }

    @Override
    public double rotate(double degree) {
        degree = 270;
        return degree;
    }
}
