package StringProblem;

import java.util.Arrays;

public class ShuffleArray {
    public static void main(String[] args) {
        String str = "codeleet";
        int[] arr = {4,5,6,7,0,2,1,3};
        System.out.println(shuffle(str, arr));

    }

    static String shuffle(String s, int[] indices) {
//        String newStr = "";
//        for(int i = 0; i < s.length(); i++) {
//            newStr += s.charAt(indices[i]);
//        }
//        return newStr;

        char[] c = new char[indices.length];
        for (int i = 0; i < c.length; i++) {
            c[indices[i]] = s.charAt(i);
        }

        String newStr = "";
        for (char value: c) {
            newStr += value;
        }
        System.out.println(newStr.charAt(0));
        return newStr;
    }
}
