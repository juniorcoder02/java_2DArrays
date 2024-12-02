public class SearchInSortedMatrix {

    public static boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        
        // Start from top-right corner
        int i = 0;      // row index
        int j = cols - 1; // column index
        
        while (i < rows && j >= 0) {
            if (matrix[i][j] == target) {
                return true; // Target found
            } else if (matrix[i][j] > target) {
                j--; // Move left to smaller elements
            } else {
                i++; // Move down to larger elements
            }
        }
        return false; // Target not found
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 4, 7, 11},
            {2, 5, 8, 12},
            {3, 6, 9, 16},
            {10, 13, 14, 17}
        };
        int target = 5;
        System.out.println(searchMatrix(matrix, target));  // Output: true
    }
}
