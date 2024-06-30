public class ReverseArray {

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d ", arr[i]);
        }
    }

    //using two pointer
    public static void reverseArray(int[] arr) {
        int p1 = 0;
        int p2 = arr.length - 1;
        while (p1 < p2) {
            int temp = arr[p2];
            arr[p2] = arr[p1];
            arr[p1] = temp;
            p1++;
            p2--;
        }
        printArray(arr);

    }

    //using loop
    public  static void reverseArrayUsingLoop(int[] arr, int length){
        int[] ans = new int[length];
        for(int i = length - 1 ; i>=0; i--){
            ans[length - i - 1] = arr[i];
        }
        printArray(ans);
    }


    //using recursion
    public static void reverseArrayUsingRecursion(int[] arr, int start , int end) {
       if(start < end){
           int temp = arr[end];
           arr[end] = arr[start];
           arr[start] = temp;
           reverseArrayUsingRecursion(arr, start + 1, end - 1);
       }


    }

    public static void main(String[] args) {
        int[] number = {1, 2, 3, 4, 5};
//        reverseArray(number);
//        reverseArrayUsingLoop(number, 5);
        reverseArrayUsingRecursion(number, 0, number.length - 1);
        printArray(number);
    }
}
