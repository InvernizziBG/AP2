# Projeto de Gerenciamento de Veículos

Este é um sistema simples de gerenciamento de veículos que utiliza os conceitos de orientação a objetos em Java, com ênfase em herança, métodos de acesso e classes abstratas.

## Estrutura das Classes

- `Veiculo` (classe abstrata): Classe base para veículos, com atributos `marca`, `modelo` e `ano`.
- `Carro`: Subclasse de `Veiculo` com o atributo adicional `numeroPortas`.
- `Moto`: Subclasse de `Veiculo` com o atributo adicional `cilindrada`.

## Funcionalidades

Cada classe filha implementa o método `informacoesVeiculo()`, que retorna uma descrição completa do veículo.

## Execução

Para executar o sistema, compile todas as classes e execute a classe `Main`.

```bash
javac *.java
java Main
