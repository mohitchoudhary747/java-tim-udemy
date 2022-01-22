package com.mohit.section4;

public class AreaCalculator {

    static final double PI = 3.14159;

    public static void main(String[] args) {

        System.out.println(area(5.0));
        System.out.println(area(-1));
        System.out.println(area(5.0, 4.0));
        System.out.println(area(-1.0, 4.0));
    }

    public static double area(double radius) {
        if (radius < 0) {
            return -1.0;
        } else {
            return PI * (radius * radius);
        }
    }
    public static double area(double x, double y) {
        if (x < 0||y<0) {
            return -1.0;
        } else {
            return  (x * y);
        }
    }
}
/**
 * Write a method named area with one double parameter named radius.
 * <p>
 * The method needs to return a double value that represents the area of a circle.
 * <p>
 * If the parameter radius is negative then return -1.0 to represent an invalid value.
 * <p>
 * Write another overloaded method with 2 parameters x and y (both doubles), where x and y represent the sides of a rectangle.
 * <p>
 * The method needs to return an area of a rectangle.
 * <p>
 * If either or both parameters is/are a negative return -1.0 to indicate an invalid value.
 * <p>
 * For formulas and PI value please check the tips below.
 * <p>
 * Examples of input/output:
 * <p>
 * * area(5.0); should return 78.53975
 * <p>
 * * area(-1);  should return -1 since the parameter is negative
 * <p>
 * * area(5.0, 4.0); should return 20.0 (5 * 4 = 20)
 * <p>
 * * area(-1.0, 4.0);  should return -1 since first the parameter is negative
 * <p>
 * <p>
 * <p>
 * TIP: The formula for calculating the area of a rectangle is x * y.
 * <p>
 * TIP: The formula for calculating a circle area is radius * radius * PI.
 * <p>
 * TIP: For PI use a constant from Math class e.g. Math.PI
 * <p>
 * NOTE: All methods need to be defined as public static like we have been doing so far in the course.
 * <p>
 * NOTE: Do not add a main method to your solution code!
 */