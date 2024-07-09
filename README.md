# Aplicação de Compras em Java 🛒

## Descrição

Este projeto é uma aplicação Java que simula um sistema de compras com cartão de crédito. O usuário pode definir um limite para o cartão e realizar compras, visualizando o saldo restante e a lista de compras ordenada por valor. O seguinte desafio foi proposto pelo meu curso de `Java: Trabalhando com listas e coleções de dados`, realizado na plataforma [Alura](https://cursos.alura.com.br/course/java-listas-colecoes-dados). Este projeto tem como objetivo demonstrar a aplicação prática dos conceitos de listas e coleções de dados aprendidos ao longo da formação.

## Funcionalidades

- **Gerenciamento de compras** 🛍️: O usuário pode adicionar compras, definindo a descrição e o valor de cada item, utilizando a estrutura de dados `List` para armazenar as compras.
- **Controle de saldo** 💳: A aplicação controla o saldo do cartão de crédito, verificando se o valor da compra está dentro do limite disponível, utilizando a classe `Double` para representar valores monetários.
- **Ordenação de compras** 📈: A lista de compras é ordenada por valor utilizando o método `Collections.sort()`, demonstrando o uso de algoritmos de ordenação.

## Conceitos do curso

- **Listas** 📋: Utilização da estrutura de dados `List` para armazenar as compras realizadas.
- **Coleções** 🗂️: Demonstração do uso de coleções para gerenciar dados das compras, utilizando a interface `Collection` e suas implementações.
- **Ordenação** 🔄: Implementação da ordenação da lista de compras com o método `Collections.sort()`.

## Pré-requisitos

- Java Development Kit (JDK) 11 ou superior
- IDE (IntelliJ, VSCode, Eclipse, etc.)

## Instalação

1. Clone este repositório:
    ```sh
    git clone <git@github.com:NatanMendes0/listas-java-desafio-final.git>
    ```
2. Importe o projeto para a sua IDE.

## Como usar

1. Execute a aplicação.
2. Digite o limite do cartão de crédito quando solicitado.
3. Insira a descrição e o valor da compra.
4. A aplicação exibirá uma mensagem de confirmação da compra ou de saldo insuficiente.
5. Continue realizando compras até que o limite seja atingido ou você decida sair.
6. Ao sair, a aplicação exibirá a lista de compras realizadas, ordenada por valor, e o saldo restante.

### Obrigado pela atenção!

