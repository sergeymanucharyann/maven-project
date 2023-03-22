package com.bdg.algorithms;

/**
 * In SortingAlgorithms class is writen few sorting algorithms.
 */
public class SortingAlgorithms {
    /**
     * This method works by examining each set of adjacent elements in the int,
     * from left to right, switching their positions if they are out of order.
     *
     * @param arr int[]
     * @return int[]
     */
    public int[] bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int change = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = change;
                }
            }
        }
        return arr;
    }

    /**
     * IN This method I write selection sorting algorithm.
     * The algorithm repeatedly selects the smallest (or largest) element
     * from the unsorted portion of the list and swaps it with the first
     * element of the unsorted portion.
     *
     * @param arr int[]
     * @return int[]
     */
    public int[] selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int change = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = change;
        }
        return arr;
    }

    /**
     * In this method I write insertion sorting algorithm.
     * In this method the array is virtually split into a sorted and an unsorted part.
     * Values from the unsorted part are picked and placed at the correct
     * position in the sorted part
     *
     * @param arr int[]
     * @return int[]
     */
    public int[] insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
        return arr;
    }

}
