import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        // калькулятор (функции)
        Scanner scanner = new Scanner(System.in);

        System.out.println("input first number: ");
        double a = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double b = scanner.nextDouble();

        System.out.print("Enter third number: ");
        double c = scanner.nextDouble();

        double D = calculateDiscr(a, b, c);

        if (a != 0) {
            System.out.println("D=" + calculateDiscr(a, b, c));
        }
        if (D > 0) {
            System.out.println("x1= " + Root1(a, b, D));
            System.out.println("x2= " + Root2(a, b, D));
        }
        if (D == 0) {
            System.out.println(Root1(a, b));
        }
        if (D < 0){
            System.out.println("No roots");
        }
    }

    static double calculateDiscr(double a, double b, double c) {
        return Math.pow(b, 2) - 4 * a * c;
    }

    static double Root1(double a, double b, double D) {
        return (-b + Math.sqrt(D)) / (2 * a);
    }

    static double Root2(double a, double b, double D) {
        return (-b - Math.sqrt(D)) / (2 * a);
    }

    static double Root1(double a, double b) {
        return -b / (2 * a);
    }

}

