import java.util.Date;
import java.util.Vector;

public class vectores {
    public static void main(String[] args) {
        Date fechaActual = new Date();
        // fecha actual
        System.out.println(fechaActual);

        System.out.println("Realizado por Alejandro Bedoya");

        Vector<String> frutas = new Vector<>();
        frutas.add("Manzana");
        frutas.add("Banana");
        frutas.add("Pera");
        System.out.println("Frutas : ");

        // declaramos string "fruta" de tipo frutas
        for (String fruta : frutas) {
            // imprimimos cada una de las frutas
            System.out.println(fruta);
        }

        frutas.remove(1); // Elimina Banana
        System.out.println("\nFrutas luego de eliminar el elemento (1) del vector ");

        // String "fruta" actualizado
        for (String fruta : frutas) {
            // imprimimos la actualización
            System.out.println(fruta);

        }

    }
}