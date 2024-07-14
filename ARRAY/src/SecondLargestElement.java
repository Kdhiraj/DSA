//2. Return second-largest element in the array
/*
Given an array arr, return the second-largest distinct element from an array. If the second largest element doesn't exist then return -1.

Examples:

Input: arr = [12, 35, 1, 10, 34, 1]
Output: 34
Explanation: The largest element of the array is 35 and the second-largest element is 34.
Input: arr = [10, 10]
Output: -1
Explanation: The largest element of the array is 10 and the second-largest element does not exist so answer is -1.
 */

public class SecondLargestElement {
    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1};
        int ans = secondLargestElement(arr);

        System.out.println(ans);
        System.out.println(betterApproach(arr));

    }

    /*
    Solution 1: (Brute Force) [this approach only works if there are no duplicates]

     ->  Sort the array first in ascending order, so we get the largest element in the array
         now we need to find second-largest element so traverse the array from n-2 to 1 and find second-largest element
       ->  The element present at the second index is the second-smallest element
       ->  The element present at the second index from the end is the second-largest element

       Time Complexity: O(NlogN), For sorting the array

        Space Complexity: O(1)
     */

    /**
     * Solution 2(Better Solution)
     * <p>
     * Intuition:
     * Even though we want to have just the second smallest and largest elements, we are still sorting the entire array for that and thus increasing the time complexity. Can we somehow try to not sort the array and still get our answer?
     * <p>
     * Approach:
     * Find the smallest and largest element in the array in a single traversal
     * After this, we once again traverse the array and find an element that is just greater than the smallest element we just found.
     * Similarly, we would find the largest element which is just smaller than the largest element we just found
     * Indeed, this is our second smallest and second-largest element.
     * T.C : O(2N)
     */
    static int betterApproach(int[] arr) {
        int small = Integer.MAX_VALUE;
        int second_small = Integer.MAX_VALUE;
        int large = Integer.MIN_VALUE;
        int second_large = Integer.MIN_VALUE;
        int i;

        for (i = 0; i < arr.length; i++) {
            small = Math.min(small, arr[i]);
            large = Math.max(large, arr[i]);
        }
        for (i = 0; i < arr.length; i++) {
            if (arr[i] < second_small && arr[i] != small) {
                second_small = arr[i];
            }
            if (arr[i] > second_large && arr[i] != large) {
                second_large = arr[i];
            }
        }
        return second_large;
    }

    /*
    Second Largest Algo: Optimal approach

  If the current element is larger than ‘large’ then update second_large and large variables
  Else if the current element is larger than ‘second_large’ then we update the variable second_large.
  Once we traverse the entire array, we would find the second-largest element in the variable second_large.
  Here’s a quick demonstration of the same.
  T.C: O(n)
     */
    static int secondLargestElement(int[] arr) {
        int secondLarge = -1;
        int large = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > large) {
                secondLarge = large;
                large = arr[i];
            } else if (arr[i] > secondLarge && arr[i] != large) {
                secondLarge = arr[i];
            }
        }
        return secondLarge;
    }
}
