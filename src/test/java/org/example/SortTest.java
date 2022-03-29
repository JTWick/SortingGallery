package org.example;

import junit.framework.TestCase;

import java.util.Arrays;

public class SortTest extends TestCase {

    public void testSortTwo() {
        int[] unorderedArray = new int[] {82, 19};
        int[] orderedArray = new int[] {19, 82};
        int[] expectedArray = new int[] {19, 82};
        Sort.sortTwo(unorderedArray);
        assertTrue(Arrays.equals(unorderedArray,expectedArray));
        assertTrue(Arrays.equals(orderedArray,expectedArray));
    }

    public void testMerge() {
        int[] startingArray = new int[] {19,5,34,81,17,22,6};
        int[] leftHalf = new int[] {5,19,34,81};
        int[] rightHalf = new int[] {6,17,56};
        int[] expectedResult = new int[] {5,6,17,19,34,56,81};
        Sort.merge(startingArray,leftHalf,rightHalf);
        assertTrue(Arrays.equals(startingArray, expectedResult));
    }
    public void testMergeSort() {
        int[] notSorted = new int[] {19,5,34,81,17,22,6};
        Sort.mergeSort(notSorted);
        int[] sorted = new int[] {5,6,17,19,22,34,81};
        assertTrue(Arrays.equals(notSorted, sorted));
    }
}