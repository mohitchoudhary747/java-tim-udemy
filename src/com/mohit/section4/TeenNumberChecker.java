package com.mohit.section4;

public class TeenNumberChecker {
    public static void main(String[] args) {
        print(9, 99, 19);
        print(new int[]{9, 99, 19});
        print(23, 15, 42);
        print(new int[]{23, 15, 42});
        print(22, 23, 34);
        print(new int[]{22, 23, 34});
    }

    static void print(int a, int b, int c) {
        System.out.println("For " + a + ", " + b + ", " + c + ", " + "is there a teen ? " + hasTeen(a, b, c));
    }

    static void print(int[] b) {
        System.out.println("For " + b.toString() + ", " + "is there a teen ? " + hasTeen(b));
    }

    @SuppressWarnings("RedundantIfStatement")
    public static boolean hasTeen(int a, int b, int c) {

        if (isTeen(a))
            return true;
        if (isTeen(b))
            return true;
        if (isTeen(c))
            return true;
        return false;
    }

    public static boolean hasTeen(int[] numbers) {
        for (int a : numbers) {
            if (isTeen(a)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isTeen(int a) {

        return (a > 12 && a < 20);
    }
}

/*
We'll say that a number is "teen" if it is in the range 13 -19 (inclusive).

Write a method named hasTeen with 3 parameters of type int.

The method should return boolean and it needs to return true if one of the parameters is in range 13(inclusive) - 19 (inclusive). Otherwise return false.


EXAMPLES OF INPUT/OUTPUT:

* hasTeen(9, 99, 19);  should return true since 19 is in range 13 - 19

* hasTeen(23, 15, 42);  should return true since 15 is in range 13 - 19

* hasTeen(22, 23, 34);  should return false since numbers 22, 23, 34 are not in range 13-19


Write another method named isTeen with 1 parameter of type int.

The method should return boolean and it needs to return true if the parameter is in range 13(inclusive) - 19 (inclusive). Otherwise return false.

EXAMPLES OF INPUT/OUTPUT:

* isTeen(9);  should return false since 9 is in not range 13 - 19

* isTeen(13);  should return true since 13 is in range 13 - 19

NOTE: All methods need to be defined as public static like we have been doing so far in the course.
NOTE: Do not add a  main method to solution code.
 */