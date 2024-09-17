import java.util.Scanner;

public class ejercicio14 {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        double precioVivienda;
        double enganche;
        double montoPrestamo;
        double tasaInteresAnual;
        int numeroAnios;


        System.out.print("Ingrese el precio de la vivienda: ");
        precioVivienda = scan.nextDouble();

        System.out.print("Ingrese el monto del enganche: ");
        enganche = scan.nextDouble();

        montoPrestamo = precioVivienda - enganche;

        System.out.print("Ingrese la tasa de interés anual (en %): ");
        tasaInteresAnual = scan.nextDouble();

        System.out.print("Ingrese el número de años para pagar el préstamo: ");
        numeroAnios = scan.nextInt();

        double tasaInteresMensual = (tasaInteresAnual / 100) / 12;

        int numeroPagos = numeroAnios * 12;

        double pagoMensual = (montoPrestamo * tasaInteresMensual) /
                (1 - Math.pow(1 + tasaInteresMensual, -numeroPagos));

        double costoTotal = pagoMensual * numeroPagos;

        System.out.println("\nResumen de la compra de vivienda:");
        System.out.printf("Precio de la vivienda: %.2f\n", precioVivienda);
        System.out.printf("Monto del enganche: %.2f\n", enganche);
        System.out.printf("Monto del préstamo: %.2f\n", montoPrestamo);
        System.out.printf("Tasa de interés anual: %.2f%%\n", tasaInteresAnual);
        System.out.printf("Número de años para pagar el préstamo: %d\n", numeroAnios);
        System.out.printf("Número total de pagos: %d\n", numeroPagos);
        System.out.printf("Pago mensual: %.2f\n", pagoMensual);
        System.out.printf("Costo total del préstamo: %.2f\n", costoTotal);

        scan.close();
    }
}
