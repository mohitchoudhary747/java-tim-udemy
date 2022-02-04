package com.mohit.section5cotrolFlows;

public class CalculateInterest {
    public static void main(String[] args) {

        for (int i = 1; i <= 9; i++) {
//            System.out.println("For amount 10,000 with interest rate " + i + "% is > " + calculateInterest(10000.0, i));
            System.out.println("For amount 10,000$ with interest rate " + i + "% is > " +
                    String.format("%.2f",calculateInterest(10000.0, i))+"$");
        }

    }

    public static double calculateInterest(double amount, int interestRate) {
        return  (amount * ((double)interestRate / 100));
    }
}
