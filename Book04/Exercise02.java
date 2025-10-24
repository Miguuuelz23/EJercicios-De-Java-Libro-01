package Book04;

public class Exercise02 {

    public static void main(String[] args) {

        int a = 12;
        int b = 5;
        int c = 123;

        double result = average(a, b, c);   //Es double porque es una division con decimales

        System.out.println("La media de los 3 numeros es " + result);

    }

    //Funcion que Calcula la media de los 3 numeros
    public static double average(int a, int b, int c) {

        return (a + b + c) / 3.0;

    }
}
