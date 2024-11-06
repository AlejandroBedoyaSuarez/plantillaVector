import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;
import java.util.Vector;

public class vectorSuma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Creamos un Vector para almacenar enteros
        Vector<Integer> numeros = new Vector<>();

        // Pedimos al usuario el tamaño del vector
        System.out.print("Ingresar el tamaño del vector : ");
        int tamaño = scanner.nextInt();

        // Llenamos el Vector con datos ingresados por el usuario
        System.out.println("Ingrese los elementos del vector : ");
        for (int i = 0; i < tamaño; i++) {
            System.out.println("Elemento " + (i + 1) + ": ");
            numeros.add(scanner.nextInt());
        }

        // Mostramos los elementos del Vector
        System.out.println("Elementos del Vector");
        // declaro la variable numero de numeros
        // va sumando en secuencia
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }

        // Calculamos la suma de los elementos
        int suma = 0;
        for (int numero : numeros) {
            suma += numero;
        }
        System.out.println("\nLa suma de los elementos es : " + suma);
    }
}