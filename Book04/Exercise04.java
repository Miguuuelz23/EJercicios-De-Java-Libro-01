
import java.lang.annotation.Retention;
import javax.lang.model.util.ElementScanner14;

public class Exercise04 {

    public static void main(String[] args) {

        double numero1 = 15;
        double numero2 = 15;
        
        double result = valoresIguales(numero1, numero2);

        System.out.println("El resultado: " + result);
    }

    public static double valoresIguales(double numero1, double numero2) {

        if (numero1 > numero2) {
            return numero1;
        } else if (numero2 > numero1) {
            return numero2;

        } else {
            return Math.PI;
        }
    }
}
