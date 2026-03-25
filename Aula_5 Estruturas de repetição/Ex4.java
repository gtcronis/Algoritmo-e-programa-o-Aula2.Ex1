////Gabriel Tolcsvai de Cronis
//Faça um algoritmo que imprima a metade de cada número de 10 a 20.


 import java.util.Scanner;
public class Ex4 {
    public static void main (String[]args){

        Scanner sc = new Scanner(System.in);

        int numero=10;
        double metade;
        int sequencia;


        while(numero <=20){

            metade=numero/2;

        System.out.println("A metade de "+numero+ " é "+ metade);
            numero++;

                    }
        sc.close();
    }
}
