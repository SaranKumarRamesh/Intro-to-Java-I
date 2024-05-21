package javaBasics.javaBasics;
import java.util.Scanner;

public class enumLoopWhile {
    public static void main1(String[] args){
        for(int i = 1;i<=5;++i){
            for(int j=1;j<=i;++j) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    //--------------
    public static void main2(String[] args) {
        int j = 50;
        for (int i = 0; i < 50; i++) {

            System.out.println(j-i);
        }

    }
    //--------------
    public static void main3(String[] args){
//                for(char cloop = 'a'; cloop<= 'z'; cloop++){
//                        System.out.println(cloop);
//                }
        int i = 1;
        for (char cloop = 'a'; cloop<= 'z'; cloop++){
            cloop = (char)('a' + i);
            System.out.println(cloop);
        }
    }

    public enum Days { Sunday,  Monday, Tuesday, Wednesday, Thursday, Friday, Saturday }
    public enum Months {Jan, Feb, Mar, Apr, May , Jun, Jul ,Aug,Sep, Oct, Nov, Dec}
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int input;
        System.out.println("enter val: ");
        input = sc.nextInt();
        for(int i=1; i <= 10; i++ ){
            System.out.print(input * i + " ");
        }
        System.out.println("\n");

        //----------
        Days days;
        for(Days d: Days.values() ) {
            System.out.println(d);
        }
        System.out.println("My favorite day of the week is " + Days.Saturday);
        //-----------
//                Months num;
        for(Months d: Months.values() ) {
            System.out.println(d);
        }
        System.out.println("My favorite month of the year is " + Months.Oct);

        double total = 0, price;
        while(total<100) {
            System.out.println("Total is " + total + ". Enter a price for new total ");
            price = sc.nextDouble();
            total+= price;
        }

    }
}

