package LogicaPrgmcn;

public class SerieNumerica {
    public static void main(String[] args) {
        System.out.println("1era Serie Númerica. Suma de 1 en 1");
        for (int i = 1; i <= 8; i++) {
            System.out.print("[" + i + "]");

            if (i < 8) {
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println("\n2da Serie Númerica. Suma de 2 en 2");
        for (int i = 1; i < 16; i = i + 2) {
            System.out.print("[" + i + "]");

            if (i < 15) {
                System.out.print(", ");
            }
        }

        System.out.println();

        System.out.println("\n3era Serie Númerica. Secuencia de Fibonacci");
        int n = 8; // ? Número de terminos de la secuencia a mostrar

        int primero = 0;
        int segundo = 1;


        for (int i = 0; i <= n; i++) {

            System.out.print("[" + primero + "]");

            int siguiente = primero + segundo;

            primero = segundo;

            segundo = siguiente;

            if (i <= n - 1) {
                System.out.print(", ");
            }
        }
    }

}
