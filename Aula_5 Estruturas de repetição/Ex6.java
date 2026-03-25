////Gabriel Tolcsvai de Cronis
//Faça um algoritmo que leia dez números inteiros e positivos
//mostre o menor entre eles.

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero,menorNumero;

        int contador = 1;


        System.out.println("Digite o 1º número: ");
        menorNumero = sc.nextInt();

        contador++;

        do {
            System.out.println("Digite o " + contador + "º número: ");
            numero = sc.nextInt();

            if (numero < menorNumero) {
                menorNumero = numero;
            }

            contador++;

        } while (contador <= 10);

        System.out.println("O menor número digitado foi: " + menorNumero);

        sc.close();
    }
}
