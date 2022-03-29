package org.example;

public class Sort {

    /**
     * Should take in an array of two ints and changes it
     * to array with the numbers from smallest to largest.
     * @param nums
     */
    public static void sortTwo(int[] nums) {
        if(nums[0] > nums[1]) {
            int temp = nums[0];
            nums[0] = nums[1];
            nums[1] = temp;
        }
    }


    public static void mergeSort(int[] inputArray) {
        int inputLength = inputArray.length;
        if (inputLength < 2) {
            return;
        }
        int midIndex = inputLength / 2;
        int[]array1 = new int[midIndex];
        int[]array2 = new int[inputLength - midIndex];
        for (int i = 0; i < midIndex; i++) {
            array1[i] = inputArray[i];
        }
        for (int i = midIndex; i < inputLength; i++) {
            array2[i - midIndex] = inputArray[i];

        }
        mergeSort(array1);
        mergeSort(array2);
        merge(inputArray, array1, array2);
    }

    /**
     * This function should take the two arrays and merge them into the inputArray.
     * The result should be in order from smallest to largest, with all the numbers from both arrays included.
     * @param inputArray - The original array that will come back changed.
     * @param array1 - A sorted list of numbers that is the size of half the length of the inputArray
     * @param array2 - A sorted list of numbers that is the size of half the length of the inputArray
     */
    public static void merge(int[] inputArray, int[] array1, int [] array2) {
        int lSize = array1.length;
        int rSize = array2.length;
        int i = 0, j = 0, k = 0;
        while(i < lSize && j < rSize) {
            //compare the arrays and sort the numbers within them
            if(array1[i] < array2[j]) {
                // advance k always
                // add array1 at i to the inputarray
                inputArray[k] = array1[i];
                i++;
            } else {
                //add array2 at k to the inputarray
                inputArray[k] = array2[j];
                j++;
            }
            k++;
        }

        //clean out array1
        while(i < lSize) {
            inputArray[k] = array1[i];
            i++;
            k++;
        }
        //clean out array2
        while(j < rSize) {
            inputArray[k] = array2[j];
            j++;
            k++;
        }

    }
}
