package JavaSyntaxZero.Level4.u4_l10;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        double glass = 0.5;

        Scanner scanner = new Scanner(System.in);
        boolean isOptimist = scanner.nextBoolean();
        int result;
        if (isOptimist) {
            result = (int) Math.ceil(glass);
        } else {
            result = (int) Math.floor(glass);
        }
        System.out.println(result);
    }
}
