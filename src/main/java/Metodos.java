public class Metodos {

    public static void main(String[] args) {
        // Chamando um método que retorna um valor
        String mensagem = saudacao("Alice");
        System.out.println(mensagem); // Saída: Olá, Alice!

        // Chamando um método que não retorna valor (void)
        imprimirSoma(5, 3); // Saída: A soma é: 8
    }

    // Método que retorna uma String e recebe um parâmetro String
    public static String saudacao(String nome) {
        return "Olá, " + nome + "!";
    }

    // Método que não retorna nada (void) e recebe dois parâmetros int
    public static void imprimirSoma(int a, int b) {
        int soma = a + b;
        System.out.println("A soma é: " + soma);
    }
}
