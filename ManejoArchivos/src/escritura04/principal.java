package escritura04;

import java.util.Scanner;

public class principal {

    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);
        String cadenaFinal = "";

        int intentos;
        System.out.println("Ingrese el numero de veces que desea ingresar un usuario");
        intentos= entrada.nextInt();
        entrada.nextLine();
        
        for (int i = 0; i < intentos; i++) {
            
            cadenaFinal= "";
            
            System.out.println("Ingrese su cedula");
            String cedula = entrada.nextLine();
            System.out.println("Ingrese su nombre");
            String nombre = entrada.nextLine();
            System.out.println("Ingrese su correo");
            String correo = entrada.nextLine();
           
                   
            

            cadenaFinal = String.format("%s %s %s %s \n", cadenaFinal,
                    cedula,
                    nombre, correo);
             lector.agregarRegistros(cadenaFinal, cedula);
        }
       

    } // fin de main
}