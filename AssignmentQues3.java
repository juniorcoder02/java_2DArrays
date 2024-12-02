public class AssignmentQues3 {
    public static void main(String[] args) {
        // Question 3 : Write a program to Find Transpose of a
        // Matrix. What is Transpose?
        // Transpose of a matrix is the process of swapping the rows to columns. For a
        // 2x3 matrix,
        // Matrix
        // a11 a12 a13
        // a21 a22 a23
        // Transposed Matrix
        // a11 a21
        // a12 a22
        // a13 a23

        int[][] matrix = {
                { 2, 3, 4 }, { 5, 6, 7 }
        };

        // orignial matrix
        System.out.println("original matrix");
        printMatrix(matrix);

        // transpose matrix
        int row = 2, col = 3;
        int[][] transpose = new int[col][row];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        System.out.println("transpose matrix");
        printMatrix(transpose);
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] matrix1 : matrix) {
            for (int j = 0; j < matrix1.length; j++) {
                System.out.print(matrix1[j] + " ");
            }
            System.out.println("");
        }
    }
}
