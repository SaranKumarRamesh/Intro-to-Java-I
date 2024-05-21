package javaBasics.javaBasics;

import java.util.Scanner;

public class colorNestedIf {
    public static void main(String[]args){
        Scanner myInput = new Scanner(System.in);
        System.out.println("Enter years ");
        String gender = String.valueOf(myInput.next().charAt(0));
        System.out.println(" ");
        String color = String.valueOf(myInput.next().charAt(0));

        if(gender.equals("M")){
            if(color.equals("Y")){
                System.out.println("55");
            }
            else if(color.equals("N")){
                System.out.println("18");
            }
        }
        else if(gender.equals("F")){
            color = String.valueOf(80);
        }
        System.out.println();

    }
}
