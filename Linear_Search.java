package Parth;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Linear_Search {
    public static void main(String[] args) {
        int[] num = {22,54,11,55,33,22,66,33};
        int ans =linearSearch(num,1);
        System.out.println(ans);
    }
    static int linearSearch(int[] arr,int target){
        if(arr.length==0){
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if ( arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}