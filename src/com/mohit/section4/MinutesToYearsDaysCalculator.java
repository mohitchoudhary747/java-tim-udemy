package com.mohit.section4;

public class MinutesToYearsDaysCalculator {
    public static void main(String[] args) {
        printYearsAndDays(525600);
        printYearsAndDays(1051200);
        printYearsAndDays(561600);
    }

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else{


            int yearsCount= (int) (minutes/(60*24*365));
            int daysCount=((int)minutes/(60*24))%365;

            //            it needs to print a message in the format "XX min = YY y and ZZ d".
            String finalOutPut=String.format("%s min = %s y and %s d", minutes,yearsCount, daysCount);
            System.out.println(finalOutPut);
        }

    }
}


/*
 * Write a method printYearsAndDays with parameter of type long named minutes.
 * <p>
 * The method should not return anything (void) and it needs to calculate the years and days from the minute's parameter.
 * <p>
 * If the parameter is less than 0, print text "Invalid Value".
 * <p>
 * Otherwise, if the parameter is valid then it needs to print a message in the format "XX min = YY y and ZZ d".
 * <p>
 * XX represents the original value minutes.
 * YY represents the calculated years.
 * ZZ represents the calculated days.
 * <p>
 * <p>
 * EXAMPLES OF INPUT/OUTPUT:
 * <p>
 * * printYearsAndDays(525600);  → should print "525600 min = 1 y and 0 d"
 * <p>
 * * printYearsAndDays(1051200); → should print "1051200 min = 2 y and 0 d"
 * <p>
 * * printYearsAndDays(561600);  → should print "561600 min = 1 y and 25 d"
 * <p>
 * <p>
 * TIPS:
 * <p>
 * * Be extra careful about spaces in the printed message.
 * <p>
 * * Use the remainder operator
 * <p>
 * * 1 hour = 60 minutes
 * <p>
 * * 1 day = 24 hours
 * <p>
 * * 1 year = 365 days
 * <p>
 * NOTES
 * <p>
 * * The printYearsAndDays method needs to be defined as public static like we have been doing so far in the course.
 * <p>
 * * Do not add main method to solution code.
 * <p>
 * * The solution will not be accepted if there are extra spaces
 */