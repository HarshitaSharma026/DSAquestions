package ArrayProblems;

public class GetMatrixByRotation {
    public static void main(String[] args) {
        int arr[][] = {{0,0,0},{0,1,0},{1,1,1}};
        int target[][] = {{1,1,1},
                          {0,1,0},
                          {0,0,0}};
        System.out.println(findRotation(arr, target));
    }

    static boolean findRotation(int[][] mat, int[][] target) {
        /*
            1. Find transpose
            2. Swap the elements of the first column with the last column (if the matrix is of 3*3). The second column remains the same.
            3. Check if matrices are same.
        */

        //1. Transpose
        for(int i = 0; i < mat.length; i++) {
            for(int j = 0; j < mat.length; j++) {
                if(i != j) {
                    mat[i][j] = mat[j][i];
                }
            }
        }

        //2. Swap elements
        for(int i = 0; i < mat.length; i++) {
            for(int j = 0; j < mat.length / 2; j++) {
                int temp = mat[i][j];
                mat[i][j] = mat[i][mat.length - j -1];
                mat[i][mat.length - j -1] = temp;
            }
        }

        //display swapped matrix
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                System.out.print(mat[i][j]);
            }
            System.out.println();
        }

        //3. Same or not
        for(int r = 0; r < mat.length; r++) {
            for(int c= 0; c<mat.length; c++) {
                if(mat[r][c] != target[r][c]) {
                    return false;
                }
            }
        }
        return true;
    }
}
