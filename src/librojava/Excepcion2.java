package librojava;

public class Excepcion2 {

    public static int numerador;
    public static int denominador;
    private static int division;

    public static void main(String[] args) {
        numerador = 10;
        denominador = 0;
        System.out.println("Vamos a calcular una division");
        try {
            division = numerador / denominador;
        } catch (ArithmeticException ex) {
            //Si se da, igualamos division a cero
            division = 0;
            System.out.println("Error: " + ex.getMessage());
        }
        System.out.println("El resultado es: " + division);
    }
}
