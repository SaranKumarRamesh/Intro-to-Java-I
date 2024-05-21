package javaBasics.javaBasics;

public class basicFunctionIsevenOddPrimeParseIntEquals {
    private int value;

    public basicFunctionIsevenOddPrimeParseIntEquals(int value) {
        this.value = value;
    }
    public int getValue() {
        return value;
    }
    public boolean isEven(){
        return this.value % 2 ==  0;
    }
    public boolean isOdd(){
        return this.value % 2 ==  1;
    }
    public boolean isPrime(){
        if (this.value < 2) {
            return false;
        }
        for (int i = 2; i < this.value/2; i++) {
            if (this.value % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static boolean isEven(basicFunctionIsevenOddPrimeParseIntEquals iValue){
        return iValue.value % 2 ==  0;
    }
    public static boolean isOdd(basicFunctionIsevenOddPrimeParseIntEquals iValue){
        return iValue.value % 2 ==  1;
    }
    public static boolean isPrime(basicFunctionIsevenOddPrimeParseIntEquals iValue){
        if (iValue.value < 2) {
            return false;
        }
        for (int i = 2; i < iValue.value/2; i++) {
            if (iValue.value % i == 0) {
                return false;
            }
        }
        return true;
    }
    public boolean equals(int value){
        return this.value == value;

    }
    public boolean equals(basicFunctionIsevenOddPrimeParseIntEquals iValue){
        return this.value == iValue.value;
    }
    public static int parseInt(char[] chars){
        int result = 0;
        for(int i = 0; i< chars.length; i++){
            result= (int)(chars[i]);
        }
        return result;
    }

    public static int[] parseInt(String[] str){
        int [] result =  new int[str.length];
        for(int i = 0; i< str.length; i++){
            result[i] = Integer.parseInt(str[i]);
        }
        return result;
    }
}
