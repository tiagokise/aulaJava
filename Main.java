public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto(1, "Notebook", 2500.00);
        produto1.exibirInformacoes();

        Usuario usuario1 = new Usuario(101, "joaodasilva", "joao.silva@example.com");
        usuario1.exibirInformacoes();

        // Modificando um atributo
        produto1.setPreco(2300.00);
        System.out.println("Preço do Notebook após atualização: R$" + String.format("%.2f", produto1.getPreco()));
    }
}
