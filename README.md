# Desafio DIO: Programação Orientada a Objetos (POO) em Java no Contexto Bancário

![badge-placeholder](https://img.shields.io/badge/Java-v1.8+-green) ![badge-placeholder](https://img.shields.io/badge/Maven-v3.6.3-blue)

## Visão Geral do Projeto
Este projeto tem como objetivo implementar um sistema bancário utilizando os princípios de Programação Orientada a Objetos (POO) em Java. Através desse desafio, os participantes aprenderão a aplicar conceitos de POO em um contexto prático.

## Objetivos
- Aplicar os conceitos de POO em Java.
- Desenvolver um sistema funcional que simula operações bancárias básicas.

## Pilares da POO Utilizados
1. **Abstração**: Implementação de classes abstratas para representar entidades.
2. **Encapsulamento**: Controle de acesso a atributos e métodos das classes.
3. **Herança**: Criação de subclasses para especializar comportamentos.
4. **Polimorfismo**: Implementação de métodos que podem ter diferentes comportamentos em subclasses.

## Funcionalidades
- **Criar Conta**: Permite que o usuário crie uma nova conta bancária.
- **Depósito**: Possibilita adicionar valor à conta.
- **Saque**: Permite que o usuário retire valor da conta, desde que tenha saldo suficiente.
- **Transferência**: Funcionalidade para transferir valores entre contas.
- **Extrato**: Gera um relatório com o histórico de transações de uma conta.

## Diagrama de Classes
```
+-----------------+
|    Conta        |
+-----------------+
| - saldo: double |
+-----------------+
| + depositar()   |
| + sacar()       |
| + transferir()  |
+-----------------+

+-----------------+
|   ContaCorrente |
+-----------------+
| - limite: double|
+-----------------+
| + sacar()       |
+-----------------+
