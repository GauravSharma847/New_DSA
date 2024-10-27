package Sorting;
import java.util.Scanner;
import java.util.Arrays;
public class BubbleSort {

    public static void swap(int[] arr, int i , int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void bubbleSort(int[] arr)  {
        int len = arr.length;
        for(int i = 0 ; i < len ; i++){
            for(int j = 1 ; j < len ; j++) {
                if(arr[j-1] > arr[j]){
                    swap(arr,j - 1,j);
                    // int temp = arr[j - 1];
                    // arr[j - 1] = arr[j];
                    // arr[j] = temp;
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
        bubbleSort(arr);

        System.out.println("After  Sorting "+Arrays.toString(arr));

   } 
}
