package librojava;

public class Excepcion1 {

    public static int numerador;
    public static int denominador;
    private static int division;

    public static void main(String[] args) {
        numerador = 10;
        denominador = 0;
        System.out.println("Vamos a calcular una division");
        division = numerador / denominador;
        System.out.println("El resultado es: " + division);
    }
}
