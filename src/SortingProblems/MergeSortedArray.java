package SortingProblems;

import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
//        int nums1[] = {1,2,3,0,0,0};
//        int nums2[] = {2,5,6};
        int nums1[] = {2,0};
        int nums2[] = {1};
        int m = 1; int n = 1;
        System.out.println(Arrays.toString(merge(nums1, m, nums2, n)));
    }

    static int[] merge(int nums1[], int m, int nums2[], int n) {
        int count = 0;
        for (int i = m; i < m+n; i++) {
            nums1[i] = nums2[count];
            count++;
        }
        return sorting(nums1);
    }

    static int[] sorting(int[] nums1) {
        //sorting elements using insertion sort
        if (nums1.length == 2 && nums1[0] > nums1[1]) {
            int temp = nums1[0];
            nums1[0] = nums1[1];
            nums1[1] = temp;
        }
        else {
            for(int j = 0; j < nums1.length - 2; j++) {
                for(int k = j+1; k>0; k--) {
                    if(nums1[k] < nums1[k-1]) {
                        int temp = nums1[k-1];
                        nums1[k-1] = nums1[k];
                        nums1[k] = temp;
                    }
                }
            }
        }

        return nums1;
    }
}
