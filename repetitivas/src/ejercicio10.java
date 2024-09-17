import java.util.Scanner;

public class ejercicio10 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double montoPrestamo;
        double tasaInteresAnual;
        int numeroAnios;

        System.out.print("Ingrese el monto del préstamo: ");
        montoPrestamo = scan.nextDouble();

        System.out.print("Ingrese la tasa de interés anual (en %): ");
        tasaInteresAnual = scan.nextDouble();

        System.out.print("Ingrese el número de años para pagar el préstamo: ");
        numeroAnios = scan.nextInt();

        scan.close();

        double tasaInteresMensual = (tasaInteresAnual / 100) / 12;

        int numeroPagos = numeroAnios * 12;

        double pagoMensual = (montoPrestamo * tasaInteresMensual) /
                (1 - Math.pow(1 + tasaInteresMensual, -numeroPagos));

        double costoTotal = pagoMensual * numeroPagos;

        System.out.printf("Monto del préstamo: %.2f\n", montoPrestamo);
        System.out.printf("Tasa de interés anual: %.2f%%\n", tasaInteresAnual);
        System.out.printf("Número de años: %d\n", numeroAnios);
        System.out.printf("Número total de pagos: %d\n", numeroPagos);
        System.out.printf("Pago mensual: %.2f\n", pagoMensual);
        System.out.printf("Costo total del préstamo: %.2f\n", costoTotal);
    }
}
