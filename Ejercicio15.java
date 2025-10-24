
import java.util.Scanner;

public class Ejercicio15 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 10; i++) {
            System.out.println();
            for (int j = 1; j <= 10; j++) {

                System.out.print("\t" + i + " X " + j + " = " + i * j);
            }
            System.out.println();
        }
        sc.close();

    }
}
