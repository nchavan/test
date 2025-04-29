package org.nc.algo.data.structures.arrays;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MergeSortedArray {

    public int[] mergeSortedArraySwitchingElementsReduceSpace(int[] array1, int[] array2) {

        if (array2 == null && array1 == null) return new int[]{};
        if (array1 == null) return array2;
        if (array2 == null) return array1;

        int left = array1.length - 1, right = 0, index = 0;

        while (left >= 0 && right < array2.length) {
            if (array1[left] > array2[right]) {
                int temp = array1[left];
                array1[left] = array2[right];
                array2[right] = temp;
                left--;
                right++;
            } else {
                left--;
                right++;
            }
        }

        sort(array1);
        return array1;
    }

    public void sort(int[] array) {

    }

    public int[] mergeArraysUsingStreams(int[] array1, int[] array2) {
        return IntStream.concat(Arrays.stream(array1), Arrays.stream(array2))
                .filter(i -> i != 0)
                .sorted()
                .toArray();
    }

    public int[] mergeSortedArray(int[] array1, int[] array2) {

        if (array2 == null && array1 == null) return new int[]{};
        if (array1 == null) return array2;
        if (array2 == null) return array1;

        int[] mergeArrays = new int[array1.length + array2.length];
        int index1 = 0, index2 = 0, index = 0;

        while (index1 < array1.length && index2 < array2.length) {
            if (array1[index1] < array2[index2]) {
                mergeArrays[index++] = array1[index1++];
            } else {
                mergeArrays[index++] = array2[index2++];
            }
        }

        while (index1 < array1.length) {
            mergeArrays[index++] = array1[index1++];
        }

        while (index2 < array2.length) {
            mergeArrays[index++] = array2[index2++];
        }

        return mergeArrays;
    }
}
