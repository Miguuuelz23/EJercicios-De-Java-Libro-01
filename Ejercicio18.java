
import java.util.Scanner;

public class Ejercicio18 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name;
        String type;
        int strength = 0;
        int speed = 0;
        int intelligence = 0;
        int life = 0;
        int age = 0;
        //Ingresamos el nombre y validamos que ingrese los datos correctos
        do {
            System.out.println("Insert Character name: ");
            name = sc.nextLine().trim();
            if (name.isEmpty()) {
                System.out.println("Incorrect Data. Please try it Again");
            }

        } while (name.isEmpty());

        //Verificamos que el tipo de class no este vacio
        boolean validClass = false;
        do {
            System.out.println("Insert Character Type (Figther, Cleric, Thief, Mage)");
            type = sc.nextLine().trim();  //Que hace esta linea?

            if (type.equalsIgnoreCase("Figther") || type.equalsIgnoreCase("Cleric") || type.equalsIgnoreCase("Thief") || type.equalsIgnoreCase("Mage")) {
                validClass = true;
            } else {
                System.out.println("Incorrect Data. Please try it again");
            }
        } while (!validClass);

        //Validar Edad
        do {
            System.out.println("Insert Character Age (15-40)");
            if (sc.hasNextInt()) {
                age = sc.nextInt();
                if (age < 15 || age > 40) {
                    System.out.println("Incorrect Data. Please Try it Again");

                }
            } else {
                System.out.println("Incorrect Data. Please Try it Again");
                sc.next();
            }

        } while (age < 15 || age > 40);
        //Ingresamos el strength y validamos que ingrese los datos en el rango requerido
        do {

            System.out.println("Insert Character Strength (2-10):");
            if (sc.hasNextInt()) {
                strength = sc.nextInt();
                if (strength < 2 || strength > 10) {
                    System.out.println("Incorrect Data. Please try it again");
                }
            } else {
                System.out.println("Incorrect Data. Please try it again");
                sc.next();
            }

        } while (strength < 2 || strength > 10);

        //  Pedimos la velocidad y verificamos que el rango sea el valor requerido
        do {

            System.out.println("Insert Character Speed (2-20): ");
            if (sc.hasNext()) {
                speed = sc.nextInt();
                if (speed < 2 || speed > 20) {
                    System.out.println("Incorrect Data. Please try it again");
                }

            } else {
                System.out.println("Incorrect Data. Please try it again");
                sc.next();
            }
        } while (speed < 2 || speed > 20);

        // Pedimos la inteligencia y verificamos que el rango sea el valor requerido
        do {

            System.out.println("Insert Character Intelligence (7-15)");
            if (sc.hasNext()) {
                intelligence = sc.nextInt();
                if (intelligence < 7 || intelligence > 15) {
                    System.out.println("Incorrect Data. Please Try it again");

                }
            } else {
                System.out.println("Incorrect Data. Please Try it again");
                sc.next();
            }

        } while (intelligence < 7 || intelligence > 15);

        life = (int) Math.ceil((strength + speed) / 2);

        System.out.println("Character Attributes");
        System.out.println("----------------");

        System.out.println("Name: " + name);
        System.out.println("Class: " + type);
        System.out.println("Age: " + age);
        System.out.println("STR: " + "†".repeat(strength));
        System.out.println("SPE: " + "†".repeat(speed));
        System.out.println("INT" + "†".repeat(intelligence));
        System.out.println("LIF" + "♥".repeat(life));

        sc.close();
    }

}
