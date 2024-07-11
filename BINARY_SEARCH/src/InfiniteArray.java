//Find position of an element in a sorted array of infinite numbers
/*
Suppose you have a sorted array of infinite numbers, how would you search an element in the array?
Source: Amazon Interview Experience.
Since array is sorted, the first thing clicks into mind is binary search, but the problem here is that we don’t know size of array.
If the array is infinite, that means we don’t have proper bounds to apply binary search.
So in order to find position of key, first we find bounds (start, end index) and then apply binary search algorithm.
Let low be pointing to 1st element and high pointing to 2nd element of array, Now compare key with high index element,
->if it is greater than high index element then copy high index in low index and double the high index.
->if it is smaller, then apply binary search on high and low indices found.


Below are implementations of above algorithm

 */
public class InfiniteArray {
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170};
        int target = 140;
        System.out.println(searchInfiniteArray(arr, target));
    }

    static int searchInfiniteArray(int[] arr, int target) {
        int start = 0;
        int end = 1;

        // Double the range until target is within range or end of the array is reached
        while (end < arr.length && arr[end] < target) {
            start = end ;  // store previous high
            end = end * 2; // // double high index
            if (end >= arr.length) {
                end = arr.length - 1;
                break;
            }
        }

        // Perform binary search within the identified range
        return binarySearch(arr, target, start, end);
    }

    static int binarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}

