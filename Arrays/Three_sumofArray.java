import java.util.Scanner;

public class Three_sumofArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter no. of elements in an array ");
        int n = scn.nextInt();
        
        System.out.println("Enter "+n+" elements of array");
        int[] arr = new int[n];
        for(int i = 0 ; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }

        //Sum Logic
        int sum = 0;
        for(int i = 0 ; i < arr.length; i++) {
            sum += arr[i];
        }

        System.out.println(sum);


    }
}
