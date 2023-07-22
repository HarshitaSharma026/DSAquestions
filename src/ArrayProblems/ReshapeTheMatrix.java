package ArrayProblems;

import java.util.Arrays;

public class ReshapeTheMatrix {
    public static void main(String[] args) {
        int arr[][] = {{1,2},{3,4}};
        System.out.println(matrixReshape(arr, 1, 4));
    }

    static int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length; // no of rows
        int n = mat[0].length;  // no of columns
        if ((r * c) != (n * m)) {
            return mat;
        }
        else {
            int arr[] = new int[r * c];
            int count = 0;
            //copying in single array
            for(int i = 0; i < mat.length; i++) {
                for(int j = 0; j < mat[i].length; j++) {
                    arr[count] = mat[i][j];
                    count++;
                }
            }
            System.out.println("Single array: " + Arrays.toString(arr));
            int x = 0;
            int newArr[][] = new int[r][c];
            //copying elements to new array
            for(int i = 0; i < r; i++) {
                for(int j = 0; j < c; j++) {
                    newArr[i][j] = arr[x];
                    x++;
                }
            }
            return newArr;
        }
    }
}

