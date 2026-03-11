////Gabriel Tolcsvai de Cronis
//Ler dois valores inteiros:e se forem iguais, mostrar “Números iguais”;
// caso contrário, apresentar a diferença do maior pelo menor.

import java.util.Scanner;
public class Aula3Ex3 {
    public static void main (String[]args){

        Scanner e = new Scanner(System.in);

        int n1;
        int n2;

        System.out.println("Escolha um número inteiro: ");
         n1=e.nextInt();
        System.out.println("Escolha o segundo número inteiro: ");
         n2=e.nextInt();

        if(n1 == n2) {
            System.out.println("Números iguais");
        }else if(n1>n2) {
            System.out.println("A diferença entre os números é: " + (n1 - n2));
        }else {
            System.out.println("A diferença entre os números é: "+ (n2-n1));

                   }
            e.close();
    }
}

