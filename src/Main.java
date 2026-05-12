import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("input a");
        double a = in.nextDouble();
        System.out.println("input b");
        double b = in.nextDouble();
        System.out.println("input c");
        double c = in.nextDouble();
        double Q = (Math.pow(a, 2) - (3.0 * b)) / 9.0;
        System.out.println("Q = " + Q);
        double R = ((2.0 * Math.pow(a, 3)) - (9.0 * a * b) + (27.0 * c)) / 54;
        System.out.println("R = " + R);
        double S = (Math.pow(Q, 3)) - (Math.pow(R, 2));
        System.out.println("S = " + S);


        if (S > 0) {

            double powQ = Math.pow(Q, 3.0);
            double sqrtQ3 = Math.sqrt(powQ);
            double f = 1.0 / 3.0 * Math.acos((R / sqrtQ3));
//            double f = 1.0 / 3.0 * Math.acos((R / Math.sqrt(Math.pow(-Q, 3.0))));

            double x1 = 2.0 * Math.sqrt(Q) * Math.cos(f) - a / 3.0;
            double x2 = 2.0 * Math.sqrt(Q) * Math.cos(f + 2.0 / 3.0 * Math.PI) - a / 3.0;
            double x3 = 2.0 * Math.sqrt(Q) * Math.cos(f - 2.0 / 3.0 * Math.PI) - a / 3.0;
            System.out.println("x1= " + x1 + "\n" + "x2= " + x2 + "\n" + "x3= " + x3 + "\n");
        }
        if (S < 0) {
            if (Q > 0) {
                double f = (1.0 / 3.0) * Math.log(Math.abs(R) / Math.sqrt(Math.pow(Q, 3))
                        + Math.sqrt(Math.pow(Math.abs(R) / Math.sqrt(Math.pow(Q, 3)), 2) - 1));
                double x1 = -2 * Math.signum(R) * Math.sqrt(Q) * Math.cosh(f) - a / 3;
                System.out.println("x1= " + x1);
                double left1 = (Math.signum(R) * Math.sqrt(Q) * Math.cosh(f)) - (a / 3.0);
                double right1 = Math.sqrt(3) * Math.sqrt(Q) * Math.sinh(f);
                System.out.println("x2= " + left1 + "+i*" + right1);
                double left2 = Math.signum(R) * Math.sqrt(Q) * Math.cosh(f) - (a / 3.0);
                double right2 = Math.sqrt(3) * Math.sqrt(Q) * Math.sinh(f);
                System.out.println("x3= " + left2 + "-i*" + right2);


            }


        }
    }
}
