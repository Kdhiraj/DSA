/**
 * 1295. Find Numbers with Even Number of Digits
 * Given an array nums of integers, return how many of them contain an even number of digits.
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [12,345,2,6,7896]
 * Output: 2
 * Explanation:
 * 12 contains 2 digits (even number of digits).
 * 345 contains 3 digits (odd number of digits).
 * 2 contains 1 digit (odd number of digits).
 * 6 contains 1 digit (odd number of digits).
 * 7896 contains 4 digits (even number of digits).
 * Therefore, only 12 and 7896 contain an even number of digits.
 * Example 2:
 * <p>
 * Input: nums = [555,901,482,1771]
 * Output: 1
 * Explanation:
 * Only 1771 contains an even number of digits.
 */


public class EvenDigits {

    public static void main(String[] args) {

        int[] numbs1 = {12, 345, 2, 6, 7896};
        int[] numbs2 = {555, 901, 482, 1771};
        int ans = findNumbers(numbs1);
        int ans2 = findNumbers(numbs2);
        System.out.println(ans);
        System.out.println(ans2);
    }

    static int findNumbers(int[] numbs) {
        int count = 0;
        for (int num : numbs) {
            if (checkEven(num)) {
                count++;
            }
        }
        return count;
    }

    static boolean checkEven(int num) {
        int digit = countDigits2(num);
        return digit % 2 == 0;
    }

    //Brute force method
    static int countDigits(int nums) {
        if (nums == 0) return 1;
        if (nums < 0) return nums * -1;

        int count = 0;
        while (nums > 0) {
            nums = nums / 10;
            count++;
        }
        return count;
    }

    //Optimise Way
    static int countDigits2(int nums) {
        if (nums == 0) return 1;
        if (nums < 0) return nums * -1;
        return (int) Math.log10(nums) + 1;
    }


}
