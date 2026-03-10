//Criar uma calculadora de operações básicas:
//soma, subtração, multiplicação e divisão.
//o algoritmo deve ler dois números e o sinal correspondente à operação desejada;
//utilize o tipo char para ler a operação;
//no final deve ser impresso o resultado.
//Restrições:
//se o sinal digitado não corresponder a uma operação. . .
//apresentar a mensagem Sinal Inválido e finalizar.
//para a operação de divisão verificar se o divisor é válido (maior que zero)!
// caso seja menor ou igual a zero, informar a mensagem “Impossível dividir‼”


import java.util.Scanner;
public class Aula3Ex13 {
    public static void main(String[]args) {

        Scanner e = new Scanner(System.in);
        double n1, n2;
        char operacao;

        System.out.println("Qual tipo de operação matemática você quer relizar?: (+ , - ,*, /)");
        operacao = e.next().charAt(0);

        System.out.println("Digite o primeiro número: ");
        n1 = e.nextDouble();
        System.out.println("Digite o segundo número:");
        n2 = e.nextDouble();

        if (operacao == '+') {
            System.out.printf("O resultado da soma é %.2f%n", n1 + n2);
        } else if (operacao == '-') {
            System.out.printf("O resultado da subtração é %.2f%n", n1 - n2);
        } else if (operacao == '*') {
            System.out.printf("O resultado da multiplicação é %.2f%n", n1 * n2);
        } else if (operacao == '/') {
        if (n2 > 0) {
            System.out.printf("O resultado da divisão é %.2f%n", n1 / n2);
        } else {
            System.out.println("Impossível dividir!");
            }
        } else {
            System.out.println("Sinal Inválido!");
         }
        e.close();
            }
                 }
