public class AssignmentQues2 {
    public static int sumOfRow(int[][] nums) {
        int sum = 0;
        for (int j = 0; j < nums[0].length; j++) {
            sum += nums[1][j];
        }
        return sum;
    }

    public static void main(String[] args) {

        // Question 2 : Print out the sum of the numbers in the second row of the “nums”
        // array.
        // Example :
        // Input - int[][] nums = { {1,4,9},{11,4,3},{2,2,3} };
        // Output - 18

        int[][] nums = { { 1, 4, 9 }, { 11, 4, 3 }, { 2, 2, 3 } };
        System.out.print(sumOfRow(nums));

    }
}
