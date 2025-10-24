package Book04;

import java.util.Scanner;

public class Exercise07 {

    // Funcion Principal
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int direccion = -1;

        while (direccion == -1) {
            direccion = readInputDirection(sc);
            if (direccion == -1) {
                System.out.println("Invalid Direction");
            }
        }
        boolean shoot = readInputShoot(sc);
        String strDirection = calculateStringDirection(direccion);
        String strShoot = calculateStringShoot(shoot);

        switch (direccion) {
            case 1:
                System.out.println("The archamage steps to the left");

                break;
            case 2:
                System.out.println("The archamage steps Up");
                break;
            case 3:

                System.out.println("The archamage steps to the Rigth");

                break;
            case 4:
                System.out.println("The archamage steps Down");
                break;
        }

        showCaracterMovementAndShootStatus("The archamage", strDirection, strShoot);

    }

    // Funcion1: Leer Direccion del movimiento
    public static int readInputDirection(Scanner sc) {

        System.out.println("Please select a direction of movement: (1-left, 2-up, 3-right, 4-down)");
        int direction = sc.nextInt();
        if (direction >= 1 || direction <= 4) {
            return direction;
        } else {
            return direction - 1;
        }
    }

    // Funcion 2: Leer el estado del disparo
    public static boolean readInputShoot(Scanner sc) {
        System.out.println("Please select if the mage is shooting or not:"
                + "(false - not shooting, true - shooting)");
        boolean isShooting = sc.nextBoolean();

        return isShooting;
    }

    // Obtener Mensaje segun direccion
    public static String calculateStringDirection(int direction) {

        String menssage = "";
        switch (direction) {
            case 1:
                menssage = "Moves to the Left";
                break;
            case 2:
                menssage = "Moves Up";
                break;
            case 3:
                menssage = "moves Rigth";
                break;
            case 4:
                menssage = "moves down";
                break;
        }
        return menssage;
    }

    // Obtener mensaje segun disparo
    public static String calculateStringShoot(boolean shoot) {
        if (shoot) {
            return "and shoots";
        } else {
            return "And does not shoot";
        }
    }

    public static void showCaracterMovementAndShootStatus(String characterName, String strDirection, String strShoot) {
        System.out.println(characterName + "" + strDirection + "" + strShoot);
    }
}
