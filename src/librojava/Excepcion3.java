package librojava;

import java.util.Scanner;

public class Excepcion3 {

    public static void main(String[] args) {
        boolean continuar = true;
       int dato;
        while (continuar) {
            try {
                System.out.println("Introduce un numero entero");
                Scanner teclado = new Scanner(System.in);
                dato=teclado.nextInt();
                System.out.println("El numero entero es: "+dato);
                continuar=false;
            }catch(Exception e){
            System.out.println(e.getMessage());
            }
        }
    }
}
