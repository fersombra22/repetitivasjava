import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args) {
        String cadenaPrincipal;
        String subcadena;
        int longitudCadena,longitudSubcadena;
        boolean encontrado;

        Scanner scan = new Scanner(System.in);

        System.out.print("Ingrese la cadena de texto principal: ");
        cadenaPrincipal = scan.nextLine();

        System.out.print("Ingrese la subcadena a buscar: ");
        subcadena = scan.nextLine();

        scan.close();

        longitudCadena = cadenaPrincipal.length();
        longitudSubcadena = subcadena.length();

        encontrado = false;
        if (longitudSubcadena > longitudCadena) {
            System.out.println("La subcadena es más larga que la cadena principal.");
            return;
        }

        for (int i = 0; i <= longitudCadena - longitudSubcadena; i++) {

            String parte = cadenaPrincipal.substring(i, i + longitudSubcadena);

            if (parte.equals(subcadena)) {
                System.out.println("La subcadena se encuentra en la posición: " + i);
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("La subcadena no se encuentra en la cadena principal.");
        }


    }
}
