import java.text.NumberFormat;
import java.util.Scanner;

public class Ejercicio13 {
    // Crear un programa que permita calcular un numero al azar

    public static void main(String[] args){
        numeroAzar();
    }

    public static void numeroAzar(){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese la Operacion que desea realizar con un numero al azar *1-50*");
        String opcion = sc.nextLine().toLowerCase();

        NumberFormat formato = NumberFormat.getNumberInstance();
        double numero = (Math.random() * 50);
        numero = Math.round(numero);
        
        // Hacer Operacioens Con El Numero Generado Aleatoriamente
        switch(opcion){
            case "suma", "+" -> {
                System.out.println("El numero aleatorio es: " + numero);
                
                System.out.println("Ingrese el Numero que se le va a sumar al Numero generado aleatoriamente");
                int numeroSuma = sc.nextInt();
                
                double totalSuma = numero + numeroSuma;
                
                System.out.println(formato.format(totalSuma));
            }
            case "resta", "-" -> {
                System.out.println("El numero aleatorio es: " + numero);
                
                System.out.println("Ingrese el Numero que se le va a restar al Numero generado aleatoriamente");
                int numeroResta = sc.nextInt();
                
                double totalResta = numeroResta - numero ;
                System.out.println(formato.format(totalResta));
            }

            case "multiplicacion", "*" -> {
                System.out.println("El numero aleatorio es: " + numero);
                
                System.out.println("Ingrese el Numero que se a multiplicar con el Numero generado aleatoriamente");
                int numeroMultiplicacion = sc.nextInt();
                
                double totalMultiplicacion = numero * numeroMultiplicacion;
                System.out.println(formato.format(totalMultiplicacion));
            }
            case "division", "/" -> {
                System.out.println("El numero aleatorio es: " + numero);
                
                System.out.println("Ingrese el Numero que se va a dividir al Numero generado aleatoriamente");
                int numeroDividir = sc.nextInt();
                
                double totalDivision = numero / numeroDividir;
                System.out.println(formato.format(totalDivision));
            }
            case "modulo", "%" -> {
                System.out.println("El numero aleatorio es: " + numero);                
                double totalModulo = numero % 2;
                System.out.println(formato.format(totalModulo));
            }
            default -> {
                System.out.println("Ingrese Una Opcion Valida");
            }
        }
        sc.close();
    }
}
