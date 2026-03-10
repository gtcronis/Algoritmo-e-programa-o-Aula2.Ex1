//Faça um algoritmo que receba a idade de um nadador e 	imprima a sua categoria seguindo as regras
//Categoria infantil A 5-7 anos
//Categoria infantil B 8-10 anos
//Categoria juvenil A 11-13 anos
//Categoria juvenil B 14-17 anos
//Sênior 18 anos ou mais

import java.util.Scanner;
public class Aula3Ex11 {
    public static void main(String[] args) {

        Scanner e = new Scanner(System.in);
        int idade;

        System.out.println("Vamos descobrir a qual categoria você pertence. Digite sua idade: ");
        idade = e.nextInt();

        if (idade >= 5 && idade <= 7) {
            System.out.println(" Categoria Infantil A");
        } else if (idade >= 8 && idade <= 10) {
            System.out.println(" Categoria Infantil B");
        } else if (idade >= 11 && idade <= 13) {
            System.out.println(" Categoria juvenil A");
        } else if (idade >= 14 && idade <= 17) {
            System.out.println(" Categoria juvenil B");
        } else if (idade >= 18) {
            System.out.println(" Categoria Sênior");
        } else {
            System.out.println("A idade mínima para competir é: 5 anos.");
        }
        e.close();

        }
}