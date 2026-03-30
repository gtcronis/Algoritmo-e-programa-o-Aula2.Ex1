//Gabriel Tolcsvai de Cronis
//Ler um número inteiro e imprimir na tela a sequência
// de números que vai do número 1 até o número lido.

import java.util.Scanner;
public class Lidos {
    public static void main (String[]args) {

        Scanner sc = new Scanner(System.in);
        int numero;

        System.out.println("Digite um número inteiro");
        numero=sc.nextInt();


        for(int i=1; i<=numero ;i++){
            System.out.println(i);
        }
    }
}
