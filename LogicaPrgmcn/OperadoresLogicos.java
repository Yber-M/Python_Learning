// * 1. EI programa no deberá de finalizar hasta que el usuario indique que desea terminar la ejecución del programa.
// * 2. EI programa deberá calcular el área de un rectángulo y de un Triángulo a través de métodos.
package LogicaPrgmcn;

import java.util.Scanner;

public class OperadoresLogicos {
    // * Declaramos globalmente la clase Scanner
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        OperadoresLogicos OprdLgcs = new OperadoresLogicos();

        char condi = 'S';
        do {
            int herramientas;

            System.out.println("- - - Cálcular el ÁREA - - -");
            System.out.println("Seleccione una opción:\n[1]Área del Rectángulo\n[2]Área del Triangulo\n[3]Finalizar");
            herramientas = sc.nextInt();

            switch (herramientas) {
                case 1:
                    OprdLgcs.ClclrAreaRectangulo();
                    condi = OprdLgcs.VerficarSwitch();
                    break;
                case 2:
                    OprdLgcs.ClclrAreaTriangulo();
                    condi = OprdLgcs.VerficarSwitch();
                    break;
                case 3:
                    // * Llámamos el método para verificar la entrada para continuar ejecutando el
                    condi = OprdLgcs.VerficarBucle();
                    break;
                default:
                    System.out.println("\n - - - - - ERROR - - - - -\nDebe selecionar una opción.\n    VUELVA A INTENTARLO");
                    System.out.println("- - - - - - - - - - -  - -\n");
                    break;
            }

        } while (condi == 'S');

        System.out.println("- - - - FIN DEL PROGRAMA - - - -");

        // * Cerramos el Scanner para liberar recursos
        OperadoresLogicos.sc.close();
    }

    // * Método para verificar el do - while en caso de que no se ingrese una opción correcta
    public char VerficarBucle() {
        // * Definimos las Variables
        char Condicional = 'S', Verificar;

        // * Para manejar las posibles excepciones
        try {
            // * Consultamos si se seguirá ejecutando el algoritmo
            System.out.println("Desea finalizar el programa?\n[S]Cancelar\n[N]Finalizar");
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

    // * Método para verificar el switch (MENSAJE MÁS PERSONALIZADO)
    public char VerficarSwitch() {
        // * Definimos las Variables
        char Condicional = 'S', Verificar;

        // * Para manejar las posibles excepciones
        try {
            // * Consultamos si se seguirá ejecutando el algoritmo
            System.out.println("Desea continuar?\n[S]Continuar\n[N]Finalizar");
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

    // * Método para calcular el área del rectangulo [A = B * A]
    public double ClclrAreaRectangulo() {
        double base, altura, area;

        System.out.print("Base(m): ");
        base = sc.nextDouble();

        System.out.print("Altura(m): ");
        altura = sc.nextDouble();

        // *  Aplicando la formular del RECTÁNGULO
        area = base * altura;

        System.out.println("\n- - - - - - RESULTADO - - - - - -");
        System.out.println("El área del RECTÁNGULO es : " + area + "m²");
        System.out.println("- - - - - - - - - - - - - - - - -");

        
        return area;
    }

    // * Método para calcular el área del triángulo [A = B * A / 2]
    public double ClclrAreaTriangulo() {
        double base, altura, area;

        System.out.print("Base(m): ");
        base = sc.nextDouble();

        System.out.print("Altura(m): ");
        altura = sc.nextDouble();

        // ? Aplicando la formular del TRIANGULO
        area = (base * altura) / 2;

        System.out.println("\n- - - - - - RESULTADO - - - - - -");
        System.out.println("El área del TRIANGULO es : " + area + "m²");
        System.out.println("- - - - - - - - - - - - - - - - -");
        return area;
    }

}
