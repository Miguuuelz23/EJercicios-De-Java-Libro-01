
import java.util.Scanner;

public class Ejercicio16 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int type;
        double load;
        int time = 0;

        //Comprobar el tipo de combustible
        do {
            System.out.println("Insert Type of fuel: (1- Arrant Prack, 2- Smelling Oil, 3- Disgusting Gas)");
            type = sc.nextInt();
            if (type < 1 || type > 3) {
                System.out.println("Incorrect Data.  Please Try it Again");
            }
        } while (type < 1 || type > 3);

        //Comprobar la carga
        do {

            load = 5 * Math.log10(time + 1) + type * time;
            if (load > 100) {
                load = 100;
            }
            System.out.printf("Segundo %d → Carga: %.2f%%%n", time, load);
            time++;
        } while (load < 100);

        System.out.println("Carga Completa");
        sc.close();
    }
}
