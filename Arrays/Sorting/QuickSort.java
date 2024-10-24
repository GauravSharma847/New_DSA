package Sorting;
import java.util.Scanner;
public class QuickSort {

    public static int partition(int[] arr, int pivot,int low ,int  high) {
        // 0 to j - 1 -> <= pivot
        // j to i - 1 -> >= pivot
        // i to end -> unknown

        nt pivot = arr[high];  // Choose the last element as the pivot
        int i = low - 1;        // Index of the smaller element
        
        for (int j = low; j < high; j++) {
            // If the current element is smaller than or equal to the pivot
            if (arr[j] <= pivot) {
                i++;
                swap(arr, i, j);  // Swap arr[i] and arr[j]
            }
        }

        // Swap the pivot element with the element at i + 1 so pivot is at its correct position
        swap(arr, i + 1, high);
        return i + 1;
    }
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }

    public static void quickSort(int[] arr, int low, int high) {
        int pivot = arr[high];
        int pi = partition(arr, pivot, low, high);
        quickSort(arr, low, pivot - 1);
        quickSort(arr, pivot + 1, high);
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Num of array elements");
        int n = scn.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter array elements");
        for(int i = 0; i < arr.length ;  i++) {
            arr[i] = scn.nextInt();
        }

        quickSort(arr, 0, arr.length - 1);
        for(int i = 0 ; i < arr.length ; i++) {
            System.out.print("Sorted Array is : "+arr[i]+" ");
        }

    }
}
