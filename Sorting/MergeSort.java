package Sorting;

public class MergeSort {
    public static int[] partitionArray(int aar1) {

    }
    public static void main(String[] args) {
        int arr1[] = {2,3,4,5,6,7,8};
        int arr2[] = {12,14,15,16,18,20,30,44};
        int[] arr3 = new int[arr1.length + arr2.length];

        int i = 0;
        int j = 0;
        int k = 0;
        while(i < arr1.length && j < arr2.length) {
            if(arr1[i] <= arr2[j]) {
                arr3[k++] = arr1[i++];
            } else if(arr2[j] > arr1[i]) {
                arr3[k++] = arr2[j++];
            }
        }

        while(i < arr1.length) {
            arr3[k++] = arr1[i++];
        }

        while(j < arr2.length) {
            arr3[k++] = arr2[j++];
        }

        for(int p = 0 ; p < arr3.length ; p++) {
            System.out.print(arr3[p]+" ");
        }
    }
}
