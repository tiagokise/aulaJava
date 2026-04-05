public class Produto {
    private int id;
    private String nome;
    private double preco;

    // Construtor
    public Produto(int id, String nome, double preco) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    // Método para exibir informações do produto (útil para testes)
    public void exibirInformacoes() {
        System.out.println("ID: " + id + ", Nome: " + nome + ", Preço: R$" + String.format("%.2f", preco));
    }
}
