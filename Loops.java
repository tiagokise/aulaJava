public class Loops {
    public static void main(String[] args) {
        System.out.println("Loop For:");
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        System.out.println();
        System.out.println("Loop While:");
        int contador = 0;
        while (contador < 3) {
            System.out.println("While: " + contador);
            contador++;
        }

        System.out.println();
        System.out.println("Loop Do-While:");
        int outroContador = 0;
        do {
            System.out.println("Do-While: " + outroContador);
            outroContador++;
        } while (outroContador < 2);
    }
}
