package SortingProblems;

public class ContainDuplicates {
    public static void main(String[] args) {
        int arr[] = {3,3};
        System.out.println();
    }

    static boolean containsDuplicate(int[] nums) {
        int i = 0;

        while(i < nums.length) {
            if(nums[i] != i + 1) {
                int correctInd = nums[i] - 1;
                if(nums[i] == nums[correctInd]) {
                    //duplicate
                    return true;
                }
                else {
                    swap(nums, i, correctInd);
                }
            }
            else {
                i++;
            }
        }
        return false;
    }

    static int[] swap(int[] arr, int first, int sec) {
        int temp = arr[first];
        arr[first] = arr[sec];
        arr[sec] = temp;

        return arr;
    }
}
