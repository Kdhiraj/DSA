//34. Find First and Last Position of Element in Sorted Array
/*
Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.

If target is not found in the array, return [-1, -1].

You must write an algorithm with O(log n) runtime complexity.



Example 1:

Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]
Example 2:

Input: nums = [5,7,7,8,8,10], target = 6
Output: [-1,-1]
Example 3:

Input: nums = [], target = 0
Output: [-1,-1]

 */

import java.util.Arrays;

public class FirstAndLastPosition {
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int[] ans = new int[2];
        int target = 0;
        ans[0] = searchRange(nums, target, true);
        ans[1] = searchRange(nums, target, false);
        System.out.println(Arrays.toString(ans));
    }

    static int searchRange(int[] numbs, int target, boolean findStartIndex) {
        int ans = -1;
        int start = 0;
        int end = numbs.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > numbs[mid]) {
                start = mid + 1;
            } else if (target < numbs[mid]) {
                end = mid - 1;
            } else {
                ans = mid;
                if (findStartIndex) {
                    end = mid - 1;  //keep searching in left half
                } else {
                    start = mid + 1; // keep searching in right half
                }
            }
        }
        return ans;
    }


}
