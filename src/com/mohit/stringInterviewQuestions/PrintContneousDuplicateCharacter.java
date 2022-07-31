package com.mohit.stringInterviewQuestions;

import java.util.HashSet;
import java.util.Set;

public class PrintContneousDuplicateCharacter {
    public static void main(String[] args) {
        String myString = "aaaffttaaa";
        //expected: a3f2t2a3
        printSubsequentEachCharacterCount(myString);

    }
    static void printSubsequentEachCharacterCount(String str) {

        Set<Character> uniqueWords = new HashSet<>();
        for (char c : str.toCharArray()) {
            uniqueWords.add(c);

        }

        System.out.println(uniqueWords);
        char[] arr=str.toCharArray();
        int count=0;
        for(int i=0;i<arr.length;i++ ){

//            System.out.println(uniqueWords.contains(Character.valueOf(arr[i])));
            if(uniqueWords.contains(arr[i])){
                count++;
            }
            if( (i< arr.length-1) && arr[i]!=arr[i+1]){
                System.out.print(arr[i]+""+count);
                count=0;
            } else if(i== arr.length-1)
            {
                System.out.print(arr[i]+""+count);
            }
        }
    }

}
