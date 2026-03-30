//Gabriel Tolcsvai de Cronis
//Faça um algoritmo que receba a idade e a altura de 10 pessoas:
//Calcule e mostre a média das alturas daquelas com mais de 50 anos.


import java.util.Scanner;
public class IdadeAltura {
    public static void main (String[]args){

        Scanner sc = new Scanner(System.in);

        int idade,contador;
        double altura,somaAltura,media;
        somaAltura=0;
        contador=0;

        for(int i=1; i<=10; i++) {


            System.out.println("Digite sua idade :");
            idade = sc.nextInt();
            System.out.println("Digite sua altura em metros: ");
            altura = sc.nextDouble();

            if (idade >= 50) {
              somaAltura+=altura;
                contador++;
            }
        }
         media= somaAltura / contador;

        if (contador>0) {
            System.out.println("A média das alturas das pessoas com mais de 50 anos é: " + media);
        }else{
            System.out.println("Não existem pessoas com 50 anos ou mais nessa pesquisa.");
        }
        sc.close();
        }


    }

