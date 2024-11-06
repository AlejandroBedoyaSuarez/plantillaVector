import java.util.Date;
import java.util.Vector;

public class clase3 {
    public static void main(String[] args) {
        
        Date fechaActual = new Date();
        // fecha actual
        System.out.println(fechaActual);

        System.out.println("Realizado por Alejandro Bedoya");
        
        // Vector <tipo de dato> variable = new Vector<>();
        Vector<Integer> numeros = new Vector<>();
        Vector<String> nombres = new Vector<>();

        // Agregación de elementos
        numeros.add(10);
        numeros.add(20);
        nombres.add("Ana");
        nombres.add("Juan");

        // Acceso Elementos
        int primerNumero = numeros.get(0); // Obtiene el primer elemento
        String segundoNombre = nombres.get(1);

        // Eliminación de elementos
        numeros.remove(0);

        // Condicional de verificación de Valores
        boolean estaVacio = numeros.isEmpty();

        // Obtener el tamaño de un Vector
        int tamanio = numeros.size();

        // Interación entre elementos del Vector
        for (int i = 0; i < numeros.size(); i++) {
            System.out.println(numeros.get(i));
        }

    }
}