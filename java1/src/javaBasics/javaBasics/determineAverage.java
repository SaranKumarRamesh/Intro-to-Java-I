package javaBasics.javaBasics;

import java.util.Scanner;

public class determineAverage
{

    /**
     * @param args
     */
    public static void main(String[] args)
    {
        Scanner input = new Scanner( System.in );
        int totalGrades = 0;
        int numberOfGrades = 0;
        int grade = 0;

        while( grade >= 0 )
        {
            // Read grade
            System.out.println("Enter grades - end with -1 for grade");
            grade = input.nextInt();

            totalGrades += grade;
            numberOfGrades++;
        }

        System.out.println("You entered " + numberOfGrades + " grades ");

        float average = totalGrades/numberOfGrades;

        System.out.println("The average grade was " + average );

    }

}
