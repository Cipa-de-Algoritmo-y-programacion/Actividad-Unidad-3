import java.util.Scanner;

public class Ejercicio7 {
    // crear un programa que sea capaz de calcular si un numero es perfecto.

    public static void main(String[] args) {
        calcular(preguntar());
    }

    public static int preguntar(){
        Scanner input = new Scanner(System.in);
        int numero;

        System.out.println("Ingrese un numero: ");
        numero = input.nextInt();
        input.close();

        return numero;
    }

    public static void calcular(int numero){
        int sumador=0;
        for(int i = 1; i < numero; i++){
            if(numero % i == 0){
                sumador +=i ;
            }

        }

        if(numero == sumador)
            System.out.println("El " + numero + " es un número perfecto ");
        else
            System.out.println("El " + numero + " no es un número perfecto");
    }
}
