package ArrayProblems;

public class TransposeOfMatrix {
    public static void main(String[] args) {
        int arr[][] = {{1,2,3},{4,5,6},{6,7,8}};
        int tmatrix[][] = transpose(arr);
        for (int i = 0; i < tmatrix.length; i++) {
            for (int j = 0; j < tmatrix[i].length; j++) {
                System.out.print (tmatrix[i][j] +" ");
            }
            System.out.println();
        }

    }

    static int[][] transpose(int[][] matrix) {

        int[][] arr = new int[matrix[0].length][matrix.length];
//        System.out.println(arr.length);
        for(int i = 0; i< matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                if(i != j) {
                    arr[j][i] = matrix[i][j];
                }
                else {
                    arr[i][j] = matrix[i][j];
                }
            }
        }
        return arr;
    }
}
