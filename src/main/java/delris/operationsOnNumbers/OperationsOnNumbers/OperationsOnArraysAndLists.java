package delris.operationsOnNumbers.OperationsOnNumbers;

import java.util.Arrays;

public class OperationsOnArraysAndLists {

    /**
     *
     * @param array1 first array to search trough
     * @param array2 second array to search trough
     * @return median in form of double
     * @throws Exception
     */
    public double findMedianOfTwoArrays(int[] array1, int[] array2) throws Exception{
        if(array1.length == 0 && array2.length == 0){
            throw new Exception("Wrong input data, one of the arrays is empty");
        }
        int[] mergedArray = new int[array1.length + array2.length];
        System.arraycopy(array1, 0, mergedArray, 0, array1.length);
        System.arraycopy(array2, 0, mergedArray, array1.length, array2.length);
        Arrays.sort(mergedArray);
        System.out.println(Arrays.toString(mergedArray));
        if(mergedArray.length%2 == 0){
            System.out.println("here");
            return (mergedArray[(mergedArray.length/2)-1] + mergedArray[(mergedArray.length/2)+1])/2.0;
        } else {
            return mergedArray[(mergedArray.length/2)+1];
        }
    }

    /**
     *
     * @param array array to search trough, must contain at least two numbers
     * @param target target number
     * @return returns array with three items, first digit, second digit and target number respectively
     * @throws Exception
     */
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
