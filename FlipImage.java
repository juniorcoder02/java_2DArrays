public class FlipImage {

    // Function to flip and invert the image
    public static int[][] flipAndInvertImage(int[][] matrix) {
        int n = matrix.length; // Number of rows in the matrix
        
        // Iterate through each row in the matrix
        for (int[] row : matrix) {
            int left = 0, right = row.length - 1;
            
            // Reverse and invert each row simultaneously
            while (left <= right) {
                // XOR with 1 flips the bit (1 -> 0, 0 -> 1)
                int temp = row[left] ^ 1; // Temporarily store the inverted value of the left element
                row[left] = row[right] ^ 1; // Invert and assign the value from the right
                row[right] = temp; // Assign the inverted left value to the right
                
                // Move pointers closer
                left++;
                right--;
            }
        }
        
        // Return the modified matrix
        return matrix;
    }

    public static void main(String[] args) {
        // Input binary matrix
        int[][] image = {
            {1, 1, 0}, 
            {1, 0, 1}, 
            {0, 0, 0}
        };

        // Call the function to flip and invert the image
        int[][] result = flipAndInvertImage(image);

        // Print the resulting matrix
        System.out.println("Flipped and Inverted Image:");
        for (int[] row : result) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println(); // Newline after each row
        }
    }
}
