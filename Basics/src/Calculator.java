import java.util.Scanner;

class Calculator {

    // Method to perform addition
    int sum(int a, int b) {
        return a + b;
    }

    // Method to perform subtraction
    int subtract(int a, int b) {
        return a - b;
    }

    // Method to perform multiplication
    int multiply(int a, int b) {
        return a * b;
    }

    // Method to perform division
    double divide(int a, int b) {
        if (b == 0) {
            System.out.println("Error! Division by zero.");
            return 0;
        }
        return (double) a / b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        boolean continueCalculation = true;

        while (continueCalculation) {
            System.out.println("Simple Calculator");
            System.out.println("Enter two numbers:");

            System.out.print("First number: ");
            int num1 = scanner.nextInt();
            System.out.print("Second number: ");
            int num2 = scanner.nextInt();

            System.out.println("Choose an operation: ");
            System.out.println("1. Addition (+)");
            System.out.println("2. Subtraction (-)");
            System.out.println("3. Multiplication (*)");
            System.out.println("4. Division (/)");

            System.out.print("Enter your choice (1/2/3/4): ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Result: " + calculator.sum(num1, num2));
                    break;
                case 2:
                    System.out.println("Result: " + calculator.subtract(num1, num2));
                    break;
                case 3:
                    System.out.println("Result: " + calculator.multiply(num1, num2));
                    break;
                case 4:
                    System.out.println("Result: " + calculator.divide(num1, num2));
                    break;
                default:
                    System.out.println("Invalid choice! Please choose 1, 2, 3, or 4.");
            }

            System.out.print("Do you want to perform another calculation? (yes/no): ");
            String userResponse = scanner.next();

            if (userResponse.equalsIgnoreCase("no")) {
                continueCalculation = false;
                System.out.println("Thank you for using the calculator!");
            }
        }

        // Close the scanner to prevent memory leaks
        scanner.close();
    }
}
