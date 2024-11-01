import java.text.NumberFormat;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Ejercicio11 {
    // Crear un menú de operaciones aritmeticas

    static NumberFormat formatter = NumberFormat.getInstance(Locale.US);
    public static void main(String[] args) {
        preguntar();
    }

    public static void preguntar(){
        Scanner input = new Scanner(System.in);
        int select;
        double num1,num2;
        System.out.println("Menú");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Salir");
            System.out.println("Ingresa un numero para seleccionar ");
            try {
                select = input.nextInt();
                if(select == 5){
                    System.out.println("Ha seleccionado Salir ");
                    System.exit(0);
                }
                System.out.print("Ingrese el primer numero: ");
                num1 = input.nextDouble();
                System.out.print("Ingrese el segundo numero: ");
                num2 = input.nextDouble();
                operar(select,num1,num2);
            }catch (InputMismatchException e){
                System.out.println("Has ingresado un valor invalido");
                System.out.println("Error: " + e.getMessage());
            }


    }

    public static void operar(int op,double num1,double num2){
        switch(op){
            case 1:
                System.out.println("Ha seleccionado Sumar " + formatter.format(num1) + " + " + formatter.format(num2) + " = " + formatter.format((num1 + num2)));
            break;
            case 2:
                System.out.println("Ha seleccionado Restar " + formatter.format(num1) + " - " + formatter.format(num2) + " = " + formatter.format((num1 - num2)));
            break;
            case 3:
                System.out.println("Ha seleccionado Multiplicar " + formatter.format(num1) + " * " + formatter.format(num2) + " = " + formatter.format((num1 * num2)));
            break;
            case 4:
                System.out.println("Ha seleccionado Dividir " + formatter.format(num1) + " / " + formatter.format(num2) + " = " + formatter.format((num1 / num2)));
            break;
            default:
                System.out.println("No se ha seleccionado una opción valida");
                System.exit(0);
            break;
        }
    }
}
