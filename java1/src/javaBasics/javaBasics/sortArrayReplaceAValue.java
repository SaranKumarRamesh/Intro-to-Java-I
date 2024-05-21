package javaBasics.javaBasics;

import java.util.Arrays;

public class sortArrayReplaceAValue {
    public static void main(String[]args){
        int[] naTest1 = {12,5,7,3,2,1,4};
        int[] naTest2 = {12,5,7,0,2,1,4,8};
        int[] naTest3 = {6,8,6,9,1,6,7};


        System.out.println(Arrays.toString(medium(naTest1)));
        System.out.println(Arrays.toString(belowMedium(naTest2)));
        System.out.println(replace(naTest3, 6, 4));
    }
    public static int[] sort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            int maxIndex = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[maxIndex]) {
                    maxIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[maxIndex];
            arr[maxIndex] = temp;
        }
        return arr;
    }
    public static int[] medium(int[] aVals){
        int[] sortedArr = sort(aVals);
        int[] medium;
        if(sortedArr.length % 2 == 1){
            medium = new int[1];
            medium[0] = sortedArr[sortedArr.length/2];
        }else{
            medium = new int[2];
            medium[0] = sortedArr[sortedArr.length/2 - 1];
            medium[1] = sortedArr[sortedArr.length/2 + 1];
        }
        return medium;
    }

    public static int[] belowMedium(int[] aVals){
        int[] sortedArr = sort(aVals);
        int medium;
        if(sortedArr.length%2 == 1){
            medium = sortedArr[sortedArr.length/2];
        } else{
            medium = sortedArr[sortedArr.length/2 - 1];
        }
        int count = 0;
        for(int i = 0; i< aVals.length; i++){
            if(sortedArr[i] < medium){
                count++;
            }
        }
        int[] returnArr = new int[count];
        int counter = 0;

        for(int i = 0; i< aVals.length; i++) {
            if (aVals[i] < medium) {
                returnArr[counter++] = aVals[i];
            }
        }
        return returnArr;
    }

    public static boolean replace(int[] inArr ,  int searchVal, int replaceVal){
        boolean flag = false;
        for(int i = 0; i< inArr.length; i++) {
            if (inArr[i] == searchVal) {
                inArr[i]  = replaceVal;
                flag = true;
                break;
            }
        }
        return flag;
    }
}
