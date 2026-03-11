//Faça um algoritmo que leia a altura e o sexo de uma pessoa:
//calcule e mostre seu peso ideal.
//usar as formulas a seguir para calcular o peso ideal:
// para o sexo feminino: 52 kg + 0,75 x (Altura - 152,4)
//para o sexo masculino: 72,7 +0,75 x ( Altura - 152,4)

import java.util.Scanner;
public class Aula3Ex6 {
    public static void main (String[]args) {

        Scanner e = new Scanner(System.in);

        char sexo;
        double altura;
        double pesoIdeal;

        System.out.println("Vamos calcular seu peso ideal.Digite F se você é do sexo feminino ou M se você é do sexo masculino (F/M): ");
        sexo = e.next().charAt(0);

        if (!(sexo == 'M' || sexo == 'm' || sexo == 'F' || sexo == 'f')) {
            System.out.println("Opção inválida! Digite apenas F ou M.");
            e.close();
            return;
                    }

        System.out.println("Digite sua altura em centímetros: ");
        altura = e.nextDouble();


        if (sexo == 'M' || sexo =='m') {
            pesoIdeal = (72.7 + 0.75 * (altura - 152.4));
            System.out.printf("Seu peso ideal é %.2f kg%n", pesoIdeal);
        } else {
        pesoIdeal = (52 + 0.75 * (altura - 152.4));
        System.out.printf("Seu peso ideal é %.2f kg%n", pesoIdeal);

            }
        e.close();
        }
    }



