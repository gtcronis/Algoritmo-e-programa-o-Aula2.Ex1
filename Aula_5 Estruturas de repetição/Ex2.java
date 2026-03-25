////Gabriel Tolcsvai de Cronis
//Faça um algoritmo que leia 10 números inteiros e diga:
//quantos são pares e quantos são ímpares.


import java.util.Scanner;
public class Ex2 {
    public static void main (String[]args){

        Scanner sc = new Scanner(System.in);

        int numeros;
        int contador=0;
        int nimpares=0;
        int npares=0;


        while (contador < 10) {
            System.out.println("Digite um número: ");
            numeros= sc.nextInt();

            if(numeros %2==0) {
                npares++;
            }else{
                nimpares++;
            }
            contador++;
            }
            System.out.println("Entre os número digitados, os pares são: " + npares);
            System.out.println("Entre os números digitados, os ímpares são: " +nimpares);

            sc.close();
            }

                   }
