package LogicaPrgmcn;

// ? Importamos la clase Scanner para leer la entrada del usuario desde la consola
import java.util.Scanner;

public class bucle {
    public static void main(String[] args) {
        // * Crear un objeto Scanner para leer la entrada del usuario
        Scanner sc = new Scanner(System.in);

        // * Declarar variables para almacenar el nombre, cantidad de repeticiones
        String name; // ? Variable para almacenar el nombre
        int veces; // ? Variable para que el usuario indique el n° de veces que quiere que se repita su nombre
        int cont = 1; // ? Variable contador para poder finalizar el bucle

        // * Solicitar al usuario que ingrese su nombre
        System.out.println("¿Cuál es tu nombre?");
        name = sc.nextLine();

        // * Solicitar al usuario que ingrese la cantidad de repeticiones
        System.out.println("¿Cuántas veces quieres que se repita tu nombre en pantalla?");
        veces = sc.nextInt();

        // * Usar un bucle while para imprimir el nombre la cantidad de veces
        // especificada
        while (cont <= veces) {
            System.out.print("N° " + cont + " - "); // ? Mostrar el número de repetición
            System.out.println(name); // ? Mostrar el nombre
            cont++; // ? Incrementar el contador
        }

        // ? Cerrar el objeto Scanner para liberar los recursos
        sc.close();
    }
}
