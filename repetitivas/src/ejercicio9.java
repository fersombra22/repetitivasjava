import java.util.Scanner;

public class ejercicio9 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Ingrese el número de destinos que desea visitar: ");
        int numeroDeDestinos = scan.nextInt();

        scan.nextLine();

        String[] destinos = new String[numeroDeDestinos];
        double[] costos = new double[numeroDeDestinos];
        int[] duraciones = new int[numeroDeDestinos];
        for (int i = 0; i < numeroDeDestinos; i++) {
            System.out.print("Ingrese el nombre del destino #" + (i + 1) + ": ");
            destinos[i] = scan.nextLine();

            System.out.print("Ingrese el costo estimado para " + destinos[i] + ": ");
            costos[i] = scan.nextDouble();

            System.out.print("Ingrese la duración en días en " + destinos[i] + ": ");
            duraciones[i] = scan.nextInt();

            scan.nextLine();
        }

        scan.close();

        double costoTotal = 0.0;
        int duracionTotal = 0;

        for (int i = 0; i < numeroDeDestinos; i++) {
            costoTotal += costos[i];
            duracionTotal += duraciones[i];
        }

        System.out.println("\nResumen de su viaje:");
        for (int i = 0; i < numeroDeDestinos; i++) {
            System.out.printf("Destino: %s\n", destinos[i]);
            System.out.printf("Costo: %.2f\n", costos[i]);
            System.out.printf("Duración: %d días\n", duraciones[i]);
            System.out.println();
        }

        System.out.printf("Costo total del viaje: %.2f\n", costoTotal);
        System.out.printf("Duración total del viaje: %d días\n", duracionTotal);
    }
}
