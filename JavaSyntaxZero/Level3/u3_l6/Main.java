package JavaSyntaxZero.Level3.u3_l6;

import java.util.Scanner;

public class Main {
    private static final String TRIANGLE_EXISTS = "трикутник існує";
    private static final String TRIANGLE_NOT_EXISTS = "трикутник не існує";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sideA = scanner.nextInt();
        int sideB = scanner.nextInt();
        int sideC = scanner.nextInt();

        if ((sideA < sideB + sideC) && (sideB < sideC + sideA) && (sideC < sideA + sideB)) {
            System.out.println(TRIANGLE_EXISTS);
        } else {
            System.out.println(TRIANGLE_NOT_EXISTS);
        }
    }
}
