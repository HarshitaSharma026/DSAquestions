package ArrayProblems;

import java.util.Arrays;

// nums[] = {1,2,3}
// ans[] = {1,2,3,1,2,3}
public class ConcatenationOfArray {
    public static void main(String[] args) {
        int nums[] = {1,2,3};
//        int ans[] = getConcat(nums);
//        System.out.println(Arrays.toString(ans));

        int ans[] = arraycopyMethod(nums);
        System.out.println(Arrays.toString(ans));
    }

    // using normal for loop
    static int[] getConcat(int[] nums) {
        int ans[] = new int[nums.length*2];

        for (int i = 0; i < nums.length; i++) {
            ans[i] = ans[nums.length + i] = nums[i];
        }
        return ans;
    }

    // METHOD 2 : using System.arraycopy() method
    static int[] arraycopyMethod(int[] nums) {
        int ans[] = new int[nums.length*2];
        System.arraycopy(nums, 0, ans,0, nums.length);
        System.arraycopy(nums, 0, ans, nums.length, nums.length);
        return ans;
    }
}
