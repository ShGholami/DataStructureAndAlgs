package algorithms.sorts.mergesort;

import java.util.Arrays;

public class MergeSort {

    public static int[] merge(int[] array1, int[] array2) {
        int[] combined = new int[array1.length + array2.length];
        int i = 0;
        int j = 0;
        int index = 0;

        while (i < array1.length && j < array2.length) {
            if (array1[i] < array2[j]) {
                combined[index] = array1[i];
                index++;
                i++;
            } else {
                combined[index] = array2[j];
                index++;
                j++;
            }
        }

        while (i < array1.length) {
            combined[index] = array1[i];
            index++;
            i++;
        }

        while (j < array2.length) {
            combined[index] = array2[j];
            index++;
            j++;
        }

        return combined;
    }

    public static int[] mergeSort(int[] array) {
        if (array.length == 1) return array;

        int mid = array.length / 2;
        int[] left = mergeSort(Arrays.copyOfRange(array, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(array, mid, array.length));

        return merge(left, right);
    }

    public static void main(String[] args) {
        int[] array1 = {1, 3, 7, 8};
        int[] array2 = {2, 4, 5, 6};

        System.out.println("array1: " + Arrays.toString(array1));
        System.out.println("array2: " + Arrays.toString(array2));
        System.out.println("Merge result of two sorted arrays: " + Arrays.toString(merge(array1, array2)));

        System.out.println("*".repeat(40));

        int[] originalArray = {3, 1, 4, 2};
        int[] sortedArray = mergeSort(originalArray);

        System.out.println("originalArray---> " + Arrays.toString(originalArray));
        System.out.println("sortedArray---> " + Arrays.toString(sortedArray));
    }
}
