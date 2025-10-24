
import java.util.Scanner;

public class Ejercicio19 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op = 0;
        String option = "";
        System.out.println("EPIC CALCULATOR");
        System.out.println("------------------------");

        do {
            System.out.println("SELECT AN OPTION");
            System.out.println("1. Perform Calculation");
            System.out.println("2. Exit.");
            if (sc.hasNext()) {
                op = sc.nextInt();
                sc.nextLine();
                if (op == 1) {
                    int num1, num2 = 0;
                    //Pedir primero numero
                    while (true) {
                        System.out.println("Enter First Number");
                        if (sc.hasNextInt()) {
                            num1 = sc.nextInt();
                            sc.nextLine();
                            break;
                        } else {
                            System.out.println("Incorrect Data. Please try it again");
                            sc.next();
                        }
                    }
                    //Pedir segundo numero
                    while (true) {
                        System.out.println("Enter Second Number");
                        if (sc.hasNextInt()) {
                            num2 = sc.nextInt();
                            sc.nextLine();
                            break;
                        } else {
                            System.out.println("Incorrect Data. Please try it again");
                            sc.next();
                        }
                    }
                    //Pedir operacion

                    System.out.println("Entrer operation (+,-,*,/,%,P)");
                    option = sc.nextLine().trim();

                    //Realizar Operacion
                    switch (option) {
                        case "+": {
                            System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
                            break;
                        }
                        case "-": {
                            System.out.println(num1 + " + " + num2 + " = " + (num1 - num2));
                            break;
                        }
                        case "*": {
                            System.out.println(num1 + " + " + num2 + " = " + (num1 * num2));
                            break;
                        }
                        case "/": {
                            if (num2 == 0) {
                                System.out.println("Cannot divide by zero");
                            } else {
                                System.out.println(num1 + " + " + num2 + " = " + (num1 / num2));
                            }
                            break;
                        }
                        case "%": {
                            if (num2 == 0) {
                                System.out.println("Cannot module by zero");
                            } else {
                                System.out.println(num1 + " + " + num2 + " = " + (num1 % num2));
                            }
                            break;
                        }
                        case "p", "P": {
                            System.out.println(num1 + " + " + num2 + " = " + Math.pow(num1, num2));
                            break;
                        }
                        default:
                        System.out.println("Incorrect Option");
                    }

                } else if (op == 2) {
                    System.out.println("FAREWELL");
                }

            } else {
                System.out.println("Incorrect Data. Please try it Again");
                sc.next();
            }

        } while (op != 2);

    }
}
