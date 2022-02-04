package com.mohit.section5cotrolFlows;

public class SumChallenge {
    public static void main(String[] args) {
        sumChallenge3n5();
    }

    public static void sumChallenge3n5(){

        int sum=0;
        int count=0;
        for (int i=1;i<=10000;i++){
            if((i%3==0) && (i%5==0)){
               sum+=i;
               count++;
                System.out.println("Number "+i+" is divisible by both 3 and 5..");
            }
            if(count==5) break;
        }
        System.out.println("Sum of these 5 number is "+sum);
    }
}


/*
Create a for statement using a range of numbers from 1 to 1000 inclusive.

Sum all the numbers that can be divided with both 3 and also with 5.

For those numbers that met the above conditions, print out the number.

break out of the loop once you find 5 numbers that met the above conditions.

After breaking out of the loop print the sum of the numbers that met the above conditions.

Note: Type all code in main method

 */