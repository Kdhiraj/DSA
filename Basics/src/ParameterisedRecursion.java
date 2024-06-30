public class ParameterisedRecursion {

    //Sum of N natural numbers
    static int sumOfNaturalNumberUsingFormula(int N) {
        return N * (N + 1) / 2;
    }

    //Sum of N natural numbers using loop
    static int sumOfNaturalNumberUsingLoop(int N) {
        int sum = 0;
        for (int i = 0; i <= N; i++) {
            sum = sum + i;
        }
        return sum;
    }
    // sum of N natural number using parameterized recursion
    static void sumOfNaturalNumberUsingParameterizedRecursion(int i, int sum) {
        if (i < 0) {
            System.out.println("Sum of natural number with parametrized recursion = " + sum);
            return;
        }
        sumOfNaturalNumberUsingParameterizedRecursion(i - 1, sum + i);
    }

    static int sumOfNaturalNumberUsingFunctionRecursion(int n) {
        if (n == 0) return 0;
        return n + sumOfNaturalNumberUsingFunctionRecursion(n - 1);
    }

    public static void main(String[] args) {
        int N = 5;
        int sum1 = sumOfNaturalNumberUsingFormula(N);
        int sum2 = sumOfNaturalNumberUsingLoop(N);
        int sum3 = sumOfNaturalNumberUsingFunctionRecursion(N);
        System.out.println("Sum of " + N + " natural number with formula = " + sum1);
        System.out.println("Sum of " + N + " natural number using loop = " + sum2);
        System.out.println("Sum of " + N + " natural number using function recursion = " + sum3);
        sumOfNaturalNumberUsingParameterizedRecursion(5, 0);
    }
}
