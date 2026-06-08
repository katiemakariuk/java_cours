package JavaSyntaxZero.Level3.u3_l3;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        String militaryCommissar = ", з'явіться до військкомату";

        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int age = scanner.nextInt();
        if (age >= 18 && age <= 26) {
            System.out.println(name + militaryCommissar);
        }
    }
}
