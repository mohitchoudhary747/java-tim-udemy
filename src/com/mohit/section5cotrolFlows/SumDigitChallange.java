package com.mohit.section5cotrolFlows;

public class SumDigitChallange {
    public static void main(String[] args) {
        sumDigitBetter(125);
        sumDigitBetter(-1);
    }

    public static int sumDigit(int number) {
        int sum = 0;
        if (number < 10) {
            System.out.println("-1");
            return -1;
        }


        String str = Integer.toString(number);
        for (int i = 0; i < str.length(); i++) {
            char singleDigit = str.charAt(i);
            sum += Character.getNumericValue(singleDigit);
        }
        System.out.println(sum);
        return sum;
    }


    // 125 > 125%10 > digit=5 | 125/10 > number=12
    // 12 > 12%10 > digit=1 | 12/10 > number=1.2 or 1 as int
    // 1 > 12%1 > 1 | 1/10 > 0.1 or 0 as int, finally exiting the for loop
    public static int sumDigitBetter(int number) {
        int sum = 0;
        if (number < 10) {
            System.out.println("-1");
            return -1;
        }
        while (number > 0) {

            int digit = number % 10;
            sum += digit;
            number /= 10;

        }
        System.out.println(sum);
        return sum;
    }
}
