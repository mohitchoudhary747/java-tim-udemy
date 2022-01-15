package com.mohit.section4;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class DecimalComparator {
    public static void main(String[] args) {
        areEqualByThreeDecimalPlaces(3.22324244,545.54);
    }

    static void print(){

    }
    public static void areEqualByThreeDecimalPlaces(double first, double second){

        BigDecimal d1=new BigDecimal(first).setScale(3, RoundingMode.HALF_EVEN);

        System.out.println(d1);
    }
}
