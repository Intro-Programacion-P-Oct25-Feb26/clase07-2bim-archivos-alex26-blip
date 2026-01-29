package lectura05;

import java.io.File;
import java.util.Scanner;

public class Programa {

    public double obtenerPromedioEmpleados(String rutaArchivo) {
        int sumaEmpleados = 0;
        int contadorEmpresasValidas = 0;

        try (Scanner lector = new Scanner(new File(rutaArchivo))) {
            while (lector.hasNextLine()) {
                String linea = lector.nextLine();
                
                try {
                    // Procesar la línea
                    String[] datos = linea.split(",");
                    
                    // Validación personalizada: ejemplo, si faltan columnas o datos
                    if (datos.length < 2) {
                        throw new Exception("Línea incompleta o formato inválido: " + linea);
                    }

                    int numEmpleados = Integer.parseInt(datos[1].trim());
                    
                    // Validación: empleados no pueden ser negativos
                    if (numEmpleados < 0) {
                        throw new Exception("Número de empleados negativo detectado: " + numEmpleados);
                    }

                    sumaEmpleados += numEmpleados;
                    contadorEmpresasValidas++;

                } catch (Exception e) {
                    // El punto 6 pide que el error permita seguir en el while
                    System.err.println("Error procesando registro: " + e.getMessage());
                }
            }
        } catch (Exception e) {
            System.err.println("Error general de archivo: " + e.getMessage());
        }

        // Retornar el promedio
        return contadorEmpresasValidas > 0 ? (double) sumaEmpleados / contadorEmpresasValidas : 0.0;
    }
}