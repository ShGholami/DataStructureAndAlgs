package algorithms.sorts.quicksort;

import java.util.Arrays;

public class QuickSort {

    public static void quickSort(int[] array) {
        quickSortHelper(array, 0, array.length-1);
    }

    public static void quickSortHelper(int[] array, int left, int right) {
        if (left < right) {
            int pivotIndex = pivot(array, left, right);
            quickSortHelper(array, left, pivotIndex - 1);
            quickSortHelper(array, pivotIndex + 1, right);
        }
    }

    public static int pivot(int[] array, int pivotIndex, int endIndex) {
        int swapIndex = pivotIndex;
        for (int i = pivotIndex + 1; i <= endIndex; i++) {
            if (array[i] < array[pivotIndex]) {
                swapIndex++;
                swap(array, swapIndex, i);
            }
        }
        swap(array, pivotIndex, swapIndex);
        return swapIndex;
    }

    public static void swap(int[] array, int firstIndex, int secondIndex) {
        int temp = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = temp;
    }

    public static void main(String[] args) {
        /*
        int[] myArray = {4, 6, 1, 7, 3, 2, 5};
        System.out.println("My array before pivot method: " + Arrays.toString(myArray));
        int returnedIndex = pivot(myArray, 0, 6);
        System.out.println("My array after pivot method: " + Arrays.toString(myArray));
        System.out.println("Returned Index: " + returnedIndex);
         */

        /*
        int[] myArray = {4, 6, 1, 7, 3, 2, 5};
        System.out.println("My array before quicksort method: " + Arrays.toString(myArray));
        quickSort(myArray, 0, 6);
        System.out.println("My array after quicksort method: " + Arrays.toString(myArray));
         */

        int[] myArray = {4, 6, 1, 7, 3, 2, 5};
        System.out.println("My array before quicksort method: " + Arrays.toString(myArray));
        quickSort(myArray);
        System.out.println("My array after quicksort method: " + Arrays.toString(myArray));
    }
}
