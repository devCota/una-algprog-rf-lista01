# 🚀 Lista de Exercícios em Java — Algoritmos e Programação

![Status](https://img.shields.io/badge/status-concluído-green)
![Plataforma](https://img.shields.io/badge/platform-Windows%20%7C%20Linux-blue)
![Tecnologia](https://img.shields.io/badge/Java-console%20app-orange)
![Nível](https://img.shields.io/badge/level-iniciante-yellow)

---

## 📖 Sobre o Projeto

Este repositório apresenta a implementação de uma lista de exercícios da disciplina **Algoritmos e Programação**, com foco no desenvolvimento dos fundamentos da lógica de programação utilizando **Java**.

A aplicação foi desenvolvida como um **programa único executado via terminal**, contendo um menu interativo que permite ao usuário acessar **10 exercícios independentes**.

O projeto prioriza organização, reutilização de código e clareza, mesmo sendo uma aplicação introdutória.

---

## 🎯 Objetivos da Atividade

- Consolidar conceitos básicos de lógica de programação
- Trabalhar com estruturas condicionais e de repetição
- Validar entradas de usuário
- Organizar código em métodos
- Desenvolver aplicações simples em console
- Praticar boas práticas desde o início da formação

---

## ⚙️ Estrutura da Aplicação

O ponto de entrada da aplicação está no arquivo:

📄 `Exercicios.java`

A organização interna foi definida da seguinte forma:

- `main` → controla o fluxo principal e o menu
- `exibirMenuPrincipal` → exibe as opções disponíveis
- `exercicio1` até `exercicio10` → lógica isolada de cada exercício
- `lerInteiro` e `lerDouble` → leitura e validação de entradas

Essa estrutura reduz duplicação de código e melhora a legibilidade.

---

## ▶️ Fluxo de Execução

Ao iniciar o programa:

- `0` → encerra a aplicação
- `1` a `10` → executam os exercícios correspondentes

Após cada execução, o sistema retorna automaticamente ao menu principal.

---

## 💻 Exercícios Desenvolvidos

### 1. Par ou Ímpar
Lê um número inteiro e informa se ele é par ou ímpar.

### 2. Maior de Dois
Compara dois números e informa o maior ou se são iguais.

### 3. Calculadora com Menu
Permite escolher entre:
- soma
- subtração
- multiplicação
- divisão (com tratamento para divisão por zero)

### 4. Validação de Entrada
Solicita uma nota entre `0` e `100`, repetindo até ser válida.

### 5. Sentinela com Parada no Zero
Lê números até `0` e exibe:
- maior valor
- menor valor

### 6. Simulador de Caixa
Operações disponíveis:
- depósito
- saque
- consulta de saldo

Regras:
- valores positivos obrigatórios
- saque limitado ao saldo

### 7. Desconto por Categoria
Aplica desconto baseado no tipo de cliente:
- comum
- premium
- funcionário

### 8. Contagem de Valores
Lê 10 números e contabiliza:
- positivos
- negativos
- zeros

### 9. Soma de 1 até N
Calcula a soma de todos os números de `1` até `N`.

### 10. Contagem Regressiva e Soma
Exibe contagem regressiva de `N` até `1` e soma os valores.

---

## 🛠️ Requisitos

- Java JDK 8 ou superior
- Terminal / Prompt de comando

---

## ▶️ Como Compilar e Executar

### Compilar

```bash
javac Exercicios.java
```

### Executar

```bash
java Exercicios
```

---

## ✅ Conceitos Utilizados

- estruturas condicionais (`if`, `else`)
- estruturas de repetição (`while`, `for`)
- validação de entrada
- uso de `Scanner`
- métodos e organização de código
- operações matemáticas
- controle de fluxo por menu

---

## 💡 Boas Práticas Aplicadas

- separação de responsabilidades em métodos
- reutilização de código para entrada de dados
- validação de entradas do usuário
- código legível e organizado
- tratamento de erros básicos (ex: divisão por zero)

---

## 🚀 Aplicação Acadêmica

Este projeto fortalece habilidades essenciais para evolução na área de desenvolvimento:

- raciocínio lógico
- modelagem de problemas
- estruturação de soluções
- organização de código

Servindo como base para temas mais avançados como:

- orientação a objetos
- estruturas de dados
- desenvolvimento de APIs
- sistemas backend

---

## 🧩 Conclusão

A aplicação reúne múltiplos exercícios em um único sistema, mantendo uma estrutura organizada, simples e funcional.

Mesmo sendo um projeto introdutório, já demonstra preocupação com **boas práticas, reutilização e legibilidade**, fundamentais para evolução como desenvolvedor.

---

## 👨‍💻 Autor

Lucas Cota  
Estudante de Análise e Desenvolvimento de Sistemas  
Foco em Backend e Engenharia de Software
