// Gabriel Tolcsvai de Cronis
// Faça um algoritmo que receba a idade, a altura e o peso de 10 pessoas, 	calcule e mostre:
//a) A quantidade de pessoas maiores de 50 anos.
//b) A média das alturas das pessoas com idade entre 10 e 20 anos.
//c) A porcentagem de pessoas com peso inferior a 40 quilos.

import java.util.Scanner;
public class Idade {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int idade;
        double altura, peso;

        int somaCinquenta = 0;
        int somaMenosQuarenta = 0;
        double somaAltura = 0;
        int contadorAltura = 0;

        for (int i = 1; i <= 10; i++) {

            System.out.println("Digite sua idade: ");
            idade = sc.nextInt();
            System.out.println("Digite sua altura em metros: ");
            altura = sc.nextDouble();
            System.out.println("Digite seu peso em kg:");
            peso = sc.nextDouble();

            if (idade >= 50) {
                somaCinquenta++;
            }
            if (idade >= 10 && idade <= 20) {
                somaAltura += altura;
                contadorAltura++;
            }
            if (peso < 40) {
                somaMenosQuarenta++;
            }
        }

            System.out.println("A quantidade de pessoas maiores de 50 anos é: " + somaCinquenta);

            if(contadorAltura >0) {
                double mediaAltura = somaAltura / contadorAltura;
                System.out.println("A média das alturas das pessoas com idade entre 10 e 20 anos é: " + mediaAltura);
            }

            double porcentagemMenosQuarenta = (somaMenosQuarenta / 10.0) * 100;
            System.out.println("A porcentagem de pessoas com peso inferior a 40 quilos é: " + porcentagemMenosQuarenta + "%");


        sc.close();
    }
}