
import java.util.Scanner;

public class Ejercicio4 {

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("-----Epic Calculator------");

        System.out.println("Pedir primer numero: ");
        int num1 = sc.nextInt();
        System.out.println("Pedir Segundo Numero :");
        int num2 = sc.nextInt();

        System.out.println("Digite la opcion: (+,-,*,/,%,P)");
        String option = sc.next();
        int resultado;
        switch (option) {
            case "+" ->  {
                resultado = num1 + num2;
                System.out.println(num1 + " + " + num2 + " = " + resultado);
            }
            case "-" ->  {
                resultado = num1 - num2;
                System.out.println(num1 + " - " + num2 + " = " + resultado);
            }
            case "*" ->  {
                resultado = num1 * num2;
                System.out.println(num1 + " * " + num2 + " = " + resultado);
            }
            case "/" ->  {
                resultado = num1 / num2;
                System.out.println(num1 + " / " + num2 + " = " + resultado);
            }
            case "%" ->  {
                resultado = num1 % num2;
                System.out.println(num1 + " % " + num2 + " = " + resultado);
            }
            case "P" ->  {
                resultado = (int) Math.pow(num1, num2);
                System.out.println(num1 + " ^ " + num2 + " = " + resultado);
            }

            default -> System.out.println("Option Incorrect!");

        }

        sc.close();
    }
}
