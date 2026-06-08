package JavaSyntaxZero.Level4.u4_l4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        while (true) {
            String s = console.nextLine();
            if (s.equals("enough")) {
                break;
            }
            System.out.println(s);
        }
    }
}
