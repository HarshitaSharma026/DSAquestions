package ArrayProblems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AddArrayFormOfInteger {
    public static void main(String[] args) {
        int arr[] = {2,1,5};
        System.out.println(addToArrayForm(arr, 806));
    }

    static List<Integer> addToArrayForm(int[] num, int k) {
        ArrayList <Integer> list = new ArrayList<>();
        for(int i = num.length - 1; i >= 0; i--) {
            k += num[i];
            list.add(k % 10);
            k /= 10;
        }
        System.out.println(list);

        for (int i = 0; i < list.size()/2; i++) {
            Integer temp = list.get(i);
            list.set(i, list.get(list.size() - i -1));
            list.set(list.size() - i -1, temp);
        }
        Collections.reverse(list);
        return list;
    }
}
