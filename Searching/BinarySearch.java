public class BinarySearch {

    public static int binarySearch(int[] arr,int low, int high,int value) {
        int mid = (low + high) / 2;
        while(low <= high) {
            if(value == arr[mid]) {
                return mid;
            }else if(value < arr[mid]) {
                high = mid - 1;
            } else if(value > arr[mid]) {
                low = mid + 1;
            }

        }
        return - 1;
    }
    public static void main(String[] args) {
        int[] arr = {3,5,8,1,3,0,5,14,11};
        int element = 0;

        int indexBin = binarySearch(arr,0,arr.length - 1,element);
        System.out.println(indexBin);
    }
}
