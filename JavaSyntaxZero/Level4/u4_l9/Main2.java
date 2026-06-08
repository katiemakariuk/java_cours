package JavaSyntaxZero.Level4.u4_l9;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();

        double result = firstNumber * 1. / secondNumber;
        System.out.println(result);
    }
}
