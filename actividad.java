import java.util.Date;
import java.util.Scanner;
import java.util.Vector;

public class actividad {
    public static void main(String[] args) {
        Date fechaActual = new Date();
        // fecha actual
        System.out.println(fechaActual);

        Scanner scansito = new Scanner(System.in);

        // Creamos un vector para almacenar enteros
        Vector<Integer> numeros = new Vector<>();

        // Llamamos al método para cargar los valores en el Vector
        cargarValores(numeros, scansito);

        // Mostramos los valores del Vector
        mostrarValores(numeros);
    }

    public static void cargarValores(Vector<Integer> vector, Scanner scansito) {
        System.out.println("Ingrese el tamaño del vector: ");
        int tamaño = scansito.nextInt();

        System.out.println("Ingrese los elementos del vector : ");
        for (int i = 0; i < tamaño; i++) {
            System.out.println("Elemento " + (i + 1) + ": ");
            vector.add(scansito.nextInt());
        }

    }

    public static void mostrarValores(Vector<Integer> vector) {
        System.out.println("Elementos del vector:");
        for (int numero : vector) {
            System.out.print(numero + " ");
        }
        System.out.println();
    }

}