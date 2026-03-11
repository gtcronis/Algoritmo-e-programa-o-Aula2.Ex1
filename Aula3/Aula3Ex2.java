//Gabriel Tolcsvai de Cronis
//Faça um algoritmo que:receba a idade de uma pessoa;
//se for maior de idade imprima: “maior de idade”;
//senão imprima: “menor de idade

import java.util.Scanner;
public class Aula3Ex2 {
    public static void main(String[] args) {

        Scanner e=new Scanner(System.in);
        int idade;
    System.out.println("Qual sua idade?: ");
    idade=e.nextInt();

if(idade >= 18) {
    System.out.println(" Maior de idade");
}else {
    System.out.println("Menor de idade");

    e.close();
}
    }

    }
