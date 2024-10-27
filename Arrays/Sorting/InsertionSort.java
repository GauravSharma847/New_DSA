package Sorting;

import java.util.Arrays;

public class InsertionSort {

    public static void swap(int[] arr, int i , int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void insertionSort(int[] arr) {

        // for(int i = 1 ; i < arr.length ; i++) {
        //     for(int j = i - 1; j >= 0 ; j--) {
        //         if(arr[j] < arr[j + 1]) {
        //             swap(arr, j + 1, j);
        //         } else {
        //             break;
        //         }
        //     }
        // }

        for (int i = 1; i < arr.length; i++) {
            for (int j = i - 1; j >= 0; j--) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                } else {
                    break;
                }
            }
        }
        
    }
    public static void main(String[] args) {
        // Scanner scn = new Scanner(System.in);
        // System.out.println("Eneter element number of array ");
        // int n = scn.nextInt();

        // int[] arr = new int[n];
        // System.out.println("Enter "+n+" array elements");
        // for(int i = 0 ; i < arr.length ; i++) {
        //     arr[i] = scn.nextInt();
        // }
        
        int[] arr = {3,6,1,2,9,0,3,4};
        System.out.println("Before Sorting->"+ Arrays.toString(arr));
        insertionSort(arr);

        System.out.println("After  Sorting "+Arrays.toString(arr));
}
}