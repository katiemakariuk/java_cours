package JavaSyntaxZero.Level3.u3_l7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberA = scanner.nextInt();
        int numberB = scanner.nextInt();
        if (numberA > numberB) {
            System.out.println(numberA);
        } else {
            System.out.println(numberB);
        }
    }
}
