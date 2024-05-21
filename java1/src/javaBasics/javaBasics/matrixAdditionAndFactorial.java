package javaBasics.javaBasics;

public class matrixAdditionAndFactorial {
    public static int[][] addMatrix(int[][] aOne, int[][] aTwo){
        int[][] result ;
        if(aOne.length == aTwo.length && aOne[0].length == aTwo[0].length){
            result = new int[aOne.length][aOne[0].length];
            for(int i = 0; i< aOne.length; i++){
                for(int j = 0; j< aOne[i].length; j++){
                    result[i][j] = aOne[i][j] + aTwo[i][j];
                }
            }
        }else{
            result = new int[][]{{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};
        }
        return result;
    }
    public static int[][] factorialAdd(int[][] aVals){
        for(int i = 0; i<aVals.length; i++){
            for(int j = 0; j<aVals[i].length;j++){
                int value = 1;
                for(int k = aVals[i][j]; k>1 ;k--){
                    if(aVals[i][j] == 0) {
                        break;
                    }
                    value = value * k;
                    if (k==2) {
                        aVals[i][j] = value;
                        break;
                    }
                }
            }
        }
        return aVals;
    }
}
