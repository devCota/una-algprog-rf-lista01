import java.util.Scanner;

public class Exercicios {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao;

        do {
            exibirMenuPrincipal();
            opcao = lerInteiro("Escolha uma opção: ");
            System.out.println();

            switch (opcao) {
                case 0:
                    System.out.println("Encerrando o programa.");
                    break;
                case 1:
                    exercicio1();
                    break;
                case 2:
                    exercicio2();
                    break;
                case 3:
                    exercicio3();
                    break;
                case 4:
                    exercicio4();
                    break;
                case 5:
                    exercicio5();
                    break;
                case 6:
                    exercicio6();
                    break;
                case 7:
                    exercicio7();
                    break;
                case 8:
                    exercicio8();
                    break;
                case 9:
                    exercicio9();
                    break;
                case 10:
                    exercicio10();
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }

            System.out.println();
        } while (opcao != 0);

        SCANNER.close();
    }

    private static void exibirMenuPrincipal() {
        System.out.println("0. Sair");
        System.out.println("1. Exercício 1 - Par ou ímpar");
        System.out.println("2. Exercício 2 - Maior de dois");
        System.out.println("3. Exercício 3 - Calculadora");
        System.out.println("4. Exercício 4 - Validação de nota");
        System.out.println("5. Exercício 5 - Maior e menor");
        System.out.println("6. Exercício 6 - Simulador de caixa");
        System.out.println("7. Exercício 7 - Desconto por categoria");
        System.out.println("8. Exercício 8 - Contagem de valores");
        System.out.println("9. Exercício 9 - Soma de 1 até N");
        System.out.println("10. Exercício 10 - Contagem regressiva");
    }

    private static void exercicio1() {
        exibirCabecalhoExercicio("Exercício 1 - Par ou ímpar");
        int numero = lerInteiro("Digite um número inteiro: ");
        System.out.println(numero % 2 == 0 ? "PAR" : "ÍMPAR");
    }

    private static void exercicio2() {
        exibirCabecalhoExercicio("Exercício 2 - Maior de dois");
        int primeiro = lerInteiro("Digite o primeiro inteiro: ");
        int segundo = lerInteiro("Digite o segundo inteiro: ");

        if (primeiro > segundo) {
            System.out.println("Maior: " + primeiro);
        } else if (segundo > primeiro) {
            System.out.println("Maior: " + segundo);
        } else {
            System.out.println("Iguais");
        }
    }

    private static void exercicio3() {
        exibirCabecalhoExercicio("Exercício 3 - Calculadora com menu");
        System.out.println("1- Somar");
        System.out.println("2- Subtrair");
        System.out.println("3- Multiplicar");
        System.out.println("4- Dividir");

        int operacao = lerInteiro("Escolha a operação: ");
        double primeiro = lerDouble("Digite o primeiro número: ");
        double segundo = lerDouble("Digite o segundo número: ");

        switch (operacao) {
            case 1:
                System.out.printf("Resultado: %.2f%n", primeiro + segundo);
                break;
            case 2:
                System.out.printf("Resultado: %.2f%n", primeiro - segundo);
                break;
            case 3:
                System.out.printf("Resultado: %.2f%n", primeiro * segundo);
                break;
            case 4:
                if (segundo == 0) {
                    System.out.println("Erro: divisão por zero.");
                } else {
                    System.out.printf("Resultado: %.2f%n", primeiro / segundo);
                }
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }
    }

    private static void exercicio4() {
        exibirCabecalhoExercicio("Exercício 4 - Validação de entrada");
        int nota;

        do {
            nota = lerInteiro("Digite uma nota entre 0 e 100: ");
            if (nota < 0 || nota > 100) {
                System.out.println("Nota inválida. Tente novamente.");
            }
        } while (nota < 0 || nota > 100);

        System.out.println("Nota válida: " + nota);
    }

    private static void exercicio5() {
        exibirCabecalhoExercicio("Exercício 5 - Maior e menor com sentinela");
        int maior = 0;
        int menor = 0;
        boolean primeiroNumero = true;

        while (true) {
            int numero = lerInteiro("Digite um número (0 para parar): ");
            if (numero == 0) {
                break;
            }

            if (primeiroNumero) {
                maior = numero;
                menor = numero;
                primeiroNumero = false;
            }

            if (numero > maior) {
                maior = numero;
            }

            if (numero < menor) {
                menor = numero;
            }
        }

        if (primeiroNumero) {
            System.out.println("Nenhum número válido foi digitado.");
        } else {
            System.out.println("Maior: " + maior);
            System.out.println("Menor: " + menor);
        }
    }

    private static void exercicio6() {
        exibirCabecalhoExercicio("Exercício 6 - Simulador de caixa");
        double saldo = 1000.0;
        int opcao;

        do {
            System.out.println("1- Depositar");
            System.out.println("2- Sacar");
            System.out.println("3- Ver saldo");
            System.out.println("4- Sair");

            opcao = lerInteiro("Escolha uma opção: ");

            switch (opcao) {
                case 1:
                    double deposito = lerDouble("Valor do depósito: ");
                    if (deposito > 0) {
                        saldo += deposito;
                        System.out.printf("Depósito realizado. Saldo atual: R$ %.2f%n", saldo);
                    } else {
                        System.out.println("Valor de depósito inválido.");
                    }
                    break;
                case 2:
                    double saque = lerDouble("Valor do saque: ");
                    if (saque <= 0) {
                        System.out.println("Valor de saque inválido.");
                    } else if (saque > saldo) {
                        System.out.println("Saldo insuficiente.");
                    } else {
                        saldo -= saque;
                        System.out.printf("Saque realizado. Saldo atual: R$ %.2f%n", saldo);
                    }
                    break;
                case 3:
                    System.out.printf("Saldo atual: R$ %.2f%n", saldo);
                    break;
                case 4:
                    System.out.printf("Saldo final: R$ %.2f%n", saldo);
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }

            System.out.println();
        } while (opcao != 4);
    }

    private static void exercicio7() {
        exibirCabecalhoExercicio("Exercício 7 - Desconto por categoria");
        double valorCompra = lerDouble("Digite o valor da compra: ");
        int categoria = lerInteiro("Digite a categoria do cliente (1, 2 ou 3): ");
        double percentualDesconto;

        switch (categoria) {
            case 1:
                percentualDesconto = 0.05;
                break;
            case 2:
                percentualDesconto = 0.10;
                break;
            case 3:
                percentualDesconto = 0.15;
                break;
            default:
                System.out.println("Categoria inválida.");
                return;
        }

        double desconto = valorCompra * percentualDesconto;
        double valorFinal = valorCompra - desconto;

        System.out.printf("Valor do desconto: R$ %.2f%n", desconto);
        System.out.printf("Valor final a pagar: R$ %.2f%n", valorFinal);
    }

    private static void exercicio8() {
        exibirCabecalhoExercicio("Exercício 8 - Contagem de valores");
        int positivos = 0;
        int negativos = 0;
        int zeros = 0;

        for (int i = 1; i <= 10; i++) {
            int numero = lerInteiro("Digite o " + i + "º número: ");

            if (numero > 0) {
                positivos++;
            } else if (numero < 0) {
                negativos++;
            } else {
                zeros++;
            }
        }

        System.out.println("Positivos: " + positivos);
        System.out.println("Negativos: " + negativos);
        System.out.println("Zeros: " + zeros);
    }

    private static void exercicio9() {
        exibirCabecalhoExercicio("Exercício 9 - Soma de 1 até N");
        int n = lerInteiro("Digite N: ");
        int soma = 0;

        for (int i = 1; i <= n; i++) {
            soma += i;
        }

        System.out.println("Soma = " + soma);
    }

    private static void exercicio10() {
        exibirCabecalhoExercicio("Exercício 10 - Contagem regressiva e soma");
        int n;

        do {
            n = lerInteiro("Digite um número inteiro maior que 0: ");
            if (n <= 0) {
                System.out.println("Valor inválido. Tente novamente.");
            }
        } while (n <= 0);

        int soma = 0;

        for (int i = n; i >= 1; i--) {
            System.out.print(i + " ");
            soma += i;
        }

        System.out.println();
        System.out.println("Soma = " + soma);
    }

    private static void exibirCabecalhoExercicio(String titulo) {
        System.out.println(titulo);
    }

    private static int lerInteiro(String mensagem) {
        while (true) {
            System.out.print(mensagem);
            if (SCANNER.hasNextInt()) {
                int valor = SCANNER.nextInt();
                SCANNER.nextLine();
                return valor;
            }

            System.out.println("Entrada inválida. Digite um número inteiro.");
            SCANNER.nextLine();
        }
    }

    private static double lerDouble(String mensagem) {
        while (true) {
            System.out.print(mensagem);
            if (SCANNER.hasNextDouble()) {
                double valor = SCANNER.nextDouble();
                SCANNER.nextLine();
                return valor;
            }

            System.out.println("Entrada inválida. Digite um número.");
            SCANNER.nextLine();
        }
    }
}
