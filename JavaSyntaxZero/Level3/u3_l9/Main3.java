package JavaSyntaxZero.Level3.u3_l9;

import java.util.Scanner;

public class Main3 {
    public static String secret = "AmIGo";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        if (secret.equalsIgnoreCase(string)) {
            System.out.println("доступ дозволено");
        } else {
            System.out.println("доступ заборонено");
        }
    }
}
