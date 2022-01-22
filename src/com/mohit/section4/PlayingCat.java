package com.mohit.section4;

public class PlayingCat {
    public static void main(String[] args) {
        print(true, 10);
        print(false, 36);
        print(false, 35);
    }
    public static void print(boolean isSummer, int temperature){
        System.out.println("isCatPlaying("+isSummer+", "+temperature+") "+isCatPlaying(isSummer, temperature));
    }

    public static boolean isCatPlaying(boolean isSummer, int temperature) {
        if(isSummer) {
            return ((temperature >= 25) && (temperature <= 45));
        } else {
            return ((temperature >= 25) && (temperature <= 35));
        }
    }

}

/*
 * The cats spend most of the day playing. In particular, they play if the temperature is between 25 and 35 (inclusive). Unless it is summer, then the upper limit is 45 (inclusive) instead of 35.
 * <p>
 * <p>
 * Write a method isCatPlaying that has 2 parameters. Method needs to return true if the cat is playing, otherwise return false
 * <p>
 * 1st parameter should be of type boolean and be named summer it represents if it is summer.
 * 2nd parameter represents the temperature and is of type int with the name temperature.
 * <p>
 * <p>
 * EXAMPLES OF INPUT/OUTPUT:
 * <p>
 * * isCatPlaying(true, 10); should return false since temperature is not in range 25 - 45
 * <p>
 * * isCatPlaying(false, 36); should return false since temperature is not in range 25 - 35 (summer parameter is false)
 * <p>
 * * isCatPlaying(false, 35); should return true since temperature is in range 25 - 35
 * <p>
 * <p>
 * NOTES
 * <p>
 * * The isCatPlaying method needs to be defined as public static like we have been doing so far in the course.
 * <p>
 * * Do not add the main method to the solution code.
 */