import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int numero = scan.nextInt();

        scan.close();

        int numeroAbsoluto = Math.abs(numero);

        int contadorDigitos = 0;

        if (numeroAbsoluto == 0) {
            contadorDigitos = 1;
        } else {

            while (numeroAbsoluto > 0) {

                numeroAbsoluto /= 10;

                contadorDigitos++;
            }
        }

        System.out.println("El número de dígitos es: " + contadorDigitos);
    }
}
