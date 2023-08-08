// * 1. EI programa no deberá de finalizar hasta que el usuario indique que desea terminar la ejecución del programa.
// * 2. EI programa deberá calcular el área de un rectángulo y de un Itriángulo a través de métodos.
package LogicaPrgmcn;

import java.util.Scanner;

public class OperadoresLogicos {
    // * Declaramos globalmente la clase Scanner
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        OperadoresLogicos OprdLgcs = new OperadoresLogicos();

        char condi = 'S';
        do {
            // * Llámamos el método para verificar la entrada para continuar ejecutando el
            condi = OprdLgcs.VerficarBucle();

        } while (condi == 'S');

        System.out.println("- -  - - FIN DEL PROGRAMA - - - -");

        // * Cerramos el Scanner al Finalizar DoWhile
        OprdLgcs.sc.close();
    }

    public char VerficarBucle() {
        // * Definimos las Variables
        char Condicional = 'S', Verificar;

        // * Para manejar las posibles excepciones
        try {
            // * Consultamos si se seguirá ejecutando el algoritmo
            System.out.println("Continuar? - [S]Si - [N]No");
            Verificar = sc.next().toUpperCase().charAt(0);

            // * Verificamos que el carácter sea correcto
            if (Verificar == 'S' || Verificar == 'N') {
                // ? En caso de que sea correcto pasará la prueba de verificación
                Condicional = Verificar; // ? Igualamos el valor VERIFICADO a la CONDICIONAL
            } else {
                // ? En caso de que el usuario no ingrese [S]Si - [N]No
                System.out.println("\nERROR. Ingresaste una OPCIÓN INVÁLIDA.\n"); // ? Imprimir mensaje de error
            }
        } catch (Exception e) {
            System.out.println("\nOcurrió un error. [" + e.getMessage() + "]\n");
        }

        return Condicional;
    }

    // public double ClclrAreaRectangulo() {}

    // public double ClclrAreaTriangulo() {}

}
