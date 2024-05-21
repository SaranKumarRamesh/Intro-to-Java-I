package javaBasics.javaBasics;

import java.util.Random;

public class clssTrnglPaths2 {
    public static void main(String[]args){
        int iNum,iSum;
        do{
            System.out.print("Enter Row number from 1 to 1000: ");
            Random myDecInput = null;
            iNum = myDecInput.nextInt();

        }while(iNum < 1 || iNum > 1000);

        iSum = 1;
        for (int k = 2; k <= iNum/2; k++){
            if(iNum%k == 0){
                iSum+=k ;
            }
        }

        if(iSum == iNum){
            System.out.printf("The perfect number %d = 1 ", iNum);

            for (int k = 2; k <= iNum/2; k++){
                if(iNum%k == 0){
                    System.out.print(" + " + k);
                }
            }
        }
        //1, 6, 28, 496
    }
}