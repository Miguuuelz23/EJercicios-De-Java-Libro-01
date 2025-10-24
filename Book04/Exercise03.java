package Book04;

public class Exercise03 {

    public static void main(String[] args) {

        float a = 5;
        float b = 3;
        float c = 2;
        Boolean option = false;
        float result = retornar(a, b, c, option);

        System.out.println(result);
    }

    public static float retornar(float a, float b, float c, boolean option) {
        if (option) {

            return (float) (a * b / c);

        } else {
            return (float) -157800f;
        }

    }

}
