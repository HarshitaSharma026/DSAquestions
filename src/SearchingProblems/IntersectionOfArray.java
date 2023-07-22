package SearchingProblems;

import java.util.Arrays;

public class IntersectionOfArray {
    public static void main(String[] args) {
        int num1[] = {1,2,2,1};
        int num2[] = {2,2};
        System.out.println(Arrays.toString(intersection(num1, num2)));
    }

    static int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int arr[] = new int[Math.min(nums1.length, nums2.length)];
        for (int i = 0; i < nums1.length; i++) {
            int j = 0;
            while (j < nums2.length) {
                if (nums1[i] == nums2[j]) {
                    if (nums2[j] != nums2[j+1]) {
                        arr[i] = nums2[j];
                        break;
                    }
                    else {
                        j++;
                    }
                }
                else {
                    j++;
                }
            }
        }
        return arr;
    }
}
