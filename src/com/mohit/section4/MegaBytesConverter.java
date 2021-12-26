package com.mohit.section4;

public class MegaBytesConverter {
    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(2500);
        printMegaBytesAndKiloBytes(-1024);
        printMegaBytesAndKiloBytes(5000);
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes){

        int megabytes=0, remainingKilobytes=0;
        if(kiloBytes<0){ System.out.println("Invalid Value");}
        else {
            megabytes = Math.round(kiloBytes / 1024);
            remainingKilobytes = Math.round(kiloBytes % 1024);
            System.out.println(kiloBytes + " KB = " + megabytes + " MB and " + remainingKilobytes + " KB");
        }
    }
}
