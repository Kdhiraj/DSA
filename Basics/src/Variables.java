public class Variables {
    public static void main(String[] args) {
        //Variable is like container which is used to store temporary value in memory. In Java, there are various data types available to store different types of value.
        String name = "Dhiraj";

        // char: 2 bytes (16 bits), range: '\u0000' (0) to '\uffff' (65,535)
        // Use char to store a single character.
        char flag = 'Y';

        // byte: 1 byte (8 bits), range: -128 to 127
        // Use byte for saving memory in large arrays where the memory savings actually matters.
        byte age = 27;

        // boolean: size is JVM-dependent, typically 1 byte (8 bits)
        // Use boolean for simple flags that track true/false conditions.
        boolean isDeveloper = true;

        // float: 4 bytes (32 bits), single-precision 32-bit IEEE 754 floating point
        // Use float if you need to save memory in large arrays of floating point numbers.
        // Not recommended for precise values such as currency.
        float experience = 4.5F;

        // double: 8 bytes (64 bits), double-precision 64-bit IEEE 754 floating point
        // Use double for decimal values, this is the default choice for decimal values.
        double salary = 50_000.00;

        // long: 8 bytes (64 bits), range: -2^63 to 2^63-1
        // Use long when you need a range of values wider than those provided by int.
        long accountNo = 89_834_342_242L;

        // int: 4 bytes (32 bits), range: -2^31 to 2^31-1
        // Use int for integer values unless there is a reason to use another type.
        int totalEmployees = 36_500_000;

        // short: 2 bytes (16 bits), range: -32,768 to 32,767
        // Use short to save memory in large arrays, in situations where memory savings matter.
        short departmentCode = 12345;

        // short: 2 bytes (16 bits), range: -32,768 to 32,767
        // Use short to save memory in large arrays, in situations where memory savings matter.
        short weeklyHours = 40;

        // byte: 1 byte (8 bits), range: -128 to 127
        // Use byte for saving memory in large arrays where the memory savings actually matters.
        byte level = 5;

        // Displaying the variables
        System.out.println("Name: " + name);
        System.out.printf("Hello, My name is %s, I am %d years old and I have %.1f years of experience and my salary is %.2f%n", name, age, experience, salary);
        System.out.println("Department Code: " + departmentCode);
        System.out.println("Weekly Hours: " + weeklyHours);
        System.out.println("Level: " + level);
    }
}
