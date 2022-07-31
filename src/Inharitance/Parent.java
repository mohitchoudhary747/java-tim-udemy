package Inharitance;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Parent {
    String a="Parent";

    String overridden="From Parent";

    public void checkMethod(){
        System.out.println("Super checkMethod");
        ArrayList lis= new ArrayList();
        lis.add(3);
        lis.add("d");


        checkDuplicateString("Mohit choudhary is Mohit");


    }

    public static void checkDuplicateString(String s){
        Set<String> uniqueWords=new HashSet<>();
        for(String word:s.split("")){
            if(!(uniqueWords.contains(word))){
                uniqueWords.add(word);
            }
        }
        System.out.println(uniqueWords);
    }


}
