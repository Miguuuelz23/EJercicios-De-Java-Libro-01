
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Pedimos el nombre del personaje
        System.out.println("Insert Your Character Name:");
        String name = sc.next();   // Guardamos el nombre del personaje para despues mostrarlo


        //Mostramos el mensaje al final del programa
        System.out.println("Your Character name is " +  name);

        


        sc.close();
    }
    
}