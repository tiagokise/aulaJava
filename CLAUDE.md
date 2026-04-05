# CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

## Project Overview

Educational Java repository covering fundamentals (variables, conditionals, loops, arrays, methods) and introductory OOP (classes, objects, encapsulation with getters/setters). Written in Brazilian Portuguese.

## Build & Run

No build tool (Maven/Gradle). Compile and run directly with JDK:

```sh
javac FileName.java
java ClassName
```

Some files depend on others and must be compiled together:
- `Garagem.java` uses `Carro.java`: `javac Carro.java Garagem.java && java Garagem`
- `Main.java` uses `Produto.java` and `Usuario.java`: `javac Produto.java Usuario.java Main.java && java Main`

Standalone files (have their own `main`): `HelloWorld`, `Variaveis`, `Condicionais`, `Loops`, `Metodos`, `ArraysJava`, `Garagem`, `Main`, `ServidorWeb`.

Classes without `main` (used by others): `Carro`, `Produto`, `Usuario`.

## Architecture

All `.java` files are in the root directory with no packages. Two groups demonstrate OOP:

1. **Carro/Garagem** — basic OOP: public fields, constructor, instance methods
2. **Produto/Usuario/Main** — encapsulation: private fields, getters/setters
