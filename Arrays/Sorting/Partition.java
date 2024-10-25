package Sorting;

public class Partition {

    public static int swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }
    public static void main(String[] args) {
        int[] arr = {2,4,3,9,5,99,44,0};
        int i = 0;
        int j = 0;
        int pivot = arr[0];
        while(i < j) {
            if(arr[i] > pivot) {
                i++;
            } else {
                swap(arr[i],arr[j]);
                i++;
                j++;
            }
        }
        
    }
}
