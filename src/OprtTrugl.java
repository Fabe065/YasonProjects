import java.util.Scanner;

public class OprtTrugl {
    public static void main(String[] args) {
        // калькулятор (функции)
        Scanner scanner = new Scanner(System.in);

        System.out.println("input first number: ");
        double a = scanner.nextDouble();

        System.out.println("Enter second number: ");
        double b = scanner.nextDouble();

        System.out.println("Enter third number: ");
        double c = scanner.nextDouble();

        if (a == 0 || b == 0 || c == 0) {
            System.out.println("Error: One side is equal to zero and");
        }
        if (Math.max(a, (Math.max(b, c))) == a && a <= b + c) {
            System.out.println("Error: One side is greater than the sum of the other two");
            return;
        } else if (Math.max(b, (Math.max(a, c))) == b && b <= a + c) {
            System.out.println("Error: One side is greater than the sum of the other two");
            return;
        } else if (Math.max(c, (Math.max(b, a))) == c && c <= a + b) {
            System.out.println("Error: One side is greater than the sum of the other two");
            return;
        } else {
            System.out.println("The triangle is scalene");

        }
        if (a == b && b == c) {
            System.out.println("Equilateral triangle");
        } else if (a == b || b == c || a == c) {
            System.out.println("Isosceles triangle");
        }
    }


}
