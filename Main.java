import java.util.Scanner;

public class Main {

    public static void doMath(double a, double b, double c, double d) {
        double f = (a * (b + (c / d)));
        System.out.println(f);
    }

    public static void ifTrue(float a, float b) {
        if (a + b < 20 && a + b > 10) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    public static void isPositiveOrNegative(int a) {
        if (a < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Positive");
        }
    }

    public static void isNegative(int a) {
        if (a < 0) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    public static void printHello() {
        Scanner one = new Scanner(System.in);
        System.out.println("Input your name:");
        String name = one.nextLine();
        System.out.println("Hello, " + name);
    }

    public static void isLeap(int a) {
        if (a % 4 == 0 || a % 400 == 0 && a % 100 != 0) {
            System.out.println("The " + a + " is leap");
        } else {
            System.out.println("The " + a + " is not leap");
        }
    }

    public static void main(String[] args) {
        int Int = 1;
        char Char = 'C';
        float Float = 1.0f;
        double Double = 1.000000000000000001;
        boolean Boolean = true;
        byte Byte = 1;
        long Long = 123456776;


        doMath(10, 20, 30, 40);
        ifTrue(14, 11);
        isPositiveOrNegative(-10);
        isNegative(10);
        printHello();
        isLeap(2015);
        // write your code here
    }
}