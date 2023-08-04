package LogicaPrgmcn;

public class SerieNumerica {
    public static void main(String[] args) {
        // * Primera serie numérica: Suma de 1 en 1
        System.out.println("1era Serie Númerica. Suma de 1 en 1");
        for (int i = 1; i <= 8; i++) {
            System.out.print("[" + i + "]");
            
            // ? Agregar una coma y espacio si no es el último número en la serie
            if (i < 8) {
                System.out.print(", ");
            }
        }
        System.out.println();
        
        // * Segunda serie numérica: Suma de 2 en 2
        System.out.println("\n2da Serie Númerica. Suma de 2 en 2");
        for (int i = 1; i < 16; i = i + 2) {
            System.out.print("[" + i + "]");
            
            // ? Agregar una coma y espacio si no es el último número en la serie
            if (i < 15) {
                System.out.print(", ");
            }
        }
        
        System.out.println();
        
        // * Tercera serie numérica: Secuencia de Fibonacci
        System.out.println("\n3era Serie Númerica. Secuencia de Fibonacci");
        int n = 8; // ? Número de términos de la secuencia a mostrar

        int primero = 0; // ? Primera variable, según la secuencia generalmente es 0 
        int segundo = 1; // ? Segunda variable, según la secuencia generalmente es 1 

        for (int i = 0; i <= n; i++) {

            System.out.print("[" + primero + "]"); // ? Se imprimirás el primer valor

            int siguiente = primero + segundo; // ? El siguiente valor será la suma de su sucesor y antecesor

            primero = segundo; // ? Vamos avanzando con la suma, igualando el segundo número
 
            segundo = siguiente; // ? Y el segundo lo igualamos con la suma del sucesor y antecesor

            // ? Agregar una coma y espacio si no es el último número en la serie
            if (i <= n - 1) {
                System.out.print(", ");
            }
        }
    }
}
