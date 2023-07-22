package ArrayProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class PlusOne {
    public static void main(String[] args) {
        int[] arr = {9};
        System.out.println("returned array: " + Arrays.toString(arr));
    }

    static int[] plusOne(int[] digits) {
        ArrayList<Integer> list = new ArrayList<>();


        //for one value in array and it's 9
        if (digits.length == 1 && digits[0] == 9) {
            System.out.println("inside");
            int newArr[] = new int[2];
            newArr[0] = 1;
            newArr[1] = 0;
            return newArr;
        }
        else if (digits.length == 1) {
            digits[0] = digits[0] + 1;
            return digits;
        }
        else {
            String str = "";

            // converting it to str
            for (int i = 0; i < digits.length; i++) {
                str += digits[i];
            }

            int num = 1 + Integer.parseInt(str);
            int index = 0;
            while (num > 0) {
                list.add(index, num % 10);
                num /= 10;
                index++;
            }

            Collections.reverse(list);
            System.out.println(list);

            //converting to array
            int newArr[] = new int[list.size()];
            for (int i = 0; i < newArr.length; i++) {
                newArr[i] = list.get(i);
            }
            return newArr;
        }
    }
}
