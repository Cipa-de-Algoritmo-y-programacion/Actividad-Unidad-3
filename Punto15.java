import java.util.Scanner;


public class Punto15 {
    //Desarrollar una función recursiva que calcule el factorial de un número.
    public static void main(String[] args) {
        int numero, num;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite un numero");
        numero = teclado.nextInt();
        num=numero;
        for(int i=numero;i>1;i--){
            if(i!=numero){
                numero *= i;

            }

            System.out.println(numero);

        }
        System.out.println("El factorial de " +num+ " es:" + numero);
    }
}
