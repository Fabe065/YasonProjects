import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        // калькулятор (функции)
        Scanner scanner = new Scanner(System.in);

        System.out.println("input first number");
        double num1 = scanner.nextDouble();

        System.out.println("Enter action");
        System.out.println("1 - sum (+)");
        System.out.println("2 - dif (-)");
        System.out.println("3 - multi (*)");
        System.out.println("4 - div (/)");
        System.out.print("Enter transaction number: ");
        int operation = scanner.nextInt();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();


        if (operation == 1) {
            System.out.println(sum(num1, num2));
        }
        if (operation == 2) {
            System.out.println(dif(num1, num2));
        }
        if (operation == 3) {
            System.out.println(multi(num1, num2));
        }
        if (operation == 4) {
            System.out.println(div(num1, num2));
            if (num2 == 0) {
                System.out.println("Error: division by zero");

            }
        }
    }

    static double sum(double a, double b) {
        return a + b;
    }

    static double dif(double a, double b) {
        return a - b;
    }

    static double multi(double a, double b) {
        return a * b;
    }

    static double div(double a, double b) {
        return a / b;


    }
}


