package JavaSyntaxZero.Level6.u6_l6;

public class Main {
    public static int[][] result = new int[10][];

    public static void main(String[] args) {
        //напишіть тут ваш код
        for(int i = 0; i < 10; i++){
            result[i] = new int[i + 1];
            for(int j = 0; j < result[i].length; j++){
                result[i][j] = i + j;
                System.out.print(result[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
