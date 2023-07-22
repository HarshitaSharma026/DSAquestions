package ArrayProblems;

public class FindPeakElement {
    public static void main(String[] args) {
        int nums[] = {2,1};
        System.out.println(findElement(nums));
    }

    static int findElement(int [] nums) {
        // only 1 element exist
        if (nums.length == 1) {
            return 0;
        }

        // check 1st and last element
        if (nums[0] > nums[1]) {
            return 0;
        }
        if (nums[nums.length - 1] > nums[nums.length - 2]) {
            return nums.length - 1;
        }

        int start = 1;
        int end = nums.length - 2;

        while (start <= end) {
            int mid = start + (end - start)/2;

            // we are in ascending part, hoping the peak element will be somewhere on RHS
            if (nums[mid] < nums[mid + 1]) {
                start = mid + 1;
            }

            // we are in descending part, assuming the peak element will be somewhere on LHS
            else if (nums[mid] > nums[mid + 1]) {
                if (nums[mid] > nums[mid - 1]) {
                    return mid;
                }
                else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}
