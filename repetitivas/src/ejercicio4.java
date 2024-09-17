import java.util.Scanner;
public class ejercicio4 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Ingrese una palabra: ");
        String palabra = scan.nextLine();

        scan.close();

        String palabraReversa = new StringBuilder(palabra).reverse().toString();


        if (palabra.equals(palabraReversa)) {
            System.out.println("La palabra es un palíndromo.");
        } else {
            System.out.println("La palabra no es un palíndromo.");
        }
    }
}
