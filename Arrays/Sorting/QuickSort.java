package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class QuickSort {

    public static int partition(int[] arr, int i, int j) {
        int pivot = i;

        if (i < j) {
            while (i < j) {
                while (i < j && arr[i] <= arr[pivot]) {
                    i++;
                }
                while (j > pivot && arr[j] > arr[pivot]) {
                    j--;
                }

                if (i < j) {
                    swap(arr, i, j);
                }

            }
            swap(arr, j, pivot);
        }
        return j;
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void quickSort(int[] arr, int i, int j) {
        if(i < j){

            int pIndx = partition(arr, i, j);
            quickSort(arr, i, pIndx - 1);
            quickSort(arr, pIndx + 1, j);
        }

    }

    public static void main(String[] args) {

        int[] arr = { 3, 6, 1, 2, 9, 0, 3, 4 };
        System.out.println("Before Sorting->" + Arrays.toString(arr));
        quickSort(arr, 0, arr.length - 1);

        System.out.println("After  Sorting " + Arrays.toString(arr));

    }
}
