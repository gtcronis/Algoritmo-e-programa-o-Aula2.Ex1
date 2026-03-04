//Gabriel Tolcsvai de Cronis
//Análise e Desenvolvimento de Sistemas/ Senac/ 1º Semestre
//Construir um algoritmo que leia o ano de nascimento de uma pessoa e o ano atual.
//Calcule e mostre:a idade dessa pessoa;Quantos anos essa pessoa terá em 2030.

    import java.util.Scanner;
    public class Aula2Ex11 {
    public static void main(String[] args) {
     Scanner e=new Scanner(System.in);

     System.out.println("Digite seu ano de nascimento: ");
     int anoNasc= e.nextInt();

     System.out.println("Digite o ano atual: ");
     int anoAtual= e.nextInt();

     int idade= anoAtual - anoNasc;
     int idade2030= 2030 - anoNasc;

     System.out.println("Sua idade é: "+idade+" anos");
     System.out.println ("Em 2030 você terá: "+idade2030+ " anos");

     e.close();
    }
        }

