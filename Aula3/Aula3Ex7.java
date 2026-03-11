//Gabriel Tolcsvai de Cronis
//Faça um algoritmo que leia o salário e a quantidade de anos de cada 	funcionário, calcule e imprima o valor do bônus.
//20% do valor do salário a todos os funcionários com tempo de trabalho igual ou superior a cinco anos
// de 10% aos demais funcionários.


import java.util.Scanner;
public class Aula3Ex7{
    public static void main (String[]args){
Scanner e=new Scanner(System.in);

double salario;
int tempoTrabalho;

System.out.println("Vamos calcular o valor do seu bônus");
double bonus;

System.out.println("Digite seu salário em R$: ");
salario=e.nextDouble();

System.out.println("Quantos anos você trabalha na empresa?: ");
        tempoTrabalho=e.nextInt();
System.out.println("Você trabalha na empresa há "+ tempoTrabalho + " anos.");

        if(tempoTrabalho >= 5) {
            bonus = salario * 0.20;
        }else{
            bonus= salario * 0.10;
        }
System.out.printf("O valor do bônus será de R$ %.2f%n", bonus);
        e.close();
    }
}



