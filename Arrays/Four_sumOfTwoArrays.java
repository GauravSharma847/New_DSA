import java.util.Scanner;

public class Four_sumOfTwoArrays {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter no. of elements in an array ");
        int n1 = scn.nextInt();

        System.out.println("Enter " + n1 + " elements of array 1");
        int[] arr1 = new int[n1];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = scn.nextInt();
        }

        System.out.println("Enter no. of elements in an array ");
        int n2 = scn.nextInt();
        System.out.println("Enter " + n2 + " elements of array 2");
        int[] arr2 = new int[n2];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = scn.nextInt();
        }

        int[] sumArr = new int[n1 > n2 ? n1 : n2];

        int car = 0;
        int i = arr1.length;
        int j = arr2.length;
        int k = sumArr.length;

        while (k >= 0) {
            int digit = car;

            if (i >= 0) {
                digit += arr1[i];
            }

            if (j >= 0) {
                digit += arr2[j];
            }

            car = digit / 10;
            digit = digit % 10;

            sumArr[k] = digit;

            i--;
            j--;
            k--;
        }

        if (car != 0) {
            System.out.println(car + "\t");
        }

        for (int val : sumArr) {
            System.out.println(val + "\t");
        }
    }
}
