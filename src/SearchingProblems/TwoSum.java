package SearchingProblems;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
//        int arr[] = {2,7,11,15};
        int arr[] = {-1,0};
        System.out.println(Arrays.toString(twoSum(arr, -1)));
    }

    static int[] twoSum(int[] numbers, int target) {
        int start = 0;
        int end = numbers.length - 1;
        int arr[] = new int[2];

        while(start <= end) {
            int mid = start + (end -  start)/2;
            if(numbers[start] + numbers[end] == target) {
                arr[0] = start+1;
                arr[1] = end+1;
//                System.out.println(Arrays.toString(arr));
                return arr;
            }
            else if(numbers[start] + numbers[end] > target) {
                end = mid;
            }
            else {
                start = mid +1;
            }
        }
        return arr;
    }
}
