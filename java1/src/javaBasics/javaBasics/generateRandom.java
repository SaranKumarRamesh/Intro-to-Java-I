package javaBasics.javaBasics;

import java.util.Scanner;

public class generateRandom {
    public static void main(String[] args) {
        Scanner range = new Scanner(System.in);
        int upperLimit,lowerLimit;
        System.out.print("Input Upper Limit: ");
        upperLimit = range.nextInt();
        System.out.print("Input Lower Limit: ");
        lowerLimit = range.nextInt();
        int randomValue = (int) (Math.random() * (upperLimit - lowerLimit + 1)) + lowerLimit;
        System.out.println("A randomly generated value is " + randomValue);
//        int randomNum = (int) (Math.random() * 11);
    }
}