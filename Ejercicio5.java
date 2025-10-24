
import java.util.Scanner;

public class Ejercicio5 {

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Yuri The Archmage");

        System.out.println("Insert Life Points (-2,10)");
        int life = sc.nextInt();
        System.out.println("Is tired?");
        boolean isTired = sc.nextBoolean();

        String state = "";

        if (life < 0) {
            state = "dead";
        } else if (life == 0 && isTired) {
            state = "unconscious";
        } else if (life == 0 && !isTired) {
            state = "exhausted";

        } else if (life == 2 & !isTired) {
            state = "Ill";
        } else if (life > 0 && life < 2 && !isTired) {
            state = "Unhealthy";
        } else if (life > 2 && !isTired) {
            state = "Healthy";
        } else if (life > 0 && life != 2 && isTired) {
            state = "Weary";
        }

        System.out.println("Yuri the archmage is " + state);
    sc.close();
    }

}
