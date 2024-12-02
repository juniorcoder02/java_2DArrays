public class SpiralMatrix {

    // Function to print the matrix in spiral order
    public static void spiralorder(int[][] matrix) {
        // Initialize the boundaries
        int startrow = 0; // top boundary
        int endrow = matrix.length - 1; // bottom boundary
        int startcol = 0; // left boundary
        int endcol = matrix[0].length - 1; // right boundary

        // Continue the spiral traversal while there are valid rows and columns
        while (startrow <= endrow && startcol <= endcol) {
            // Traverse the top boundary (left to right)
            for (int j = startcol; j <= endcol; j++) {
                System.out.print(matrix[startrow][j] + " ");
            }
            // Move the top boundary down
            startrow++;

            // Traverse the right boundary (top to bottom)
            for (int i = startrow; i <= endrow; i++) {
                System.out.print(matrix[i][endcol] + " ");
            }
            // Move the right boundary left
            endcol--;

            // Traverse the bottom boundary (right to left) if there are rows left
            for (int j = endcol; j >= startcol; j--) {
                // Check if we've already printed this row
                if (startrow > endrow) {
                    break;
                }
                System.out.print(matrix[endrow][j] + " ");
            }
            // Move the bottom boundary up
            endrow--;

            // Traverse the left boundary (bottom to top) if there are columns left
            for (int i = endrow; i >= startrow; i--) {
                // Check if we've already printed this column
                if (startcol > endcol) {
                    break;
                }
                System.out.print(matrix[i][startcol] + " ");
            }
            // Move the left boundary right
            startcol++;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Sample matrix
        int[][] matrix = {
            { 1, 2, 3, 4 },
            { 5, 6, 7, 8 },
            { 9, 10, 11, 12 },
            { 13, 14, 15, 16 }
        };
        spiralorder(matrix); // Call the function to print the matrix in spiral order
    }
}
