package javaBasics.javaBasics;

import java.util.Scanner;

public class intrestRateSwitchCase {
    public static void main(String[]args){
        Scanner myInput = new Scanner(System.in);
        System.out.println("Enter years ");
        int years = myInput.nextInt();
        switch(years){
            case 10:
                System.out.println("Interest rate is 6%");
                break;
            case 20: case 25:
                System.out.println("Interest rate is 6.5%");
                break;
            case 30:
                System.out.println("Interest rate is 7%");
                break;
        }
    }
}
