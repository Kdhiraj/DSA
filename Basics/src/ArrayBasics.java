import java.util.Arrays;
import java.util.Scanner;

public class ArrayBasics {

    public static void main(String[] args) {

        //array declare and initialization
        int[] arr = new int[5];    //Declared an array of integer element of size 5

        String[] positions = {"1st", "2nd", "3rd", "4th", "last"}; //2nd way to store the values in array directly
        System.out.println("------------Enter the numbers---------------------");
        Scanner in = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter " + positions[i] + " value: ");
            arr[i] = in.nextInt();   //storing entered values in array using input stream
        }


        System.out.println("Entered values = " + Arrays.toString(arr)); // we can print the array using Array class
        System.out.println("Sum of array values = " + sumOfArray(arr)); //Passing array in functions
        System.out.println("Max value present in array = " + maxValues(arr)); //Passing array in functions
        System.out.println("Min value present in array = " + minValue(arr)); //Passing array in functions
        System.out.println("Reverse Values = " + Arrays.toString(reverseAnArray(arr)));


    }


    //receive array as arguments
    static int sumOfArray(int[] numbs) {
        int sum = 0;
        //Also we can use for each loop or enhanced for loop which store the value of array index
        for (int num : numbs) {
            sum = sum + num;
        }
        return sum;
    }

   //find max value
    static int maxValues(int[] numbs) {
        int max = numbs[0];
        for (int numb : numbs) {
            if (numb > max) {
                max = numb;
            }
        }
        return max;
    }

    //find min values in an array
    static int minValue(int[] numbs) {
        int min = numbs[0];
        for (int numb : numbs) {
            if (numb < min) {
                min = numb;
            }
        }
        return min;
    }

    static int[] reverseAnArray(int[] numbs) {
        int[] revArr = new int[numbs.length];
        for (int i = numbs.length - 1; i >= 0; i--) {
            revArr[numbs.length - i - 1] = numbs[i];
        }

        return revArr;
    }


}
