package javaBasics.javaBasics;

import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class datesClasses {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Star Date: ");

        //Integer method
        double starDate = input.nextDouble();
        double day1 = (Math.round((starDate % 1.00) * 100));

        int day = (int) (day1);
        System.out.println("++ " + day);
        int year = (int) (starDate - day / 100);
        System.out.println("++ " + year);


        //        //String method___
        //        String s = input.nextLine();
        //        int start = s.indexOf(".");
        //        int year = Integer.parseInt(s.substring(0,start));
        //        System.out.println("++ " + year);
        //        int day = Integer.parseInt(s.substring(start+1));
        //        System.out.println("++ " + day);

        //        Output
        LocalDate myObj = LocalDate.ofYearDay(year, day);
        System.out.println(myObj);
    }

    public static void currentDate()
    {
        Date d1 = new Date();
        System.out.println("Current date is " + d1);
        Date d2 = new Date(2323223232L);
        System.out.println("Date represented is "+ d2 );
    }

    //        LocalDate date1 = LocalDate.of(2014, 9, 11);
    //        System.out.println(date1);
    //        LocalDate date2 = LocalDate.parse("2007-12-03");
    //        System.out.println(date2);
    //        LocalDate date3 = LocalDate.now();
    //        System.out.println(date3);
}
