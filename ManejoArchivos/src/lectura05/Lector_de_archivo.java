package lectura05;

public class Lector_de_archivo {

    public static void main(String[] args) {
        Programa stats = new Programa();
        String archivo = "sucursales.txt";

        System.out.println("Iniciando lectura de sucursales...");
        double promedio = stats.obtenerPromedioEmpleados(archivo);

        System.out.printf("El promedio de empleados es: %.2f\n", promedio);
    }
}     