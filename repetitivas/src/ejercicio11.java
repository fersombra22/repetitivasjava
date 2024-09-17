import java.util.Scanner;

public class ejercicio11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final int CALORIAS_MINIMAS = 2000;
        final int CALORIAS_MAXIMAS = 2500;

        double caloriasConsumidas;

        System.out.print("Ingrese la cantidad de calorías consumidas en un día: ");
        caloriasConsumidas = scan.nextDouble();

        scan.close();

        if (caloriasConsumidas < CALORIAS_MINIMAS) {
            System.out.printf("Tu ingesta de calorías es baja. Has consumido %.2f calorías, que está por debajo del rango saludable.\n", caloriasConsumidas);
            System.out.printf("El rango saludable es entre %d y %d calorías por día.\n", CALORIAS_MINIMAS, CALORIAS_MAXIMAS);
        } else if (caloriasConsumidas > CALORIAS_MAXIMAS) {
            System.out.printf("Tu ingesta de calorías es alta. Has consumido %.2f calorías, que está por encima del rango saludable.\n", caloriasConsumidas);
            System.out.printf("El rango saludable es entre %d y %d calorías por día.\n", CALORIAS_MINIMAS, CALORIAS_MAXIMAS);
        } else {
            System.out.printf("Tu ingesta de calorías está dentro del rango saludable. Has consumido %.2f calorías.\n", caloriasConsumidas);
            System.out.printf("El rango saludable es entre %d y %d calorías por día.\n", CALORIAS_MINIMAS, CALORIAS_MAXIMAS);
        }

    }
}
