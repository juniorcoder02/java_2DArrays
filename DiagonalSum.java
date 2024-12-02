public class DiagonalSum {

    public static int diagonalSum(int[][] matrix) {
        int sum = 0;
        int n = matrix.length; // Get the size of the matrix (n x n)

        // Loop through each row (or column) as it's a square matrix
        for (int i = 0; i < n; i++) {
            // Add primary diagonal element (matrix[i][i])
            sum += matrix[i][i];
            
            // Add secondary diagonal element (matrix[i][n - i - 1]), 
            // but avoid double-counting the center element in odd-sized matrices
            if (i != n - i - 1) {
                sum += matrix[i][n - i - 1];
            }
        }
        
        return sum; // Return the final sum of both diagonals
    }

    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 2, 3, 4 }, 
                { 5, 6, 7, 8 }, 
                { 9, 10, 11, 12 }, 
                { 13, 14, 15, 16 }
        };
        // Output the diagonal sum
        System.out.println("Diagonal Sum: " + diagonalSum(matrix));  // Output: 68
    }
}
