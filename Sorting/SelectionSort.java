package Sorting;

import java.util.Arrays;

public class SelectionSort {

    public static void swap(int[] arr,int i,int min){
        int temp = arr[i];
        arr[i] = arr[min];
        arr[min] = temp;
    }

    public static void selectionSort(int[] arr) {
        int min =0 ;
        // int i = 0;
        // int j = 1;
        for(int i = 0 ; i < arr.length - 1 ; i++) {
            for(int j = i+1 ; j < arr.length ; j++) {
                if(arr[j] < arr[min]){
                    min = j;
                }
            }
            swap(arr,i, min);
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
        selectionSort(arr);

        System.out.println("After Sorting ->"+Arrays.toString(arr));
    }
}
