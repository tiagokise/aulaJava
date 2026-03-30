# Visão Geral do Projeto

Este diretório contém uma coleção de arquivos Java simples, criados provavelmente para aprender os fundamentos da linguagem de programação Java. Os arquivos cobrem conceitos básicos como "Hello World", variáveis, classes e objetos.

Cada arquivo `.java` é um exemplo independente que pode ser compilado e executado individualmente.

# Compilação e Execução

Este projeto não utiliza uma ferramenta de build como Maven ou Gradle. Você pode compilar e executar os arquivos diretamente usando o Java Development Kit (JDK).

### Compilando um Arquivo

Para compilar um arquivo Java, use o comando `javac`. Isso criará um arquivo `.class`.

```sh
javac NomeDoArquivo.java
```

Por exemplo, para compilar `HelloWorld.java`:

```sh
javac HelloWorld.java
```

### Executando um Arquivo

Para executar o código compilado, use o comando `java` com o nome da classe (sem a extensão `.class`).

```sh
java NomeDaClasse
```

Por exemplo, para executar a classe `HelloWorld`:

```sh
java HelloWorld
```

Alguns arquivos, como `Carro.java`, definem uma classe mas não possuem um método `main`. Esses arquivos são feitos para serem utilizados por outras classes (como `Garagem.java`) e não podem ser executados diretamente.

# Testes

Este projeto não possui testes formais ou uma estrutura de testes, pois é uma coleção de exemplos educacionais focados em conceitos básicos de Java.

# Dependências

O projeto não possui dependências de bibliotecas externas.