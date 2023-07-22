package ArrayProblems;

public class InfiniteArray {
    public static void main(String[] args) {
        int arr[] = {2,3,5,6,7,8,10,11,12,15,20,23,30,35};
        System.out.println(infiniteSearch(arr, 20));
    }

    static int infiniteSearch(int[] arr, int target) {
        int start = 0;
        int end = 1;

        while (target > arr[end]) {  // move forward
            int temp = end + 1;
            end = end + (end - start + 1) * 2;
            start= temp;
        }

        // if we found our chunk, start applying BS on it
        while (start <= end) {
            int mid = start + (end - start)/2;
            if (arr[mid] == target) {
                return mid;
            }

            else if (arr[mid] > target) {
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
