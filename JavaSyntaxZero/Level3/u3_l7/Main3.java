package JavaSyntaxZero.Level3.u3_l7;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double firstDouble = scanner.nextDouble();
        double secondDouble = scanner.nextDouble();

        if (Math.abs(secondDouble - firstDouble) < 0.000001) {
            System.out.println("числа рівні");
        } else {
            System.out.println("числа не рівні");
        }
    }
}
