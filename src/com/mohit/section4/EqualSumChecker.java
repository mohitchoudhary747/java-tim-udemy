package com.mohit.section4;

public class EqualSumChecker {

    public static void main(String[] args) {
        print(1,1,1);
        print(1,1,2);
        print(1, -1, 0);
        print(2, -1, 0);
    }

   static void print(int arg1, int arg2, int arg3){

        System.out.println("For "+arg1+", "+arg2+", "+arg3+", output is> "+hasEqualSum(arg1,arg2,arg3));
    }

    public static boolean hasEqualSum(int arg1, int arg2, int arg3) {
        int sum = arg1 + arg2;
       return sum == arg3;
    }


}
/*
Write a method hasEqualSum with 3 parameters of type int.

The method should return boolean and it needs to return true if the sum of the first and second parameter is equal to the third parameter. Otherwise, return false.


EXAMPLES OF INPUT/OUTPUT:

* hasEqualSum(1, 1, 1);  should return false since 1 + 1 is not equal to 1

* hasEqualSum(1, 1, 2);  should return true since 1 + 1 is equal to 2

* hasEqualSum(1, -1, 0);  should return true since 1 + (-1) is 1 - 1 and is equal to 0


NOTE: The hasEqualSum method  needs to be defined as public static like we have been doing so far in the course.
NOTE: Do not add a  main method to solution code.
 */