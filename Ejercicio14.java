
import java.util.Scanner;

public class Ejercicio14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero = 2;
        int contador = 0;

        while (contador < 51) {
            boolean esPrimo = true;
            for (int i = 2; i <= Math.sqrt(numero); i++) {

                if (numero % i == 0) {
                    esPrimo = false;
                    break;
                }

            }
            if (esPrimo) {
                System.out.println(numero + " ");
                contador++;
            }
            numero++;
        }

        sc.close();
    }
}
