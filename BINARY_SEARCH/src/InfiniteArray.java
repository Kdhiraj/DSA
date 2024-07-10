//Find position of an element in a sorted array of infinite numbers

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
            start = end ;
            end = end * 2;
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

