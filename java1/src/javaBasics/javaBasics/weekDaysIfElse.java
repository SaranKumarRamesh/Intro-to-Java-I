package javaBasics.javaBasics;

import java.util.Scanner;

public class weekDaysIfElse {
    public static void main(String[] args) {
        int  dayNum;
        Scanner myInput = new Scanner(System.in);
        System.out.println(" enter num");
        dayNum = myInput.nextInt();
        if(dayNum == 1){
            System.out.println("Monday");
        } else if(dayNum == 2){
            System.out.println("Tuesday");
        }else if(dayNum == 3){
            System.out.println("Wednesday");
        }else if(dayNum == 4){
            System.out.println("Thursday");
        }else if(dayNum == 5){
            System.out.println("Friday");
        }else if(dayNum == 6 || dayNum == 7){
            System.out.println("Week-end");
        }else{
            System.out.println("Invalid day");
        }
    }
}
