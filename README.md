# una-algprog-rf-lista01

Projeto acadêmico desenvolvido em Java para consolidar conceitos iniciais de lógica de programação, estruturas condicionais, estruturas de repetição, validação de entrada e organização de código em métodos.

O programa executa em terminal e apresenta um menu principal com 10 exercícios independentes. Cada opção direciona para uma rotina específica, com entrada de dados via `Scanner` e retorno imediato do resultado no console.

## Objetivo

Centralizar em uma única aplicação os exercícios propostos na disciplina, mantendo uma navegação simples por menu e uma estrutura de código organizada para facilitar leitura, manutenção e evolução do projeto.

## Estrutura da aplicação

O ponto de entrada está no arquivo [Exercicios.java](/home/lucascota/IdeaProjects/una-algprog-rf-lista01/Exercicios.java).

A aplicação foi estruturada da seguinte forma:

- `main`: controla o ciclo principal do sistema e o menu de seleção.
- `exibirMenuPrincipal`: apresenta as opções disponíveis ao usuário.
- `exercicio1` até `exercicio10`: encapsulam a lógica de cada exercício.
- `lerInteiro` e `lerDouble`: centralizam a leitura e validação básica de entradas numéricas.

Essa abordagem reduz repetição de código e separa melhor responsabilidades, o que torna o projeto mais legível mesmo sendo uma aplicação introdutória.

## Requisitos

- Java JDK 8 ou superior
- Terminal ou prompt de comando

## Compilação e execução

Para compilar:

```bash
javac Exercicios.java
```

Para executar:

```bash
java Exercicios
```

## Fluxo de uso

Ao iniciar, o sistema exibe o menu principal:

- `0`: encerra o programa
- `1` a `10`: executam o exercício correspondente

Após a conclusão de um exercício, o fluxo retorna ao menu principal, permitindo novas execuções até que a opção `0` seja selecionada.

## Exercícios implementados

### 1. Par ou ímpar

Lê um número inteiro e informa se o valor é par ou ímpar.

### 2. Maior de dois

Lê dois números inteiros e informa qual deles é o maior. Caso os valores sejam iguais, o programa exibe `Iguais`.

### 3. Calculadora com menu

Exibe um menu de operações matemáticas:

- somar
- subtrair
- multiplicar
- dividir

Após a escolha da operação, o sistema lê dois números e apresenta o resultado. A divisão por zero é tratada explicitamente.

### 4. Validação de entrada

Solicita uma nota entre `0` e `100`. Enquanto o valor informado estiver fora desse intervalo, o sistema solicita uma nova entrada.

### 5. Sentinela com parada no zero

Lê números inteiros até que o usuário digite `0`. O valor `0` é utilizado apenas como sentinela de parada e não entra no cálculo. Ao final, são exibidos o maior e o menor número informados.

### 6. Simulador de caixa

Inicializa o sistema com saldo de `R$ 1000,00` e disponibiliza as operações:

- depositar
- sacar
- ver saldo
- sair

As regras de negócio aplicadas são:

- depósito deve ser maior que zero
- saque deve ser maior que zero
- saque não pode ultrapassar o saldo disponível

Ao encerrar, o sistema exibe o saldo final.

### 7. Desconto por categoria

Lê o valor da compra e a categoria do cliente:

- `1`: comum
- `2`: premium
- `3`: funcionário

Com base na categoria, aplica o desconto correspondente e exibe o valor do desconto e o valor final da compra. Categorias fora do intervalo esperado são tratadas como inválidas.

### 8. Contagem de valores

Lê 10 números inteiros e contabiliza quantos são:

- positivos
- negativos
- zeros

### 9. Soma de 1 até N

Lê um valor inteiro `N` e calcula a soma de todos os números de `1` até `N` utilizando estrutura de repetição.

### 10. Contagem regressiva e soma

Lê um número inteiro `N`, com validação para garantir que seja maior que zero. Em seguida, imprime a contagem regressiva de `N` até `1` e calcula a soma total desses valores.

## Tratamento de entrada

O projeto possui métodos auxiliares para leitura de números inteiros e decimais. Quando o usuário informa um valor incompatível com o tipo esperado, o sistema exibe uma mensagem de erro e solicita nova entrada.

Esse comportamento melhora a robustez da aplicação e evita interrupções causadas por entradas inválidas no terminal.

## Considerações técnicas

- O projeto foi desenvolvido em um único arquivo para manter aderência ao escopo acadêmico inicial.
- A separação por métodos foi mantida para melhorar a organização do código.
- O uso de laços e condicionais foi priorizado para reforçar fundamentos de programação.
- O `Scanner` é encerrado ao final da execução da aplicação.

## Licença

Este projeto está sob a licença definida no arquivo `LICENSE`.
