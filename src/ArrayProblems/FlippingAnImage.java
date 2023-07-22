package ArrayProblems;

// Flip and invert an array and then return it
import java.util.Arrays;

public class FlippingAnImage {
    public static void main(String[] args) {
        int arr[][] = {{1,1,0}, {1,0,1}, {0,0,0}};
        int ans[][] = flipAndInvertImage(arr);
        for (int r = 0; r < ans.length ; r++) {
            System.out.println(Arrays.toString(ans[r]));
        }
    }

    static int[][] flipAndInvertImage(int[][] image) {
        int temp[][] = new int[image.length][];

        //for flipping array
        for (int r = 0; r < image.length; r++) {
            temp[r] = flipArray(image[r]);
        }

        //for inverting array elements
        for (int r = 0; r < temp.length; r++) {
            for (int c = 0; c < temp[r].length; c++) {
                if (temp[r][c] == 0) {
                    temp[r][c] = 1;
                }
                else {
                    temp[r][c] = 0;
                }
            }
        }
        return temp;
    }

    //method for flipping the image
    static int[] flipArray (int[] subarray) {
        int temp[] = new int[subarray.length];
        int count = 0;
        for (int i = subarray.length-1; i >= 0; i--) {
            temp[count] = subarray[i];
            count++;
        }
//        System.out.println("printing from flip array function: " + Arrays.toString(temp));
        return temp;
    }
    //method for inverting the image
}
