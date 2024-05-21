package javaBasics.javaBasics;

import java.util.Scanner;

public class calculateSmallestTerenery {
    public static void main(String[]args){
        //compare 3 numbers to find smallest using ternary function
        Scanner sc = new Scanner(System.in);
        System.out.println("enter num");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        String result = num1 < num2 ? (num1 < num3 ? "num1 is smallest" : "num3 is smallest") : (num2 < num3 ? "num2 is smallest" : "num3 is smallest");
        System.out.println(result);
    }
}
