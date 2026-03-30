public class Garagem {
    public static void main(String[] args) {
        // Criando o primeiro objeto (instância) da classe Carro
        Carro meuFusca = new Carro("Azul", "Fusca", 1970);

        // Criando um segundo objeto
        Carro meuTesla = new Carro("Vermelho", "Tesla Model S", 2023);

        System.out.println("--- Carro 1 ---");
        meuFusca.exibirInfo();
        meuFusca.ligar();
        meuFusca.desligar();

        System.out.println(); // Correção: Nova linha separada
        System.out.println("--- Carro 2 ---");
        meuTesla.exibirInfo();
        meuTesla.ligar();

        System.out.println(); // Correção: Nova linha separada
        System.out.println("A cor do Fusca é: " + meuFusca.cor);
    }
}
