package escritura05;

// Uso de la clase Formatter para escribir datos en un archivo de texto.
import java.util.Formatter;

public class lector {

    // agrega registros al archivo
    public static void agregarRegistros(String valor ,String nombrearchivo ) {
        String ruta = String.format("data/%s.txt", nombrearchivo);
        try {
            Formatter salida = new Formatter("ruta");
            salida.format("%s", valor);
            salida.close();

        } catch (Exception e) {
            System.err.println("Error al crear el archivo.");
            System.exit(1);

        }

    } // fin método agregarRegistros
    
}