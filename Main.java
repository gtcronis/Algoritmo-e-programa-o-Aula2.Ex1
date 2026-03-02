// //Gabriel Tolcsvai de Cronis
//Análise e Desenvolvimento de Sistemas/ Senac/ 1º Semestre
//Faça um algoritmo para imprimir em cada linha: a sua idade, a sua altura o seu status na aula: Presente ou Ausente.

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int idade=35;
        double altura=1.75;
        Scanner e=new Scanner(System.in);
        System.out.println("Você está presente ou ausente nessa aula?");
        String status= e.nextLine();
        System.out.println("Idade: "+ idade);
        System.out.println("Altura: "+ altura);
        System.out.println("Status: "+ status);
    }
        }

