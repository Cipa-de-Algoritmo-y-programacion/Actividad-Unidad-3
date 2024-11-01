import java.text.NumberFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio5 {
    public static NumberFormat format = NumberFormat.getInstance();

    // Crear un programa que permita sacara la raiz cuadrada de un numero
    public static void main(String[] args){
        solicitar();
    }

    public static void solicitar(){
        Scanner input = new Scanner(System.in);
        int number;
        System.out.println("Ingrese un número entero positivo: ");
        try{
            number = input.nextInt();
            if(number >= 0)
                calcularRaiz(number);
            else
                System.out.println("No estamos operando con números imaginarios.");
        }catch (InputMismatchException e) {
            System.out.println("Error no ha ingresado un número entero");
        }
    }
    public static void calcularRaiz(double numero){
        double raiz = Math.sqrt(numero);
        System.out.println("La raiz de " + format.format(numero) + " es: " + format.format(raiz));
    }
}
