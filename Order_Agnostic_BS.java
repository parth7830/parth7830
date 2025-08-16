package Parth;

public class Order_Agnostic_BS {
    public static void main(String[] args) {
        int[] arr={32,31,24,22,21,13,2,1,0};
        System.out.println(orderAgnosticBS(arr, 22));
    }
    static int orderAgnosticBS(int[] arr, int target){
        int Start = 0;
        int end = arr.length - 1;
        boolean isasc = arr[Start] < arr[end];

        while (Start <= end){
            int mid = Start + (end - Start)/2;
            if(arr[mid] == target ){
                return mid;
            }
            if (isasc) {
                if (target < arr[mid]) {
                    end = mid -1;
                } else{
                    Start = mid + 1;
                }
            }else {
                if (target > arr[mid]) {
                    end = mid -1;
                } else{
                    Start = mid + 1;
                }
            }
        }
        return -1;
    }
}
