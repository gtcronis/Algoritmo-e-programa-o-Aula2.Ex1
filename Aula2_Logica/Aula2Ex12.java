//Gabriel Tolcsvai de Cronis
//Análise e Desenvolvimento de Sistemas/ Senac/ 1º Semestre
//Faça um algoritmo que receba um número, calcule e mostre:O número elevado ao quadrado;O número elevado ao cubo;A raiz quadrada do número digitado;O número elevado a potência 10;


import java.util.Scanner;
public class Aula2Ex12 {
    public static void main(String[] args) {

        Scanner e = new Scanner(System.in);

        System.out.println("Escolha um número: ");
        double n= e.nextDouble();
        double nquadrado= Math.pow(n,2);
        double ncubo= Math.pow(n,3);
        double raiz= Math.sqrt(n);
        double pot10= Math.pow(n,10);


        System.out.printf("O resultado do número %.2f ao quadrado é: %.2f%n",n,nquadrado);
        System.out.printf("O resultado do número %.2f ao cubo é: %.2f%n",n,ncubo);
        System.out.printf("O resultado da raiz quadrada do número %.2f é: %.2f%n",n,raiz);
        System.out.printf("O resultado do número 2%.2f elevado a 10 é: %.2f%n",n,pot10);

        e.close();

    }
}