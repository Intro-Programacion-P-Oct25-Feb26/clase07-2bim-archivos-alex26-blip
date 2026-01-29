/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lectura04;

import java.io.File;
import java.util.Scanner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * promedio que este fuera del while
 *
 * @author USUARIO
 */
public class Principal {

    public static void leerRegistros() {

        double suma = 0;
        int contador = 0;

        try {
            // Asegúrate de que la carpeta 'data' y el archivo existan
            Scanner entrada = new Scanner(new File("data/datosDos.txt"));

            while (entrada.hasNextLine()) {
                String linea = entrada.nextLine();
                
                // Separamos la línea por el caracter ';'
                List<String> lista = Arrays.asList(linea.split(";"));
                ArrayList<String> linea_partes = new ArrayList<>(lista);
                
                // Intenta leer el número en la posición 3
                if (linea_partes.size() > 3) {
                    double x = Double.parseDouble(linea_partes.get(3));
                    suma = suma + x;
                    contador = contador + 1;
                }

                // Imprime cada parte de la línea
                for (int i = 0; i < linea_partes.size(); i++) {
                    System.out.println(linea_partes.get(i));
                }
                
                System.out.println("------------------------------------");
            } 
            
            entrada.close();
            
            // Cálculo del promedio
            if (contador > 0) {
                suma = suma / contador;
                System.out.println("El promedio es: " + suma);
            } else {
                System.out.println("No se procesaron datos para el promedio.");
            }
            
        } catch (Exception e) {
            System.err.println("Error al leer del archivo.");
            System.exit(1);
        }
    }
}