import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese una cadena de texto: ");
        String texto = scan.nextLine();

        scan.close();

        int contadorVocales = 0;


        texto = texto.toLowerCase();


        for (int i = 0; i < texto.length(); i++) {

            char caracter = texto.charAt(i);


            if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u') {

                contadorVocales++;
            }
        }
        System.out.println("Número de vocales en la cadena de texto: " + contadorVocales);

    }
}
