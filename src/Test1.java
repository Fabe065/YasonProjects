import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        // калькулятор (функции)
        Scanner scanner = new Scanner(System.in);

        System.out.println("input first number: ");
        double a = scanner.nextDouble();

        System.out.println("Enter second number: ");
        double b = scanner.nextDouble();

        System.out.println("Enter third number: ");
        double c = scanner.nextDouble();

        double D = calculateDiscr(a, b, c);

        if (a != 0) {
            System.out.println("D= " + calculateDiscr(a, b, c));
        }
        if (D > 0) {
            System.out.println("x1= " + rootOneWhenDiscrGreater(a, b, D));
            System.out.println("x2= " + rootTwoWhenDiscrGreater(a, b, D));
        }
        if (D == 0) {
            System.out.println(rootWhenDiscrEqual(a, b));
        }
        if (D < 0){
            System.out.println("No roots");
        }
    }

    static double calculateDiscr(double a, double b, double c) {
        return Math.pow(b, 2) - 4 * a * c;
    }

    static double rootOneWhenDiscrGreater(double a, double b, double D) {
        return (-b + Math.sqrt(D)) / (2 * a);
    }

    static double rootTwoWhenDiscrGreater(double a, double b, double D) {
        return (-b - Math.sqrt(D)) / (2 * a);
    }

    static double rootWhenDiscrEqual(double a, double b) {
        return -b / (2 * a);
    }

}

