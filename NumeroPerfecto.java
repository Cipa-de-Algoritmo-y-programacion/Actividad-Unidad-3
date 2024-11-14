import java.util.Scanner;

public class NumeroPerfecto {
    public static void main(String[] args) {
            Scanner Num = new Scanner(System.in);

        // ingresar un numero 
            System.out.println ("Ingresa un número para verificar si es un número perfecto: ");
                 int numeroperfecto = Num.nextInt();

                     int suma = 0;

        // divisores del numero excluyendo el mismo nimero 
        
            for (int i = 1; i < numeroperfecto; i++) {
                if (numeroperfecto % i == 0) {
                
        // Suma de divisores.
            
            suma = suma + i;

            }
        }

        // Verificar si la suma de los divisores es igual al número
        if (suma == numeroperfecto) {
            System.out.println(numeroperfecto + " es un número perfecto :D");
        } else {
            System.out.println(numeroperfecto + " no es un número perfecto :(");
        }

        Num.close();
    }
}
