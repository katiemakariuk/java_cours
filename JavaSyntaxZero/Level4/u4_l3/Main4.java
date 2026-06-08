package JavaSyntaxZero.Level4.u4_l3;

public class Main4 {
    public static void main(String[] args) {
        int height = 0;
        while (height < 5) {
            int width = 0;
            while (width < 10) {
                System.out.print('Q');
                width++;
            }
            System.out.println();
            height++;
        }
    }
}
