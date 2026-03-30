# Explicação das Aulas de Java

Este documento serve como um guia para os conceitos de Java abordados nos arquivos deste projeto. Cada seção corresponde a um arquivo `.java` e explica o que ele demonstra.

## 1. `HelloWorld.java`

Este é o ponto de partida clássico para qualquer linguagem de programação.

-   **`public class HelloWorld`**: Declara uma classe chamada `HelloWorld`. Em Java, todo código deve pertencer a uma classe.
-   **`public static void main(String[] args)`**: Este é o método principal. É o ponto de entrada do programa. Quando você executa este arquivo, o código dentro deste método é o primeiro a ser executado.
-   **`System.out.println("Olá, Mundo!");`**: Imprime o texto "Olá, Mundo!" no console.

## 2. `Variaveis.java`

Este arquivo demonstra como declarar e usar variáveis em Java.

-   **`String nome = "João";`**: Declara uma variável do tipo `String` (texto) chamada `nome` e atribui a ela o valor "João".
-   **`int idade = 25;`**: Declara uma variável do tipo `int` (número inteiro) chamada `idade`.
-   **`double altura = 1.80;`**: Declara uma variável do tipo `double` (número com casas decimais).
-   **`boolean estudante = true;`**: Declara uma variável do tipo `boolean` (verdadeiro ou falso).

## 3. `Condicionais.java`

Aqui vemos como controlar o fluxo do programa com base em condições.

-   **`if (idade >= 18)`**: Verifica se o valor da variável `idade` é maior ou igual a 18. Se for verdadeiro, o bloco de código seguinte é executado.
-   **`else if (idade >= 13)`**: Se a primeira condição (`if`) for falsa, esta segunda condição é verificada.
-   **`else`**: Se nenhuma das condições anteriores for verdadeira, o bloco de código do `else` é executado.
-   **`clima.equals("sol")`**: Compara se o valor da string `clima` é igual a "sol". Para comparar strings em Java, usamos o método `.equals()`.

## 4. `Loops.java`

Loops são usados para executar um bloco de código repetidamente.

-   **`for (int i = 0; i < 5; i++)`**: Um loop `for` que executa 5 vezes. A variável `i` começa em 0 e aumenta em 1 a cada repetição, até ser menor que 5.
-   **`while (contador < 3)`**: Um loop `while` que continua executando enquanto a condição (`contador < 3`) for verdadeira.
-   **`do { ... } while (outroContador < 2)`**: Um loop `do-while` que é semelhante ao `while`, mas garante que o bloco de código seja executado pelo menos uma vez, pois a condição é verificada no final.

## 5. `ArraysJava.java`

Arrays são usados para armazenar múltiplos valores em uma única variável.

-   **`int[] idades = new int[3];`**: Declara e cria um array de inteiros chamado `idades` que pode armazenar 3 elementos.
-   **`idades[0] = 25;`**: Atribui o valor 25 à primeira posição (índice 0) do array.
-   **`String[] nomes = {"Alice", "Bob", "Charlie"};`**: Uma forma mais curta de declarar e inicializar um array.
-   **`for (String nome : nomes)`**: Este é um loop "for-each", uma forma simplificada de percorrer todos os elementos de um array sem precisar de um contador.

## 6. `Metodos.java`

Métodos são blocos de código que realizam uma tarefa específica e podem ser chamados (executados) de outras partes do programa.

-   **`public static String saudacao(String nome)`**: Declara um método chamado `saudacao` que recebe um `String` como parâmetro e retorna um `String`.
-   **`public static void imprimirSoma(int a, int b)`**: Declara um método que não retorna nenhum valor (`void`), mas recebe dois inteiros como parâmetros e imprime a soma deles.

## 7. `Carro.java` e `Garagem.java` (Programação Orientada a Objetos)

Estes dois arquivos trabalham juntos para demonstrar os conceitos básicos da Programação Orientada a Objetos (POO).

### `Carro.java`

Este arquivo é uma **classe**, que serve como um "molde" ou "planta" para criar objetos.

-   **Atributos (`cor`, `modelo`, `ano`)**: São as características que todo objeto `Carro` terá.
-   **Construtor (`public Carro(...)`)**: É um método especial usado para criar um novo objeto (`instância`) da classe. Ele define os valores iniciais dos atributos.
-   **Métodos (`ligar`, `desligar`, `exibirInfo`)**: São as ações ou comportamentos que um objeto `Carro` pode realizar.

### `Garagem.java`

Este arquivo usa a classe `Carro` para criar objetos reais.

-   **`Carro meuFusca = new Carro("Azul", "Fusca", 1970);`**: Cria um **objeto** (uma instância) da classe `Carro`. `meuFusca` é agora um objeto específico com seus próprios valores de cor, modelo e ano.
-   **`meuFusca.exibirInfo();`**: Chama o método `exibirInfo` *especificamente para o objeto `meuFusca`*.
-   **`Carro meuTesla = new Carro(...)`**: Cria um segundo objeto, independente do primeiro, com suas próprias características.
