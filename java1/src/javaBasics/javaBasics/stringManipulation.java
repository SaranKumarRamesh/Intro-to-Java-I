package javaBasics.javaBasics;

import java.util.Scanner;
public class stringManipulation {
    public static void main(String[]args){
        String firstName, address, address2, stringLength;
        firstName = "Flinstones";
        address = "123 Boulder Crescent";
        address2 = "Bedrock, SZ, Z9Z 9Z9";
//        stringLength = firstName +address+address2;
        System.out.println(firstName);
        System.out.println(address);
        System.out.println(address2);
        System.out.println("Length of street \"" + address + "\" is \n" + address.length());
        String word1 = "Hello", word2 = "World", word3 ="Have a nice day";
        System.out.print(word1 + " ");
        System.out.print(word2 + " \n");
        System.out.print(word3 + " ");
        System.out.println(word1 + "\n " + word2 + "\n " + word3);

        String sName1 = "Michael";
        System.out.print(sName1.lastIndexOf("i"));
        Scanner input = new Scanner(System.in);
        System.out.print("Input Your String: ");
        String sStr;
        sStr = input.next();
        String sStrLC;
        sStrLC = sStr.toLowerCase();
        String compare = sStr.equals(sStrLC) ? "True" : "False" ;
        if (sStr.equals(sStrLC)){
            System.out.print("True");
        }
        else{
            System.out.print("False");
        }
        Scanner input1 = new Scanner(System.in);
        System.out.print("Input Your String: ");
        String sStr1 = input1.next();
        int iPos = sStr1.indexOf(' ');
        String sStrWord = sStr1.substring(0, iPos);
        String sStrSub = sStr1.substring(iPos);
        sStrSub = sStrSub.trim();
    }
}
