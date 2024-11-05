public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {3,5,8,1,3,0,5,14,11};
        int element = 0;
        for(int i = 0 ; i < arr.length ; i++) {
            if(arr[i] == element) {
                System.out.println("Index : "+i);
            }
        }
    }
}