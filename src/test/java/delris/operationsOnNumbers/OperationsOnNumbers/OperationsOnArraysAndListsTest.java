package delris.operationsOnNumbers.OperationsOnNumbers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class OperationsOnArraysAndListsTest {

    private final int[] firstArray = new int[100];
    private final int[] secondArray = new int[100];
    private final int[] thirdArray = new int[50];
    private final int[] twoSumArray = new int[]{1,1,2,3,4,5,6,7,8,9,10};
    private final int[] validTargetNumbers = new int[]{2,2,3,4,5,6,7,8,9,10};
    OperationsOnArraysAndLists operationsOnArraysAndLists = new OperationsOnArraysAndLists();

    void fillValues(int[] firstArray, int[] secondArray, int firstValue, int secondValue){
        Arrays.fill(firstArray, firstValue);
        Arrays.fill(secondArray,secondValue);
    }
    @Test
    void findMedianOfTwoArrays() throws Exception {
        Arrays.fill(thirdArray, 10);
        fillValues(firstArray, secondArray, 1, 2);
        assert operationsOnArraysAndLists.findMedianOfTwoArrays(firstArray, secondArray) == 1.5;
        fillValues(firstArray, secondArray, 3, 4);
        assert operationsOnArraysAndLists.findMedianOfTwoArrays(firstArray, secondArray) == 3.5;
        fillValues(firstArray, secondArray, 5, 5);
        assert operationsOnArraysAndLists.findMedianOfTwoArrays(firstArray, secondArray) == 5;
        assert operationsOnArraysAndLists.findMedianOfTwoArrays(firstArray, thirdArray) == 5;
        assert operationsOnArraysAndLists.findMedianOfTwoArrays(thirdArray, firstArray) == 5;
        assert operationsOnArraysAndLists.findMedianOfTwoArrays(secondArray, thirdArray) == 5;
        assert operationsOnArraysAndLists.findMedianOfTwoArrays(thirdArray, secondArray) == 5;

    }

    @Test
    void twoSumToTarget() throws Exception{
        for (int i = 0; i < validTargetNumbers.length-1; i++) {
            int[] buffArray = operationsOnArraysAndLists.twoSumToTarget(twoSumArray, validTargetNumbers[i]);
            assert buffArray[0] != -1;
        }
        for (int i = 0; i < validTargetNumbers.length-1; i++) {
            int[] buffArray = operationsOnArraysAndLists.twoSumToTarget(twoSumArray, validTargetNumbers[i]*20);
            assert buffArray[0] == -1;
        }
    }
}