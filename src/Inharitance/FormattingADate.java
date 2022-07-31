package Inharitance;

import java.text.SimpleDateFormat;
import java.util.Date;

public class FormattingADate {
    public static void main(String[] args) {
        printFormattedDate();
    }
    static void printFormattedDate(){
        Date d= new Date();
        String datePattern="dd-MM-yyyy hh:mm:ss";
        SimpleDateFormat format=new SimpleDateFormat(datePattern);
        String finalDate=format.format(d);
        System.out.println(finalDate);

    }
}
