package JavaSyntaxZero.Level3.u3_l3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String cold = "на вулиці холодно";
        String warm = "на вулиці тепло";
        Scanner scanner = new Scanner(System.in);
        int temperature = scanner.nextInt();
        if (temperature < 0) {
            System.out.println(cold);
        } else {
            System.out.println(warm);
        }
    }
}
