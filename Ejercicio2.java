
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("-----Character Creation-------");

        System.out.println("Insert Character Name: ");            //Pedimos al usuario el nombre
        String name = sc.next();                                    //Guardamos el nombre que introdujo el Usuario         
        System.out.println("Insert Character Class (Fighter, Cleric, Thief, Mage): ");    
        String type = sc.next();
        System.out.println("Insert Character Life: ");
        int life = sc.nextInt();


        //Mostramos los datos 


        System.out.println(name + " the " + type +" has "+life+" life points");

        sc.close();
    }
}
