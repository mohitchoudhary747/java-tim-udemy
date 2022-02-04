package com.mohit.randomPrograms;

public class A1Z26 {
    public static void main(String[] args) {
        print();
    }
public static void print(){
        int count=0;
        for(char a='A';a<='Z';a++){
            count++;
            String val=String.format("%s%s | ",a,count);
            System.out.print(val);
        }
}
}
/*
Write code to print "A1B2C3D4E5...Z26"?
 */