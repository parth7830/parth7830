package Parth;

import java.util.Arrays;

public class SearchIn2DArrat {
    public static void main(String[] args) {
        int[][] arr = {
                {23,4,1},
                {18,12,1},
                {9,4,2}
        };
        int target=2;
        System.out.println(Arrays.toString(search(arr, target)));
        System.out.println(max(arr));
    }
    static int[] search(int[][] arr,int target ){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j]==target){
                    return new int[]{i,j};
                }
            }

        }
        return new int[]{-1,-1};
    }
    static int max(int[][] arr ){
        int max = Integer.MIN_VALUE;
        for (int[] ints : arr){
            for (int anint : ints){
                if (anint > max) {
                    max = anint;
                }
            }
        }
        return max;
    }
}

