package javaBasics.javaBasics;
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;
public class allTrianglePatterns {
    public static void main(String[] args) {
        int i, j, k;
        String a= "PROGRAM"; // index from 0 to 6

        //Matrix for i and j
        for (i = 0; i < 5; i++){
            for (j = 0; j < 5; j++){
                System.out.print(" " + i + j + " " );
            }
            System.out.println();
        }
        System.out.println("--Matrix for i and j--");
        //OR
        for ( i = 0; i < 5; i++){
            for ( j = 0; j < 5; j++){
                System.out.print("(" + i + "," + j + ")");
            }
            System.out.println();
        }

        //Block pattern
        for (i = 0; i < 5; i++){
            for (j = 0; j < 5; j++){
                System.out.print(" *");
            }
            System.out.println("  ");
        }
        System.out.println("--Block pattern--");

        //Square pattern
        for (i = 0; i < 5; i++){
            for (j = 0; j < 5; j++){
                if (j == 0 || i == 0 || j == 4 || i == 4){
                    System.out.print(" *");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println("--Square pattern--");

        //Right angle Triangle patterns
        for (i = 0; i < 5; i++){
            for (j = 0; j <= i; j++){
                System.out.print(" *");
            }
            System.out.println("  ");
        }
        System.out.println("--Right angle Triangle patterns--");

        //Upside down Right angle Triangle patterns
        for (i = 0; i < 5; i++){
            for (j = i; j < 5; j++){
                System.out.print(" *");
            }
            System.out.println("  ");
        }
        System.out.println("--Upside down Right angle Triangle patterns--");
        //OR
        for(i = 0; i < 5; i++ ){
            for(j = 5; j > i; j--){
                System.out.print("*");
            }
            System.out.println(" ");
        }
        System.out.println("--Upside down Right angle Triangle patterns--");


        //Isosceles Triangle
        for (i = 1; i < 5; i++){
            for (j = 5; j > i ; j--){
                System.out.print(" ");
            }
            for (j = 5-i ; j < 5 ; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("--Isosceles Triangle--");
        // Upside down Isosceles Triangle
        for (i = 5; i >= 1; i--){
            for (j = 5; j > i ; j--){
                System.out.print(" ");
            }
            for (j = 5-i ; j < 5 ; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("--Upside down Isosceles Triangle--");


//        //Right angle Triangle patterns on other side
        for (i = 0; i < 5; i++){
            for (j = 0; j < 5; j++){
                if (i >= j) {
                    System.out.print(" *");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println("Right angle Triangle patterns on other side");

        // Right angle triangle on other side
        for(i = 0; i < 5; i++ ){
            for(j = 5; j > i; j--){
                System.out.print(" ");
            }
            for(k = 0; k <= j; k++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("--Right angle triangle on other side--");

        //Upside down Right angle Triangle patterns
        for (i = 0; i < 5; i++){
            for (j = 0; j < 5; j++){
                if (j >= i) {
                    System.out.print(" *");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println("--Upside down Right angle Triangle patterns--");

        //Output a string in alternating patterns
        for (i = 0; i <= 6; i++) { // Both loops going in the same direction for the same range
            for (j = 0; j <= 6; j++) {
                if (j == i) {
                    System.out.print( a.charAt(i) );
                } else if( j + i == 6){
                    System.out.print( a.charAt(j) );
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println("--Output a string in alternating patterns--");
        //Accidental Pattern
        for(i = 1; i <= 5; i++ ){
            for(j = 5; j > i; j--){
                System.out.print("1");
            }
            for(k = 1; k <= 5 - i; k++){
                System.out.print("0");
            }
            System.out.println();
        }
        //Accidental Pattern
        for ( i = 5; i >= 1; i--){
            for (j = 1; j < i ; j++){
                System.out.print(" -");
            }
            for (j = 5-i ; j < 5 ; j++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}