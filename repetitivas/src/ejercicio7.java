import java.util.Scanner;

public class ejercicio7 {
    public static void main(String[] args) {

        double ahorroInicial;
        double aportacionMensual;
        double tasaInteresAnual;
        int duracionEnAnios;

        Scanner scan = new Scanner(System.in);

        System.out.print("Ingrese el monto inicial del ahorro: ");
        ahorroInicial = scan.nextDouble();

        System.out.print("Ingrese la aportación mensual: ");
        aportacionMensual = scan.nextDouble();

        System.out.print("Ingrese la tasa de interés anual (en %): ");
        tasaInteresAnual = scan.nextDouble();

        System.out.print("Ingrese la duración del ahorro en años: ");
        duracionEnAnios = scan.nextInt();

        scan.close();

        double tasaInteresMensual = (tasaInteresAnual / 100) / 12;

        int totalMeses = duracionEnAnios * 12;


        double montoFinal = ahorroInicial;

        for (int i = 0; i < totalMeses; i++) {

            montoFinal += aportacionMensual;

            montoFinal += montoFinal * tasaInteresMensual;
        }

        System.out.printf("Después de %d años, el monto total ahorrado será: %.2f\n", duracionEnAnios, montoFinal);

    }
}
