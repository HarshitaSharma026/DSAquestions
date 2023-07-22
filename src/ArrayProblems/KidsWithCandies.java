package ArrayProblems;

import java.util.Arrays;

// kids with greatest no of candies: https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/
public class KidsWithCandies {
    public static void main(String[] args) {
        int candies[] = {4,2,1,1,2};
        int extra = 1;
        boolean[] res = greatestCandies(candies, extra);
        System.out.println(Arrays.toString(res));
    }

    static boolean[] greatestCandies(int[] candies, int extra) {
        boolean res[] = new boolean[candies.length];
        for (int i = 0; i < candies.length; i++) {
            int max = candies[i] + extra;
            for (int j = 0; j < candies.length; j++) {
                if (candies[j] > max) {
                    res[i] = false;
                    break;
                }
                else
                    res[i] = true;
            }
        }
        return res;
    }
}
