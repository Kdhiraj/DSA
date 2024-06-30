import java.util.Arrays;
import java.util.Scanner;

public class MultiDimensionalArray {
    public static void main(String[] args) {
        /*
         * 1 2 3
         * 4 5 6
         * 7 8 9
         *
         */

        // Initialize the array with both rows and columns specified
        int[][] arr = new int[3][3]; // 3 rows and 3 columns

        int[][] matrix = {
                //1st 2nd 3rd column
                {1, 2, 3}, //row1,  0th index
                {4, 5, 6}, //row 2 , 1 index
                {7, 8, 9} //row 3  , 2nd index matrix[2] ->{7,8,9}
        };

        // To access array element
        System.out.println("First row first column value:  " + matrix[0][0]);
        System.out.println("First row 2nd column value: " + matrix[0][1]);
        System.out.println("2nd row first column value:  " + matrix[1][0]);

        System.out.println("Enter the values in the matrix: ");
        Scanner in = new Scanner(System.in);

        // Take input in multi-dimensional array
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = in.nextInt();
            }
        }
        in.close(); // Close the scanner

        // output the matrix

        System.out.println("The matrix is: ");
        //old way
//        for (int row = 0; row < arr.length; row++) {
//            // For each column in every row
//            for (int col = 0; col < arr[row].length; col++) {
//                System.out.print(arr[row][col] + " ");
//            }
//            System.out.println();
//        }


//        for (int[] ints : arr) {
//            // For each column in every row
//            for (int anInt : ints) {
//                System.out.print(anInt + " ");
//            }
//            System.out.println();
//        }

        for (int[] inta : arr) {

            System.out.println(Arrays.toString(inta));
        }
    }
}
