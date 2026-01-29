package escritura05;

import escritura04.principal;
import java.util.Scanner;

public class principal2 {

    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);
        String cadenaFinal = "";

        boolean bandera = true;
        while (bandera) {
            
            cadenaFinal= ""; 
         
        
            System.out.println("Ingrese su cedula");
            String cedula = entrada.nextLine();
            System.out.println("Ingrese su nombre");
            String nombre = entrada.nextLine();
            System.out.println("Ingrese su tipo de carro");
            String carro = entrada.nextLine();
            System.out.println("Ingrese la placa de su vehiculo");
            String placa = entrada.nextLine();
            
            System.out.println("Presione s si desea terminar el programa");
            String opcionSalida = entrada.nextLine();
            
            if (opcionSalida.equals("s"));{
               bandera = false;
               
        }String letra = placa.substring(0, 1).toUpperCase();

            String archivo;

            switch (letra) {
                case "L":
                    archivo = "L";
                    break;

                case "G":
                    archivo = "G";
                    break;

                case "P":
                    archivo = "P";
                    break;

                default:
                    archivo = "otros";
                    break;
            }
            cadenaFinal = String.format("%s | %s | %s | %s\n",
                        cedula, nombre, carro, placa);
            principal.main(args);
        }
        System.out.println("Datos guardados correctamente.");
    }
}