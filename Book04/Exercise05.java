package Book04;

public class Exercise05 {

    public static void main(String[] args) {

        float peso = (float) 70.6;
        float altura = (float) 1.80;

        float iMC = (float) calculate(peso, altura);

        System.out.printf("Tu IMC es de: %.2f%n", iMC);
    }

    public static float calculate(float peso, float altura) {

        return (float) (peso / Math.pow(altura, 2));

    }
}
