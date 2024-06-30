 class Conditional {
    public static void main(String[] args) {
        String name = "Dhiraj";
        int age = 27;
        boolean isDeveloper = true;
        float experience = 4.5F;
        double salary = 50_000.00;
        long accountNo = 89_834_342_242L;
        int totalEmployees = 36_500_000;
        short departmentCode = 12345;
        byte level = 5;

        System.out.println("Name: " + name);

        // if statement
        if (age >= 18) {
            System.out.println("You are an adult.");
        }

        // if-else statement
        if (salary > 40_000.00) {
            System.out.println("You have a good salary.");
        } else {
            System.out.println("You need a better salary.");
        }

        // if-else-if ladder
        if (experience < 2) {
            System.out.println("You are a junior developer.");
        } else if (experience < 5) {
            System.out.println("You are a mid-level developer.");
        } else {
            System.out.println("You are a senior developer.");
        }

        // switch statement
        switch (level) {
            case 1:
                System.out.println("Beginner level");
                break;
            case 2:
                System.out.println("Intermediate level");
                break;
            case 3:
                System.out.println("Advanced level");
                break;
            case 4:
                System.out.println("Expert level");
                break;
            case 5:
                System.out.println("Master level");
                break;
            default:
                System.out.println("Unknown level");
                break;
        }
    }
}
