package com.mohit.section5cotrolFlows;

public class IntReverseChallenge {
    public static void main(String[] args) {

        System.out.println( reverseNumber(123));
    }
    public static int reverseNumber(int number){
        int reverse=0;
        while(number>0){
            int remainder=number%10;
            reverse=reverse*10+remainder;
            number=number/10;
        }
return reverse;
    }
}
