package JavaSyntaxZero.Level3.u3_l9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string1 = scanner.nextLine();
        String string2 = scanner.nextLine();

        if (string1.equals(string2)) {
            System.out.println("рядки однакові");
        } else {
            System.out.println("рядки різні");
        }
    }
}
