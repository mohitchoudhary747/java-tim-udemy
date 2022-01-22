package com.mohit.section4;

public class SecondsAndMinuteChallange {
    public static void main(String[] args) {
        getDurationString(65, 45);
        getDurationString(120, 21);
        getDurationString(59, 60);
        getDurationString(-41);
        getDurationString(3945);
    }

    public static String getDurationString(int minutes, int seconds) {
        if (seconds == 60) {
            minutes += 1;
            seconds = 0;
        }
        if ((minutes < 0) || (seconds < 0) || (seconds > 59)) {
            System.out.println("Not a valid minutes> " + minutes + " | Not a valid seconds> " + seconds);
            return "Invalid Value";
        }
        int hours = minutes / 60;
        int mints = minutes % 60;

        String val = hours + "h " + mints + "m " + seconds + "s";
        System.out.println(val);
        return val;
    }


    public static String getDurationString(int seconds) {
        if (seconds < 0) {
            System.out.println(seconds + " seconds not a valid seconds");
            return "Invalid Value";
        }

        int mints = seconds / 60;
        int remainingSeconds = seconds % 60;
        return (getDurationString(mints, remainingSeconds));
    }
}
