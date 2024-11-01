import java.text.NumberFormat;

public class Ejercicio6 {
    // Crear un programa que permita calcular un numero al azar

    public static void main(String[] args){
        numRandom();
    }

    public static void numRandom(){
        NumberFormat formato = NumberFormat.getNumberInstance();
        double numero =  Math.random();
        numero = numero * 50;
        numero = Math.round(numero);
        System.out.println(formato.format(numero));
    }
}
