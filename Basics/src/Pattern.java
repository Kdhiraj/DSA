import java.util.Scanner;

public class Pattern {
    /*
     *
     * *
     * * *
     * * * *
     * * * * *
     */
    void pattern1(int rows) {

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /*
     * * * * *
     * * * * *
     * * * * *
     * * * * *
     * * * * *
     */
    void pattern2(int rows) {

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /*
     * * * * *
     * * * *
     * * *
     * *
     *
     */
    void pattern3(int rows) {

        for (int i = 0; i < rows; i++) {
            int col = rows - i;
            for (int j = 0; j < col; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    /*
     *
     * *
     * * *
     * * * *
     * * * * *
     * * * * * *
     * * * * *
     * * * *
     * * *
     * *
     *
     */

    void pattern4(int rows) {
        this.pattern1(rows + 1);
        this.pattern3(rows);
    }

    public static void main(String[] args) {

        System.out.println("---Pattern Styles-----");
        String pattern1 = "\n1.\n*\n* *\n* * *\n* * * *\n* * * * *";
        String pattern2 = "\n2.\n* * * * *\n* * * * *\n* * * * *\n* * * * *\n* * * * *";
        String pattern3 = "\n3.\n* * * * *\n* * * * \n* * * \n* * \n* ";
        String pattern4 = "\n4.\n* \n* * \n* * * \n* * * * \n* * * * * \n* * * * * * \n* * * * *\n* * * *\n* * *\n* *\n*";

        System.out.println(pattern1 + pattern2 + pattern3 + pattern4);


        System.out.print("Choose the style of pattern you want to print (1/2/3/4): ");
        Scanner scanner = new Scanner(System.in);
        int style = scanner.nextInt();
        System.out.print("Number of lines you want to print: ");

        int rows = scanner.nextInt();
        Pattern pattern = new Pattern();

        switch (style) {
            case 1:
                pattern.pattern1(rows);
                break;
            case 2:
                pattern.pattern2(rows);
                break;
            case 3:
                pattern.pattern3(rows);
                break;
            case 4:
                pattern.pattern4(rows);
                break;
            default:
                System.out.println("Invalid choice, Choose 1,2,3 or 4");
        }
    }

}
