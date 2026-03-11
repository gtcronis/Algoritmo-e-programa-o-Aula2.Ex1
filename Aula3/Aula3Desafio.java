//Gabriel Tolcsvai de Cronis
//Desenvolver um algoritmo para definir se uma pessoa está apta a votar no Brasil.
//Quais são as regras para se votar no Brasil?
//Identifique quais regras devem ser satisfeitas para definir que uma pessoa está apta a votar.
//Faça um programa que pede as informações necessárias e verifica se 	uma pessoa está apta a votar.


import java.util.Scanner;
public class Aula3Desafio {
    public static void main (String[]args){

        Scanner e= new Scanner(System.in);

        System.out.print("Vamos verificar se você está apto a votar no Brasil.Todos os critérios devem ser atendidos para que você esteja apto.");
        System.out.println("\n Faremos algumas perguntas,responda S para sim e N para não.");
        //Ter foto e cadastro das impressões digitais na Justiça Eleitoral.
        // Ter idade igual ou superior a 16 anos.
        // Necessário ser brasileiro nato ou naturalizado
        // Fonte: https://www.tse.jus.br/legislacao/compilada/res/2026/resolucao-no-23-760-de-2-de-marco-de-2026 acesso em 11/03/2026 às 09:15.

        char pergunta1;
        char pergunta2;
        char pergunta3;

        System.out.println("Você possui cadastro atualizado na Justiça Eleitoral?: ");
        pergunta1=e.next().charAt(0);
        System.out.println("Possui idade mínima de 16 anos?: ");
        pergunta2=e.next().charAt(0);
        System.out.println("Você é brasileiro(a) natural ou naturalizado(a)?: ");
        pergunta3=e.next().charAt(0);
        if(pergunta1 == 'N' || pergunta2 =='N' || pergunta3 == 'N') {
            System.out.println("Você está apto a votar no Brasil.");
        } else {
            System.out.println("Você não está apto a votar no Brasil.");


        }
    }
}
