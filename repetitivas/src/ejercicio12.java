import java.util.Scanner;

public class ejercicio12 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int numeroDias;
        int numeroTemas;
        double tiempoTotalEstudio;

        System.out.print("Ingrese el número de días disponibles para estudiar: ");
        numeroDias = scan.nextInt();

        System.out.print("Ingrese el número de temas a estudiar: ");
        numeroTemas = scan.nextInt();

        System.out.print("Ingrese el tiempo en horas que desea dedicar a cada tema: ");
        double tiempoPorTema = scan.nextDouble();

        scan.close();

        tiempoTotalEstudio = numeroTemas * tiempoPorTema;

        double tiempoDiario = tiempoTotalEstudio / numeroDias;

        System.out.printf("Tiempo total de estudio necesario: %.2f horas\n", tiempoTotalEstudio);
        System.out.printf("Tiempo de estudio diario necesario para cubrir todos los temas: %.2f horas\n", tiempoDiario);

        if (tiempoDiario > 4) {
            System.out.println("Parece que necesitarás dedicar más de 4 horas al día para estudiar. Considera ajustar tu plan.");
        } else if (tiempoDiario > 2) {
            System.out.println("El tiempo de estudio diario está en un rango moderado. Asegúrate de tomar descansos.");
        } else {
            System.out.println("El tiempo de estudio diario es razonable. ¡Buen trabajo!");
        }
    }
}
