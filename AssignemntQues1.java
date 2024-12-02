public class AssignemntQues1 {
    // Question 1 : Print the number of 7’s that are in the 2d array.
    // Example :
    // Input - int[][] array = { {4,7,8},{8,8,7} };
    // Output - 2

    public static int countOfNumbers(int[][] array, int number) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == number) {
                    count++;
                }
            }
        }
    
        return count;
    }

    public static void main(String[] args) {
        int[][] arr = {
                { 4, 7, 8 }, { 8, 8, 7 }
        };
        int number = 8;
        System.out.println(countOfNumbers(arr, number));
    }

}
