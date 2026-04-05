public class ArraysJava {

    public static void main(String[] args) {
        // 1. Declarar e alocar com tamanho fixo
        int[] idades = new int[3]; // Array para 3 inteiros

        // Atribuir valores (índice 0, 1, 2)
        idades[0] = 25;
        idades[1] = 30;
        idades[2] = 22;

        System.out.println("Idades:");
        for (int i = 0; i < idades.length; i++) {
            System.out.println("Idade no índice " + i + ": " + idades[i]);
        }

        // Nova linha para espaçamento
        System.out.println();
        System.out.println("Nomes (usando for-each):");
        String[] nomes = {"Alice", "Bob", "Charlie"};

        for (String nome : nomes) {
            System.out.println(nome);
        }

        // Nova linha para espaçamento
        System.out.println();
        System.out.println("Primeiro nome: " + nomes[0]);

        // Tentando acessar um índice fora dos limites (isso causaria um erro em tempo de execução!)
        // System.out.println(idades[3]); // Descomente para ver o erro: ArrayIndexOutOfBoundsException
    }
}
