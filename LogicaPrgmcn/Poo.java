// * Calcular el área de un terreno RECTANGULAR y determinar el costo de venta según su ÁREA * el costo del M2
// ? BASE = 15m & ALTURA = 35m
// ? Metro cuadrado = $2500
// ? FORMULA: Área = Base x Altura
// ? Precio = Área x MetroCuadrado

package LogicaPrgmcn;

import java.util.Scanner;

public class Poo {
    public static void main(String[] args) {
        // * Instanciamos la clase Poo
        Poo poo = new Poo();

        // * Variables
        double m2, base, altura;

        // ? Instanciamos la clase Scanner para la entrada de datos
        Scanner sc = new Scanner(System.in);

        // * Pedimos los datos al usuario
        System.out.println("\t --- Calcular el costo de un terreno en $ --- ");

        System.out.print("Indique el precio del metro cuadrado : $");
        m2 = sc.nextDouble();

        System.out.print("Indique la BASE del terreno en metros(m) : ");
        base = sc.nextDouble();

        System.out.print("Indique la ALTURA del terreno en metros(m) : ");
        altura = sc.nextDouble();

        System.out.println("\t - -  - - - RESULTADO FINAL - - - - - ");

        // * Llamamos a los métodos
        // ? Llamamos a calcularArea para obtener el área y luego pasamos el área obtenida a calcularPrecio
        poo.calcularPrecio(m2, poo.calcularArea(base, altura));

        // ? Cerramos el Scanner para liberar recursos
        sc.close();
    }

    // Método para calcular el área del terreno
    public double calcularArea(double base, double altura) {
        double area = base * altura;

        System.out.println("El área del terreno es de -> " + area + "m2");

        return area;
    }

    // * Método para calcular el costo total del terreno
    public double calcularPrecio(double m2, double area) {
        double precio = m2 * area;
        System.out.println("El costo TOTAL del terreno es de : $" + precio);
        return precio;
    }
}
