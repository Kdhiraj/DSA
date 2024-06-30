public class Recursion {
    static int count = 0;

    static void printNumbers() {
        if (count == 3) return;
        System.out.println(count);
        count = count + 1;

        printNumbers();
    }

    static void printNames(int i, int n){
        if(i>n) return;
        System.out.println("Dhiraj");
        printNames(i+1, n);
    }
    static void print1ToN(int i , int n){
        if(i>n) return;
        System.out.printf("%d ",i);
        print1ToN(i+1, n);
    }
    static void print1ToNBackTrack(int i , int n){
        if(i<1) return;
        print1ToNBackTrack(i-1, n);
        System.out.println(i);
    }

    static void printNTo1(int i , int n){
        if(i<1) return;
        System.out.println(i);
        printNTo1(i-1, n);
    }
    static void printNTo1BackTrack(int i , int n){
        if(i>n) return;
        printNTo1BackTrack(i+1, n);
        System.out.println(i);
    }

    public static void main(String[] args) {
        printNumbers(); //printing numbers n times
        printNames(1, 5); //print names n times
        print1ToN(1,10); // printing numbers from 1 to n
        print1ToNBackTrack(10,10); // printing numbers from 1 to n using back tracking method
        printNTo1(10, 10);//printing n to 1
        printNTo1BackTrack(1, 10);//printing n to 1 using back tracking method
    }
}
