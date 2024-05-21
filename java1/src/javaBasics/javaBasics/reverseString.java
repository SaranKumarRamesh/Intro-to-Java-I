package javaBasics.javaBasics;

import java.util.Scanner;

public class reverseString {
    public static void main( String args[] )
    {
        Scanner scanner = new Scanner( System.in );

        System.out.println("Please enter a phrase: ");
        String phrase = scanner.nextLine();

        // Display the characters in the phrase in reverse order

        for( int charPosition = phrase.length() - 1; charPosition >= 0; --charPosition )
        {
            System.out.print( phrase.charAt( charPosition ) );
        }
        System.out.println();
    }
}
