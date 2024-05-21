package javaBasics.javaBasics;

import java.util.Scanner;

public class findIfPointInsideOrOutsideTriangle {
    public static void main(String[]args){
        //Import and declare scanner class
        Scanner myInput = new Scanner(System.in);

        //Prompt user for input
        System.out.println("Enter Point: ");
        int x = myInput.nextInt();
        int y = myInput.nextInt();
        int x1 = 0, y1 = 0, x2 = 200 , y2 = 0, x3 = 0, y3 = 100;

        //Calculate the Area of given triangle ABC
        double A = Math.abs((x1*(y2-y3) + x2*(y3-y1)+ x3*(y1-y2))/2.0);

        //Calculate the area of triangle with point x
        double A1 = Math.abs((x*(y2-y3) + x2*(y3-y)+ x3*(y-y2))/2.0);

        //Calculate the area of triangle with point x
        double A2 = Math.abs((x1*(y-y3) + x*(y3-y1)+ x3*(y1-y))/2.0);

        ////Calculate the area of triangle with point x
        double A3 = Math.abs((x1*(y2-y) + x2*(y-y1)+ x*(y1-y2))/2.0);

        //Display the Output
        if(A == A1 + A2 + A3){
            System.out.println("The point is in the triangle");
        }else{
            System.out.println("The point is NOT in the triangle");
        }
    }
}
