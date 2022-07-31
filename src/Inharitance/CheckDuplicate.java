package Inharitance;

import java.util.HashSet;
import java.util.Set;

public class CheckDuplicate {
    public static void main(String[] args) {
        checkDuplicateString("Mohit choudhary is Mohit choudhary choudhary choudhary choudhary");


    }

    public static void checkDuplicateString(String s){
        String[] arr=s.split(" ");
        Set<String> uniqueWords=new HashSet<>();
        for(String word:s.split(" ")){
            if(!(uniqueWords.contains(word))){
                uniqueWords.add(word);
            }
        }
        System.out.println(uniqueWords);

        for(String q:uniqueWords){
            int count=0;
            for(String e:arr){
                if(q.equalsIgnoreCase(e)){
                    count++;
                }

        }
            if(count>1) {
                System.out.print(q);
                System.out.println(" And Occurance is " + count);
            }

        }
    }
}
