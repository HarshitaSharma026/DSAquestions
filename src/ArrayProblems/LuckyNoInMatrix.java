package ArrayProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LuckyNoInMatrix {
    public static void main(String[] args) {
        int arr[][] = {{3,1,8},{9,11,13},{15,16,17}};
        System.out.println(luckyNumbers(arr));
    }

    static List<Integer> luckyNumbers (int[][] matrix) {
        int min_row[] = new int[matrix.length];
        int max_col[] = new int[matrix[0].length];
        Arrays.fill(min_row, Integer.MAX_VALUE);

        //finding minimum
        for(int r = 0; r < matrix.length; r++) {
            for(int c = 0; c < matrix[0].length; c++) {
                min_row[r] = Math.min(matrix[r][c], min_row[r]);
                max_col[c] = Math.max(matrix[r][c], max_col[c]);
            }
        }

        ArrayList <Integer> list = new ArrayList<>();
        //checking for common values in both min and max arrays
        for(int r = 0; r < min_row.length; r++) {
            for(int c = 0; c < max_col.length; c++) {
                if(min_row[r] == max_col[c]) {
                    list.add(min_row[r]);
                }
            }
        }

        return list;
    }
}
