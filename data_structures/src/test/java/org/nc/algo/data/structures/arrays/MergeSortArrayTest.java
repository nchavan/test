package org.nc.algo.data.structures.arrays;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class MergeSortedArrayTest {

    @ParameterizedTest
    @MethodSource("provideMergeArrays")
    public void mergeSortedArrays(int[] arr1, int[] arr2, int[] exp) {
        MergeSortedArray mergeSortedArray = new MergeSortedArray();
        int[] output = mergeSortedArray.mergeSortedArray(arr1, arr2);
        Assertions.assertThat(output)
                .contains(exp);

    }

    @ParameterizedTest
    @MethodSource("provideMergeArrays")
    public void mergeSortedArrays1(int[] arr1, int[] arr2, int[] exp) {
        MergeSortedArray mergeSortedArray = new MergeSortedArray();
        int[] output = mergeSortedArray.mergeSortedArraySwitchingElementsReduceSpace(arr1, arr2);
        Assertions.assertThat(output)
                .contains(exp);

    }

    @ParameterizedTest
    @MethodSource("provideMergeArrays")
    public void mergeSortedArraysUsingStreams(int[] arr1, int[] arr2, int[] exp) {
        MergeSortedArray mergeSortedArray = new MergeSortedArray();
        int[] output = mergeSortedArray.mergeArraysUsingStreams(arr1, arr2);
        Assertions.assertThat(output)
                .contains(exp);

    }

    private static Stream<Arguments> provideMergeArrays() {
        return Stream.of(
//                Arguments.of(null, null, new int[]{}),
//                Arguments.of(new int[]{}, new int[]{}, new int[]{}),
                Arguments.of(new int[]{1, 3, 5, 7}, new int[]{2, 4, 6, 8}, new int[]{1, 2, 3, 4, 5, 6, 7 ,8}),
                Arguments.of(new int[]{1, 7}, new int[]{1, 2, 8}, new int[]{1, 1, 2, 7, 8})
        );
    }
}