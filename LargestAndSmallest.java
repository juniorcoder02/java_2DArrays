


public class LargestAndSmallest {
    public static boolean linearSearch(int arr[][], int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] == target) {
                    System.err.println("target found at index : (" + i + "," + j + ")");
                    return true;

                }
            }
        }
        System.out.println("target not found");
        return false;
    }

    public static int largestElement(int arr[][]){
        int largest = Integer.MIN_VALUE;
        for(int i = 0;i<arr.length;i++){
            for(int j  = 0;j<arr[i].length;j++){
                if(arr[i][j]>largest){
                    largest=arr[i][j];
                }
            }
        }
        return largest;
    }

    public static int smallestElement(int arr[][]){
        int smallest = Integer.MAX_VALUE;
        for(int i = 0;i<arr.length;i++){
            for(int j = 0;j<arr[i].length;j++){
                if(arr[i][j]<smallest){
                    smallest=arr[i][j];
                }
            }
        }
        return smallest;
    }

    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3,0 }, { 4, 5, 6 }, { 7, 8, 9,654 } };
        int target = 8;
        linearSearch(arr, target);
        System.err.println("largest element is :"+ largestElement(arr));
        System.err.println("smallest element is :"+ smallestElement(arr));
    }
}
