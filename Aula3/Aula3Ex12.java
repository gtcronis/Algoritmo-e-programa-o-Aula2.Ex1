//Faça um progarama para Ler o salário de uma pessoa e calcular e imprimir o desconto do INSS (calculado) de acordo com a tabela a seguir:
//<= R$ 600,00	Isento
//> R$ 600,00 e <= R$ 1200,00	20%
//> R$ 1200,00 e <= R$ 2000,00	25%
//<= R$ 2000,00	30%

import java.util.Scanner;
public class Aula3Ex12 {
    public static void main(String[] args) {

        Scanner e = new Scanner(System.in);

        double salario;
        double desconto;
        System.out.println("Vamos descobrir qual o desconto do INSS proporcional ao seu salário. Informe seu salário em R$: ");
        salario = e.nextDouble();

        if (salario <= 600) {
            System.out.println(" Isento");
        } else if (salario <= 1200) {
            desconto = salario * 0.20;
            System.out.printf(" Desconto de R$ %.2f%n",desconto);
        } else if (salario <= 2000) {
            desconto = salario * 0.25;
            System.out.printf(" Desconto de R$ %.2f%n",desconto);
        } else {
            desconto = salario * 0.30;
            System.out.printf(" Desconto de R$ %.2f%n",desconto);

        }
        e.close();
    }
}