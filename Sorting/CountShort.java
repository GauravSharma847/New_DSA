package Sorting;
import java.util.Arrays;

public class CountShort {
    public static void main(String[] args) {
        int[] arr1 = {4,2,7,3,3,1};

        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i < arr1.length ; i++) {
            if(arr1[i] > max) {
                max = arr1[i];
            }
        }
        System.out.println(max);
        int[] count = new int[max + 1];

        for(int i = 0 ; i < arr1.length ; i++) {
            count[arr1[i]]++;
        }
        System.out.println(Arrays.toString(count));

        for(int i = 1 ; i <= max ; i++) {
            count[i] += count[i - 1];
        }
        System.out.println(Arrays.toString(count));

        int[] resultArr = new int[arr1.length];
        int x;
        for(int i = 0 ; i < resultArr.length ; i++) {
            int indx = arr1[i];
            x = count[indx] - 1;
            resultArr[x] = indx;
            count[indx]--;
        }

        System.out.println(Arrays.toString(resultArr));
        
        
    }
}
