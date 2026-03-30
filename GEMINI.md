# Project Overview

This directory contains a collection of simple Java files, likely created for learning the fundamentals of the Java programming language. The files cover basic concepts such as "Hello World," variables, classes, and objects.

Each `.java` file is a standalone example that can be compiled and run independently.

# Building and Running

This project does not use a build tool like Maven or Gradle. You can compile and run the files directly using the Java Development Kit (JDK).

### Compiling a File

To compile a Java file, use the `javac` command. This will create a `.class` file.

```sh
javac FileName.java
```

For example, to compile `HelloWorld.java`:

```sh
javac HelloWorld.java
```

### Running a File

To run the compiled code, use the `java` command with the class name (without the `.class` extension).

```sh
java ClassName
```

For example, to run the `HelloWorld` class:

```sh
java HelloWorld
```

Some files, like `Carro.java`, define a class but do not have a `main` method. These files are meant to be used by other classes (like `Garagem.java`) and cannot be run directly.

# Development Conventions

There are no formal development conventions, as this appears to be a collection of educational examples. Key characteristics include:

*   **Standalone Files:** Most files are self-contained and demonstrate a specific concept.
*   **Basic Concepts:** The code focuses on introductory Java syntax and object-oriented principles.
*   **No Dependencies:** The project does not rely on any external libraries.
