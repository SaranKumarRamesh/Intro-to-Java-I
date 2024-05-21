package javaBasics.javaBasics;

import java.util.Scanner;

public class clssTrnglPatns {
    public static void main(String[] args) {
        Scanner myDecInput = new Scanner(System.in);
        //---------------
        System.out.print("Enter a decimal number: ");
        int iNum = myDecInput.nextInt();

        for (int i = 0; i < iNum; i++){
            for (int j = 0; j <= iNum; j++){
//                System.out.print(i*j + "\t");
                System.out.printf("%-4d" ,i*j);

            }
            System.out.println();
        }

        //---------------
        int iRow, iCol;
        do{
            System.out.print("Enter Row number from 1 to 24: ");
            iRow = myDecInput.nextInt();

        }while(iRow < 1 || iRow > 24);
        System.out.println("Row Accepted");

        do{
            System.out.print("Enter Column number from 1 to 80: ");
            iCol = myDecInput.nextInt();

        }while(iCol < 1 || iCol > 80);
        System.out.println("Column Accepted");


        for (int i = 0; i <= iRow; i++){
            for (int j = 0; j <= iCol; j++){
//               System.out.print(i*j + "\t");
                System.out.printf("*" );
            }
            System.out.println();
        }
        //---------------
    }
}