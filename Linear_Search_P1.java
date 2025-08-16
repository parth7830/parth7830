package Parth;
// Search In Strings
public class Linear_Search_P1 {
    public static void main(String[] args) {
        String name = "eeeee";
        char ch = 'h';
        System.out.println(search(name,ch));
        System.out.println(search2(name,ch));
    }
    static boolean search2(String str, char target) {
        if (str.isEmpty()) {
            return false;
        }

        for(char ch : str.toCharArray()) {
            if (ch == target) {
                return true;
            }
        }
        return false;
    }
    static boolean search(String str,char ch){
        if(str.isEmpty()){
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (ch == str.charAt(i)) {
                return true;
            }
        }
        return false;
    }
}
