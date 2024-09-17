import java.util.Scanner;

public class ejercicio13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] diasSemana = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};
        String actividad;
        int duracion;
        int tiempoTotal = 0;
        for (int i = 0; i < diasSemana.length; i++) {

            System.out.printf("Ingrese la actividad deportiva para el %s: ", diasSemana[i]);
            actividad = scan.nextLine();

            System.out.printf("Ingrese la duración (en minutos) para la actividad del %s: ", diasSemana[i]);
            duracion = scan.nextInt();
            scan.nextLine();

            System.out.printf("%s: Actividad - %s, Duración - %d minutos\n", diasSemana[i], actividad, duracion);

            tiempoTotal += duracion;
        }
        scan.close();
        System.out.printf("\nTiempo total dedicado a actividades deportivas en la semana: %d minutos\n", tiempoTotal);
    }
}
