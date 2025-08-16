package Parth;

public class Ceiling_Problem {
    public static void main(String[] args) {
        int[] arr = {2,4,5,8,9,12,15,16};
        System.out.println(ceiling(arr,14));
    }
    static int ceiling(int[] arr, int target){
        if (target > arr[arr.length-1]) {
            return -1;
        }
        int start = 0;
        int end = arr.length;
        while (start <= end){
            int mid = start + (end - start)/2;
            if (arr[mid] < target) {
                start=mid +1;
            } else if (arr[mid] > target) {
                end = mid -1;
            }else {
                return mid;
            }
        }
        return start;
    }
}
