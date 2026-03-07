//Gabriel Tolcsvai de Cronis
//Análise e Desenvolvimento de Sistemas/ Senac/ 1º Semestre
//Construir um algoritmo para ler dois números inteiros, calcular e imprimir a soma desses números.

import java.util.Scanner;
public class Aula2Ex4 {
    public static void main(String[] args) {

        Scanner e= new Scanner(System.in);
                System.out.println("Vamos somar alguns números inteiros.Escolha o primeiro número: ");
                int n1= e.nextInt();
        System.out.println("Escolha o segundo número: ");
        int n2= e.nextInt();
        System.out.println("Escolha o terceiro número: ");
        int n3= e.nextInt();
        System.out.println("Escolha o quarto número: ");
        int n4= e.nextInt();

        int soma = n1+n2+n3+n4;

        System.out.print("A soma dos números escolhidos é: " + soma);

        e.close();


    }
}