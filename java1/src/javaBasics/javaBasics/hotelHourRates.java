package javaBasics.javaBasics;
import java.util.Scanner;

public class hotelHourRates {
    public static void main(String[]args) {

        Scanner myInput = new Scanner(System.in);
        System.out.println("Enter S or R ");
        char cCity = myInput.next().charAt(0);
        System.out.println("Enter T or S or C");
        char cHotel = myInput.next().charAt(0);


        switch(cCity)
        {
            case 'S': case 's':
        {
            switch(cHotel)
            {
                case 'T':
                    System.out.println("Hotel rate $99");
                    break;
                case 'S':
                    System.out.println("Hotel rate $75");
                    break;
                case 'C':
                    System.out.println("Hotel rate $63");
                    break;
                default:
                    System.out.println("Hotel code invalid");
            }
            break;
        }
            case 'R': case 'r':
        {
            switch(cHotel)
            {
                case 'T':
                    System.out.println("Hotel rate $89");
                    break;
                case 'S':
                    System.out.println("Hotel rate $65");
                    break;
                case 'C':
                    System.out.println("Hotel rate $53");
                    break;
                default:
                    System.out.println("Hotel code invalid");


            }
        }
        }


    }
}
