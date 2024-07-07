import java.util.Arrays;

public class LinearSearch {
    public static void main(String[] args) {
        int[] numbs = {1, 5, 7, 9, 200, 45, 66};
        int target = 200;
        int index = linearSearchReturnIndex(numbs, target);
        int value = linearSearchReturnValue(numbs, target);
        boolean isElementExist = checkElementExistInArray(numbs, target);
        System.out.println(isElementExist ? "Element found" : "Element not exist in an array");
        if (index != -1) {
            System.out.println("Target Element found at " + index + " index and value is " + value);
        } else {
            System.out.println("Target Not found");
        }

        //--------------- MIN number in an array
        int[][] arr = {
                {23, 41, 100},
                {53, 1, 10},
                {43, 2, 5}
        };

        System.out.println(minNumber(numbs));
        System.out.println(Arrays.toString(searchNumber(arr, 10)));
    }

    /*
     * Write a method to find target element in an array if element found return its index else return -1
     */
    public static int linearSearchReturnIndex(int[] arr, int targetElement) {
        if (arr.length == 0) return -1;

        for (int index = 0; index < arr.length; index++) {
            if (targetElement == arr[index]) {
                return index;
            }
        }
        //This line will be executed when none of above return statement executed, hence element not found
        return -1;
    }

    /*
     * Write a method to find target element in an array if element found return its element else return -1
     */

    public static int linearSearchReturnValue(int[] arr, int targetElement) {

        for (int num : arr) {
            if (targetElement == num) {
                return num;
            }
        }
        //This line will be executed when none of above return statement executed, hence element not found
        return -1;
    }
    /*
     * Write a method to find target element in an array if element found return true else return false
     */

    public static boolean checkElementExistInArray(int[] arr, int targetElement) {

        for (int num : arr) {
            if (targetElement == num) {
                return true;
            }
        }
        //This line will be executed when none of above return statement executed, hence element not found
        return false;
    }

    static int minNumber(int[] arr) {
        int min = arr[0];
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    static int[] searchNumber(int[][] arr, int target) {

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (target == arr[row][col]) {
                    return new int[]{row, col};
                }
            }
        }
        return new int[]{-1, -1};
    }

    static int maxNumber(int[][] arr) {
        int max = arr[0][0];
        for (int[] its : arr) {
            for (int anInt : its) {
                if (max < anInt) {
                    max = anInt;
                }
            }
        }
        return max;
    }

}
