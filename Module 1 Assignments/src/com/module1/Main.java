package com.module1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Inputs Side1 value
        System.out.println("Side 1: ");
        Scanner s1 = new Scanner(System.in);
        double side1 = Integer.parseInt(s1.next());

        //Inputs Side2 valve
        System.out.println("Side2: ");
        Scanner s2 = new Scanner(System.in);
        double side2 = Integer.parseInt(s2.next());

        //Inputs Side3 value
        System.out.println("Side3: ");
        Scanner s3 = new Scanner(System.in);
        double side3 = Integer.parseInt(s3.next());

        //Outputs the area of the Triangle with the inputted sides
        Triangle t1 = new Triangle(side1, side2, side3);

        //Inputs Radius value
        System.out.println("Radius: ");
        Scanner r = new Scanner(System.in);
        double radius = Integer.parseInt(r.next());

        //Outputs the area of the Circle with the inputted radius
        Circle c1 = new Circle(radius);
    }
}