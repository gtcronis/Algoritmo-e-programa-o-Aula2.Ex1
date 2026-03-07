//Gabriel Tolcsvai de Cronis
//Análise e Desenvolvimento de Sistemas/ Senac/ 1º Semestre
//Construir um algoritmo que calcule e imprima o valor de cada expressão: a) (20 - 15)/2 b) 2 ˆ (5/20) + 30 / (15 ˆ 2) c)35 / (6 + 2) d) 23 módulo 4

public class Aula2Ex6a {
    public static void main(String[] args) {

        double expr1 = (20 - 15) / 2.0;
        double expr2 = Math.pow(2, 5.0 / 20) + 30 / (Math.pow(15, 2));
        double expr3 = 35 / (6 + 2);
        double expr4 = 23 % 4;

        System.out.printf("20-15)/2 = %.2f%n", expr1);
        System.out.printf("2ˆ(5/20) +30/(15ˆ2) =%.3f%n", expr2);
        System.out.printf("35/(6+2)= %.2f%n", expr3);
        System.out.printf("20-15)/2=%.2f%n", expr4);
    }
}

