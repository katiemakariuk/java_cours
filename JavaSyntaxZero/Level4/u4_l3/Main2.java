package JavaSyntaxZero.Level4.u4_l3;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        String text = " любить мене.";

        Scanner scanner = new Scanner(System.in);
        String result = scanner.nextLine() + text;
        int i = 1;
        while (i <= 10) {
            System.out.println(result);
            i++;
        }
    }
}
