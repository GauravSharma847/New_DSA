public class Two_barChart {
    public static void main(String[] args) {
        int[] arr = {3,1,0,7,5};

        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i < arr.length ; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }

        for(int i = max ; i >= 1 ; i--) {
            for(int j = 0 ; j < arr.length ; j++) {
                if(arr[j] >= i) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}
