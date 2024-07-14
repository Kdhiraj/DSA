
//1. Return largest element in the array
/*
Given an array arr, the task is to find the largest element in it.
Examples:

Input: arr= [1, 8, 7, 56, 90]
Output: 90
Explanation: The largest element of given array is 90.
 */

public class LargestElement {
    public static void main(String[] args) {
        int[] arr = {3, 5, 2, 88, 99, 4};
        System.out.println(largestElement(arr));
    }
    //1st Brute force solution: Sort the array and return last index value i.e: arr[n-1], But the time complexity of sorting method is O(nlogn)


    //2nd Optimal Solution: traverse the array element one by one and compare it with first array element : T.C:  O(n)
    static int largestElement(int[] arr) {
        int largest = arr[0]; // assume first index value is largest
        for (int j : arr) {
            if (j > largest) {
                largest = j;
            }
        }
        return largest;
    }
}
