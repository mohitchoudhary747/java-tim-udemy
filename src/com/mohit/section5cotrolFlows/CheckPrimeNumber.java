package com.mohit.section5cotrolFlows;

public class CheckPrimeNumber {
    public static void main(String[] args) {
        getThreePrimeNumbers(1,100);
//        for(int i=1;i<100;i++){
//            if(isPrimeNumber(i))
//            System.out.println(i);
//        }
    }


    public static void getThreePrimeNumbers(int startIndex, int endIndex){

        if(endIndex<=0 || startIndex>endIndex) {
            String c=String.format("Not Valid Range startIndex> %s,  endIndex> %s | Range Should be between 1 to 999999)",startIndex, endIndex);
            System.out.println(c);
            return;
        }
        int count=0;
        for (int i=startIndex;i<=endIndex;i++){
            if(isPrimeNumber(i)){
                System.out.println("Is a Prime Number> "+i);
                count++;
            }
            if(count==5) break;
        }
    }


    public static boolean isPrimeNumber(int number) {

        if (number == 1) {
            return false;
        }
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
