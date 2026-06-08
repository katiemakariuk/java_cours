package JavaSyntaxZero.Level3.u3_l5;

import java.util.Scanner;

public class Main {
    private static boolean isHigh;
    private static boolean isLow;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double bodyTemperature = scanner.nextDouble();
        if (bodyTemperature > 37) {
            System.out.println("температура тіла висока");
        } else if (bodyTemperature < 36){
            System.out.println("температура тіла низька");
        } else {
            System.out.println("температура тіла нормальна");
        }
    }
}
