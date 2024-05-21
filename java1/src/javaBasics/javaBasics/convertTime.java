package javaBasics.javaBasics;

import java.util.Scanner;

public class convertTime {
    public static void main( String[] args )
    {
        // Scanner to read input from
        Scanner input = new Scanner( System.in );

        // Number of minutes input by the user
        int inputMinutes;

        // Calculated number of hours
        int hours;

        // Calculated number of minutes
        int remainingMinutes;

        System.out.print( "Enter the number of minutes: " );
        inputMinutes = input.nextInt();

        hours = inputMinutes / 60;
        remainingMinutes = inputMinutes % 60;

        System.out.print(  "Time is " );

        if ( hours > 0 )
        {
            if ( hours == 1 )
            {
                System.out.print( "1 hour" );
            }
            else
            {
                System.out.print(  hours + " hours" );
            }

            if ( remainingMinutes >= 0 )
            {
                System.out.print(  " and " );
            }
            else
            {
                System.out.println( "." );
            }
        }

        if ( remainingMinutes > 0 )
        {
            if ( remainingMinutes == 1 )
            {
                System.out.println( "1 minute." );
            }
            else
            {
                System.out.println( remainingMinutes + " minutes." );
            }
        }
    }
}
