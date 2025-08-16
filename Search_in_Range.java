package Parth;

public class Search_in_Range {
    public static void main(String[] args) {
         int[] num = {11,22,11,33,32,13,87};
        System.out.println(search(num, 11, 1, 4));
    }
    static int search(int[] str,int target, int start, int end){
        if (str.length == 0) {
            return -1;
        }
        for (int i = start; i <= end; i++) {
            if (str[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
