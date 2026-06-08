package JavaSyntaxZero.Level3.u3_l7;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        String result = number < 5 ? "число менше за 5" : number > 5 ? "число більше за 5" : "число дорівнює 5";
        System.out.println(result);
    }
}
