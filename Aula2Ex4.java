 //Gabriel Tolcsvai de Cronis
//Análise e Desenvolvimento de Sistemas/ Senac/ 1º Semestre
//Construir um algoritmo para ler dois números inteiros e imprimir seu produto.

import java.util.Scanner;
public class Aula2Ex4{
    public static void main(String[] args) {

        Scanner e = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int n1= e.nextInt();

        System.out.println("Digite o segundo número: ");
        int n2= e.nextInt();

        int produto = n1*n2;
        System.out.println("O produto é: " + produto);

        e.close();
        }
    }
