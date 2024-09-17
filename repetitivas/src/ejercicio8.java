import java.util.Scanner;

public class ejercicio8 {
    public static void main(String[] args) {

        double presupuestoMensual;
        double gastoAlquiler;
        double gastoComida;
        double gastoTransporte;
        double gastoOtros;

        Scanner scan = new Scanner(System.in);

        System.out.print("Ingrese su presupuesto mensual: ");
        presupuestoMensual = scan.nextDouble();

        System.out.print("Ingrese el gasto en alquiler: ");
        gastoAlquiler = scan.nextDouble();

        System.out.print("Ingrese el gasto en comida: ");
        gastoComida = scan.nextDouble();

        System.out.print("Ingrese el gasto en transporte: ");
        gastoTransporte = scan.nextDouble();

        System.out.print("Ingrese otros gastos: ");
        gastoOtros = scan.nextDouble();

        scan.close();

        double totalGastos = gastoAlquiler + gastoComida + gastoTransporte + gastoOtros;

        if (totalGastos <= presupuestoMensual) {
            System.out.printf("¡Estás dentro del presupuesto! Total de gastos: %.2f\n", totalGastos);
        } else {
            System.out.printf("¡Exceso de presupuesto! Total de gastos: %.2f\n", totalGastos);
        }
    }
}
