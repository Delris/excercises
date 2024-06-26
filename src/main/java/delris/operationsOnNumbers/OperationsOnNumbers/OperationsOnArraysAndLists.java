package delris.operationsOnNumbers.OperationsOnNumbers;

import java.util.Arrays;

public class OperationsOnArraysAndLists {

    public int findMedianOfTwoArrays(int[] array1, int[] array2) throws Exception{
        if(array1.length == 0 && array2.length == 0){
            throw new Exception("Wrong input data, one of the arrays is empty");
        }
        int[] mergedArray = new int[array1.length + array2.length];
        Arrays.sort(mergedArray);
        if(mergedArray.length%2 == 0){
            return mergedArray[(mergedArray.length/2) + (mergedArray.length/2+1)];
        } else {
            return mergedArray[(mergedArray.length/2)+1];
        }
    }

    public int[] twoSumToTarget(int[] array, int target) throws Exception{
        if(array.length < 2){
            throw new Exception("Array contains less than 2 elements");
        }
        for (int i = 0; i < array.length-1; i++) {
            for (int j = 0; j < array.length-1; j++) {
                if(i == j){
                    j += 1;
                }
                if(array[i] + array[j] == target){
                    return new int[]{array[i], array[j], target};
                }
            }
        }
        return new int[]{-1};
    }


}
