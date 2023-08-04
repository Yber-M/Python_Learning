package LogicaPrgmcn;

import java.util.Scanner;

public class bucle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        int veces, cont = 1;

        System.out.println("¿Cuál es tu nombre?");
        name = sc.nextLine();

        System.out.println("¿Cuántas veces quieres que se repita tu nombre en pantalla?");
        veces = sc.nextInt();

        while (cont <= veces) {
            System.out.print("N° " + cont + " - ");
            System.out.println(name);
            cont++;
        }

        sc.close();

    }
}
