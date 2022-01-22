package com.mohit.section5cotrolFlows;

public class DayFOfTheWeekChallenge {

    public static void main(String[] args) {
        printDayOfTheWeek(-1);
        printDayOfTheWeek(0);
        printDayOfTheWeek(1);
        printDayOfTheWeek(2);
        printDayOfTheWeek(3);
        printDayOfTheWeek(4);
        printDayOfTheWeek(5);
        printDayOfTheWeek(6);
        printDayOfTheWeek(10);
    }
    public static void printDayOfTheWeek(int day){

        String dayName;
        switch (day){
            case 0: dayName="Sunday"; break;
            case 1: dayName="Monday"; break;
            case 2: dayName="Tuesday"; break;
            case 3: dayName="Wednesday"; break;
            case 4: dayName="Thursday"; break;
            case 5: dayName="Friday"; break;
            case 6: dayName="Saturday"; break;
            default: dayName="Invalid Day"; break;
        }

        String messge=String.format("Day of the week for the given input day number is %s and name of the day is = %s",day, dayName);
        System.out.println(messge);
    }
}
