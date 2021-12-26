package com.mohit.section4;

import org.jetbrains.annotations.Nullable;

public class YuktiOptionalMethods {

    public static void main(String[] args) {
//        optionalMethod("Mohit", 31, new String[] {"as","a"});
        optionalMethod("Mohit", 31,null);

    }

    public static void optionalMethod(String name, int age, @Nullable String abc){
        System.out.println("Age of "+name+" is "+age + " and height is "+abc);
//        System.out.println(abc.length);
    }
}
