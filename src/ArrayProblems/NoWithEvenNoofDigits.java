package ArrayProblems;

public class NoWithEvenNoofDigits {
    public static void main(String[] args) {
        int arr[] = {555,901,482,1771};
        System.out.println(findNumbers(arr));
    }

    static int findNumbers(int[] nums) {
        int total = 0;
        for (int i = 0; i < nums.length; i++) {
            int evenCount = countEven(nums[i]);
            if (evenCount % 2 == 0) {
                total++;
            }
        }
        return total;
    }

    static int countEven(int num) {
        int count = 0;
        while (num != 0) {
            num = num / 10;
            count++;
        }
        return count;
    }
}
