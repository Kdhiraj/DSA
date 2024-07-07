public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 18, 22, 35, 45};
        int target = 23;
        int ans = binarySearch(arr, target);
        System.out.println(ans);
    }

    //return the index
    //if element not exist then return -1
    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            //find the middle element
//            int mid = (start + end) / 2;
            int mid = start + (end - start) / 2; //might be possibilities integer exit the range

            if (target < arr[mid]) {
                end = mid - 1;  // if target is smaller than mid, we will check in left hand side of array, so we will change end pointer
            } else if (target > arr[mid]) {
                start = mid + 1;   // if target is greater than mid, we will check in right hand side of array, so we will change start pointer
            } else {
                //ans found
                return mid;
            }
        }
        //if target not found
        return -1;
    }

}
