
import java.util.Scanner;

public class Ejercicio17 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Character Creation");
        System.out.println("---------------");
        String type;
        String name;
        int speed = 0;
        int intelligence = 0;
        int strength = 0;
        int age = 0;
        double magick;
        int level = 0;
        //Verificamos que el nombre no este vacio primero
        do {
            System.out.println("Insert Character Name");
            name = sc.nextLine().trim();  //Que hace esta linea?

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

        //Validad Strength
        do {
            System.out.println("Insert Character Strength (7-10): ");
            if (sc.hasNextInt()) {
                strength = sc.nextInt();
                if (strength < 7 || strength > 10) {
                    System.out.println("Incorrect Data. Please try it again");

                }
            } else {
                System.out.println("Incorrect Data. Please Try it Again");
                sc.next();
            }

        } while (strength < 7 || strength > 10);

        //Validar velocidad
        do {
            System.out.println("Insert Character Speed (8-20): ");
            if (sc.hasNext()) {
                speed = sc.nextInt();
                if (speed < 8 || speed > 20) {
                    System.out.println("Incorrect Data. Please try it again");
                }
            } else {
                System.out.println("Incorrect Data. Please try it again");
                sc.next();
            }

        } while (speed < 8 || speed > 20);

        //Validar Inteligencia
        do {
            System.out.println("Insert Character intelligence (7-15): ");
            if (sc.hasNext()) {
                intelligence = sc.nextInt();
                if (intelligence < 7 || intelligence > 15) {
                    System.out.println("Incorrect Data. Please try it again");
                }
            } else {
                System.out.println("Incorrect Data. Please try it again");
                sc.next();
            }

        } while (speed < 7 || speed > 15);

        //Calcular level
        level = 1 + (age - 15) / 2;
        if (level > 10) {
            level = 10;
        }

        //Calculat Hit Points
        double hitPoints;
        if (type.equalsIgnoreCase("Figther") || type.equalsIgnoreCase("Thief")) {
            hitPoints = Math.ceil(40 + level * ((strength - 7) / 3.0));
        } else {
            hitPoints = Math.ceil(20 + level * ((strength - 7) / 4.0));
        }
        //Calcular Maggick
        magick = 0;

        if (type.equalsIgnoreCase("Cleric") || type.equalsIgnoreCase("Mage")) {
            magick = Math.ceil(20 + level * ((intelligence - 7) / 5.0));
        }

        //Calcular Combat
        int combat = (int) (10 + level * strength);
        if (combat > 100) {
            combat = 100;
        }

        //Calcular Missile
        int missile = (int) Math.floor(level * (speed / 3.0));
        // Mostrar resultados
        System.out.println("\nCharacter attributes");
        System.out.println("------------------------");
        System.out.println("Name: " + name);
        System.out.println("Class: " + type);
        System.out.println("Age: " + age);
        System.out.println("Level: " + level);
        System.out.println("Hit Points: " + (int) hitPoints);
        System.out.println("Magick: " + (int) magick);
        System.out.println("Combat: " + combat);
        System.out.println("Missile: " + missile);
    }

}
