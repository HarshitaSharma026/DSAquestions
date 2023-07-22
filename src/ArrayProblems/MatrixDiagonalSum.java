package ArrayProblems;

// Find sum of both diagonals of a matrix. Don't include the numbers that have already been added to the sum.
public class MatrixDiagonalSum {
    public static void main(String[] args) {
//       int arr[][] = {{1,1,1,1}, {1,1,1,1}, {1,1,1,1}, {1,1,1,1}};
        int arr[][] = {{1,2,3,4}, {1,2,3,4}, {1,2,3,4}, {1,2,3,4}};
//        int arr[][] = {{5}};
        System.out.println("sum: " + diagonalSum(arr));
    }

    static int diagonalSum(int[][] mat) {
        if (mat.length == 1) {
            return mat[0][0];
        }
        int sum  = 0;

        //finding sum of primary diagonal
        for (int r = 0; r < mat.length; r++) {
            for (int c = 0; c < mat[r].length; c++) {
                if (r == c) {
                    sum+= mat[r][c];
                }
            }
        }
        System.out.println("sum from primary diagonal: " + sum);

        //finding sum of secondary diagonal
        for (int r = 0; r < mat.length; r++) {
            int col = mat.length - r - 1;
            if (!(r == col)) {
                sum+= mat[r][col];
                System.out.println("sum at SD: " + sum);
            }
        }

        return sum;
    }
}
