package JavaSyntaxZero.Level4.u4_l10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double speedInMetersPerSecond = scanner.nextInt();
        int speedInKilometersPerHour = (int) Math.round(speedInMetersPerSecond * 3.6);
        System.out.println(speedInKilometersPerHour);
    }
}
