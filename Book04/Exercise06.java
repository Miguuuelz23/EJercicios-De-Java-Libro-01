package Book04;

public class Exercise06 {

    public static void main(String[] args) {

        int numero = 36;

        int mostrar = calcularDivisores(numero);

    }

    public static int calcularDivisores(int numero) {
        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                System.out.println(i);
            }
        }
        return numero;
    }

}
