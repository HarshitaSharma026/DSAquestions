package SearchingProblems;

import java.util.ArrayList;
import java.util.Arrays;

public class KthMissingPostiveNumber {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        System.out.println(findKthPositive(arr, 2));
    }

    static int findKthPositive(int[] arr, int k) {
        int newIndex = 0;
        int numbers = 1;
        int missingNos[] = new int[k];

        while (newIndex < k) {
            if (!binarySearch(arr, numbers)) {
                missingNos[newIndex] = numbers;
                newIndex++;
                numbers++;
            }
            else {
                numbers++;
            }
        }
        System.out.println(Arrays.toString(missingNos));
        return numbers - 1;
    }

    static boolean binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid  = start + (end - start)/2;
            if (arr[mid] == target) {
                return true;
            }
            else if (arr[mid] > target) {
                end = mid -1;
            }
            else {
                start = mid + 1;
            }
        }
        return false;
    }
}
