package com.mohit.section5cotrolFlows;

public class CharSwitch {
    public static void main(String[] args) {

        switchCheck('A');

    }
    public static void switchCheck(char charValue){
        switch(charValue){
            case 'A': case 'B': case 'C': case 'D': case 'E': case 'F': {
                System.out.println(charValue+" Found");
                break;
            }
            default:
                System.out.println("A, B, C, D, E, F Not Found");
                break;
        }
    }
}
