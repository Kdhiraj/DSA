import java.util.Scanner;

public class BasicMath {
    /**
     * @return totalDigit
     * @description Count number of digits
     */
    private int countDigits(long number) {
        int totalDigits = 0;
        while (number > 0) {
            number = number / 10;
            totalDigits = totalDigits + 1;
        }
        return totalDigits;
    }

    /**
     * @return reverseDigits
     * @description reverse digits
     */
    private long reverseNumber(long number) {
        long reverseDigit = 0;
        while (number > 0) {
            int lastDigit = (int) number % 10;
            reverseDigit = reverseDigit * 10 + lastDigit;
            number = number / 10;

        }
        return reverseDigit;
    }

    public static void main(String[] args) {
        BasicMath basicMath = new BasicMath();
        System.out.print("Enter the number which you want to count digits: ");
        Scanner scanner = new Scanner(System.in);
        long inpNumber = scanner.nextLong();
        int totalDigits = basicMath.countDigits(inpNumber);
        long reverseDigit = basicMath.reverseNumber(inpNumber);
        System.out.println("Total number of digits: " + totalDigits);
        System.out.println("Reverse digits: " + reverseDigit);
    }

}
