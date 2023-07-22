package SearchingProblems;

public class CountNegativeNoInmatrix {
    public static void main(String[] args) {
        int arr[][] = {
                {4,3,2,-1},
                {3,2,1,-1},
                {1,1,-1,-2},
                {-1,-1,-2,-3}};
        System.out.println(countNegatives(arr));
    }

    static int countNegatives(int[][] grid) {
        int count = 0;
        int lb = 0;
        int ub = grid[0].length - 1;

        while(lb <= ub) {
            if(grid[lb][ub] < 0) {
                count++;
//                System.out.println("value compared " + grid[lb][ub] +"at postition: " + lb +","+ub);
                ub--;

            }
            else {
                lb++;
//                System.out.println(lb);
                if (lb == grid.length){
                    break;
                }
                ub = grid[lb].length - 1;
            }
        }
        return count;
    }
}
