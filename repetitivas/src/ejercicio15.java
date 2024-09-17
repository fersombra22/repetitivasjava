import java.util.Scanner;

public class ejercicio15 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int numeroTemas;
        double tiempoDisponible;
        double tiempoTotalNecesario = 0;

        System.out.print("Ingrese el número de temas que necesita estudiar: ");
        numeroTemas = scan.nextInt();

        System.out.print("Ingrese el tiempo total disponible (en horas) para estudiar: ");
        tiempoDisponible = scan.nextDouble();

        for (int i = 1; i <= numeroTemas; i++) {
            System.out.printf("Ingrese el tiempo estimado (en horas) para el tema #%d: ", i);
            double tiempoPorTema = scan.nextDouble();
            tiempoTotalNecesario += tiempoPorTema;
        }

        scan.close();


        if (tiempoDisponible >= tiempoTotalNecesario) {
            System.out.printf("¡Sí, tienes suficiente tiempo para estudiar! Tiempo total necesario: %.2f horas, Tiempo disponible: %.2f horas\n", tiempoTotalNecesario, tiempoDisponible);
        } else {
            System.out.printf("No tienes suficiente tiempo para estudiar. Tiempo total necesario: %.2f horas, Tiempo disponible: %.2f horas\n", tiempoTotalNecesario, tiempoDisponible);
        }

    }
}
