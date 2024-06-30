import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListExample {
    public static void main(String[] args) {
        /*
        List is used to create dynamic array when we don't know the size
         */


        //syntax in types we pass wrapper class not primitives

        ArrayList<Integer> list = new ArrayList<>(5);

        //add into list

        list.add(22);
        list.add(24);
        list.add(25);
        list.add(26);
        list.add(224);
        list.add(223);
        list.add(226);
        list.add(222);
        list.add(225);
        list.add(227);

        //To modify the element at specific index pass the index in first parameter and value in 2nd parameter
        list.add(1, 323);
        list.set(2, 324);

        //To get an item
        System.out.println(list.get(3));

        //To remove the value
        list.remove(2);
        System.out.println(list.contains(533)); //it returns true or false, if value if present in list
        System.out.println(list);
        System.out.println("List items are: ");
//        for (Integer integer : list) {
//            System.out.print(integer + " ");
//        }

        //reverse the array
        System.out.println("Reverse arrays: " + Arrays.toString(reverseArray(list)));
        int[] num = {1, 3, 2, 4};
        System.out.println("Original array: " + Arrays.toString(num));
        System.out.println("After swap array: " + Arrays.toString(swap(num, 1, 2)));

        System.out.println("Swap arrays: " + Arrays.toString(reverseArray(list)));
        System.out.println("Reverse the array using pointer: " + Arrays.toString(reverseArrayUsingPointer(num)));
        System.out.println("Max value: " + max(num));
        System.out.println("Max value in range: " + maxRange(num, 1, 2));
        System.out.println("Swap arrays: " + Arrays.toString(reverseArray(list)));

    }

    static int[] reverseArray(ArrayList<Integer> arr) {
        int[] swappedArr = new int[arr.size()];
        int size = arr.size();
        int lastIndex = arr.size() - 1;
        while (lastIndex >= 0) {
            swappedArr[size - lastIndex - 1] = arr.get(lastIndex);
            lastIndex--;
        }
        return swappedArr;
    }

    static int[] reverseArrayUsingPointer(int[] arr){
        int start = 0; //first index
        int end = arr.length - 1; //last index

        while (start< end){
            swap(arr, start, end);
            start++;
            end--;
        }
        return arr;

    }


    static int[] swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;

        return arr;
    }

    static int max(int[] arr) {
        int maxValue = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxValue) {
                maxValue = arr[i];
            }
        }
        return maxValue;
    }

    static int maxRange(int[] arr, int start, int end) {
        int maxValue = arr[start];
        for (int i = start; i <= end; i++) {
            if (arr[i] > maxValue) {
                maxValue = arr[i];
            }
        }
        return maxValue;
    }


}
