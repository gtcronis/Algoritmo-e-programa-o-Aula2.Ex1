////Gabriel Tolcsvai de Cronis
// Faça um algoritmo para encontrar o maior número entre 3 	números inteiros.
//O algoritmo deve ler três inteiros;
//se forem todos iguais, imprimir: “os números são iguais”;
//caso contrário, imprimir o maior dos 3 números.

import java.util.Scanner;
public class Aula3Ex10 {
    public static void main (String[]args) {
        Scanner e = new Scanner(System.in);

        int n1;
        int n2;
        int n3;

        System.out.println("Vamos descobrir qual é o maior dos números entre os escolhidos. Digite o primeiro número: ");
        n1=e.nextInt();
        System.out.println("Digite o segundo número: ");
        n2=e.nextInt();
        System.out.println("Digite o terceiro número: ");
        n3=e.nextInt();

        int maiorNumero = Math.max(n1, Math.max(n2, n3));

        if (n1 == n2 && n2== n3) {
            System.out.println("Os números são iguais");
        }else{
            System.out.println("O maior número é: "+ maiorNumero);
        }
e.close();

    }
}

