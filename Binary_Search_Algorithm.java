package Parth;

public class Binary_Search_Algorithm {
    public static void main(String[] args) {
        int[] arr = {2,7,8,23,56,66,77,88};
        System.out.println(binarySearch(arr,77));
    }
    static int binarySearch(int[] arr, int target){
        int Start = 0;
        int end = arr.length - 1;
        while (Start <= end){
            int mid = Start + (end - Start)/2;
            if (target < arr[mid]) {
                end = mid -1;
            } else if (target > arr[mid]) {
                Start = mid + 1;
            }else {
                return mid;
            }
        }
        return -1;
    }
}
