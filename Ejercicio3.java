
import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("-----Character Creation-----");

        System.out.println("Insert Character Name");
        String name = sc.next();
        System.out.println("Insert Character class (Figther, Cleric, Thief, Mage): ");
        String type = sc.next();
        System.out.println("Insert Character age (15-40): ");
        int age = sc.nextInt();
        System.out.println("Insert Character strength (2-10): ");
        int strength = sc.nextInt();
        System.out.println("Insert Character Speed (8-20): ");
        int speed = sc.nextInt();
        System.out.println("Insert Character inteligence(7-15): ");
        int inteligence = sc.nextInt();

        int level;
        int hitpoints;
        int magick;
        int combat;
        int missile;
        if (age < 15) {
            level = 0;

        } else {
            level = 1 + (age - 15) / 2;

        }
        hitpoints = 30 + level * (strength - 2) / 3;
        magick = 10 + level * (inteligence - 7) / 4;
        combat = 10 + level * strength;
        missile = level * speed / 3;

        System.out.println("Character attributes");
        System.out.println("------------------------");

        System.out.println("Name: " + name);
        System.out.println("Class: " + type);
        System.out.println("Age: " + type);
        System.out.println("Speed: " + speed);
        System.out.println("Strength: " + strength);
        System.out.println("Intenlligence: " + inteligence);

        System.out.println("-----------------");

        System.out.println("Level: " + level);
        System.out.println("Hit Points: " + hitpoints);
        System.out.println("Magick: " + Math.ceil(magick));
        System.out.println("Combat: " + combat);
        System.out.println("Missile: " + missile);

        sc.close();
    }
}
