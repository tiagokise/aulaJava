public class Carro {
    // 1. Atributos (campos ou variáveis de instância)
    String cor;
    String modelo;
    int ano;

    // 2. Construtor: um método especial para criar objetos desta classe
    public Carro(String cor, String modelo, int ano) {
        // 'this' se refere ao objeto atual que está sendo criado
        this.cor = cor;
        this.modelo = modelo;
        this.ano = ano;
    }

    // 3. Métodos (comportamentos)
    public void ligar() {
        System.out.println(this.modelo + " está ligando...");
    }

    public void desligar() {
        System.out.println(this.modelo + " está desligando.");
    }

    public void exibirInfo() {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Ano: " + this.ano);
    }
}
