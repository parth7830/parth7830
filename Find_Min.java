package Parth;

public class Find_Min {
    public static void main(String[] args) {
        int[] num = {22,33,32,13,87};
        System.out.println(min(num));
    }
    static int min(int[] num){
        if (num.length == 0) {
            return -1;
        }
        int ans =num[0];
        for (int j : num) {
            if (j < ans) {
                ans = j;
            }
        }
        return ans;
    }
}
