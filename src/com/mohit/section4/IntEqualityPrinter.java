package com.mohit.section4;

public class IntEqualityPrinter {
    public static void main(String[] args) {
        System.out.print("printEqual(1, 1, 1) ");
        printEqual(1, 1, 1);
        System.out.print("printEqual(1, 1, 2) ");
        printEqual(1, 1, 2);
        System.out.print("printEqual(1, -1, -1) ");
        printEqual(-1, -1, -1);
        System.out.print("printEqual(-1, -1, -1) ");
        printEqual(1, 2, 3);

    }

    public static void printEqual(int a, int b, int c) {
        if ((a < 0) || (b < 0) || (c < 0)) {
            System.out.println("Invalid Value");
        } else if ((a == b) && (b == c)) {
            System.out.println("All numbers are equal");
        } else if (((a == b) || (b == c)) || (a == c)) {
            System.out.println("Neither all are equal or different");
        } else {
            System.out.println("All numbers are different");
        }
    }

}

/*
  Write a method printEqual with 3 parameters of type int. The method should not return anything (void).
  <p>
  If one of the parameters is less than 0, print text "Invalid Value".
  <p>
  If all numbers are equal print text "All numbers are equal"
  <p>
  If all numbers are different print text "All numbers are different".
  <p>
  Otherwise, print "Neither all are equal or different".
  <p>
  <p>
  EXAMPLES OF INPUT/OUTPUT:
  <p>
  * printEqual(1, 1, 1); should print text All numbers are equal
  <p>
  * printEqual(1, 1, 2); should print text Neither all are equal or different
  <p>
  * printEqual(-1, -1, -1); should print text Invalid Value
  <p>
  * printEqual(1, 2, 3); should print text All numbers are different
  <p>
  <p>
  TIP: Be extremely careful about spaces in the printed message.
  <p>
  <p>
  NOTES
  <p>
  * The solution will not be accepted if there are extra spaces.
  <p>
  * The method printEqual needs to be defined as public static like we have been doing so far in the course.
  <p>
  * Do not add main method to solution code.
 */