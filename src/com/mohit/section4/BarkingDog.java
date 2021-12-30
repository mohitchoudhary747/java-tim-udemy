package com.mohit.section4;

public class BarkingDog {
    public static void main(String[] args) {
        print("shouldWakeUp(true,1)",shouldWakeUp(true,1));
        print("  shouldWakeUp(false,2)",  shouldWakeUp(false,2));
        print("shouldWakeUp(true,8)",shouldWakeUp(true,8));
        print("shouldWakeUp(true,-1)",shouldWakeUp(true,-1));
        print("shouldWakeUp(false,24)",shouldWakeUp(false,6));

    }
    public static  boolean shouldWakeUp(boolean isBarking,int hour){
        boolean flag=false;
        if(!isBarking){
            flag= false;}
            else if(hour<0){
            flag= false;}
            else if(hour>=0 && hour<8){
            flag= true;
            }
            else if(hour>=8 && hour<23)
            flag= false;
            else if(hour==23)
            flag= true;
            else flag= false;

            return flag;
        }


    public static void print(String a, boolean result){
        System.out.println(a+" -> "+result );
    }
}
