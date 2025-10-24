
import java.util.Scanner;

public class Ejercicio13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero, i = 1, contador = 0;

        System.out.println("Digite un numero: ");
        numero = sc.nextInt();

        while (i <= numero) {
            if (numero % i == 0) {
                contador++;
            }
            i++;
        }
        if (contador == 2) {
            System.out.println("El numero "+ numero + " es primo");
        } else {
            System.out.println("El numero "+ numero + " no es primo");
        }
        sc.close();
    }
}
