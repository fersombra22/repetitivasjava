
public class ejercicio3 {
    public static void main(String[] args) {


        int cantidadTerminos = 10;
        int a = 0;
        int b = 1;

        System.out.println("Los primeros " + cantidadTerminos + " números de la serie de Fibonacci son:");

        System.out.print(a + " ");

        System.out.print(b + " ");
        for (int i = 2; i < cantidadTerminos; i++) {
            int siguiente = a + b;
            System.out.print(siguiente + " ");
            // Actualizar los valores de a y b
            a = b;
            b = siguiente;
        }
        System.out.println();
    }
}
