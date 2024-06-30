import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner scanner = new Scanner(System.in);

        // Taking String input
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Taking integer input
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Taking float input
        System.out.print("Enter your experience (in years): ");
        float experience = scanner.nextFloat();

        // Taking double input
        System.out.print("Enter your salary: ");
        double salary = scanner.nextDouble();

        // Taking boolean input
        System.out.print("Are you a developer (true/false): ");
        boolean isDeveloper = scanner.nextBoolean();

        // Taking long input
        System.out.print("Enter your account number: ");
        long accountNo = scanner.nextLong();

        // Taking short input
        System.out.print("Enter your department code: ");
        short departmentCode = scanner.nextShort();

        // Taking byte input
        System.out.print("Enter your level: ");
        byte level = scanner.nextByte();

        // Displaying the inputs
        System.out.println("\n--- User Information ---");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Experience: " + experience + " years");
        System.out.println("Salary: " + salary);
        System.out.println("Developer: " + isDeveloper);
        System.out.println("Account Number: " + accountNo);
        System.out.println("Department Code: " + departmentCode);
        System.out.println("Level: " + level);

        // Close the scanner to prevent resource leaks
        scanner.close();
    }
}
