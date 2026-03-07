//Gabriel Tolcsvai de Cronis
//Análise e Desenvolvimento de Sistemas/ Senac/ 1º Semestre
//Construir um algoritmo para ler três notas de um aluno.Calcule e mostre a média aritmética do aluno.

    import java.util.Scanner;
    public class Aula2Ex5 {
            public static void main(String[] args) {
                Scanner e= new Scanner(System.in);

                System.out.println("Vamos calcular a sua média de notas.Digite a primeira nota: ");
                double n1= e.nextDouble();

                System.out.println("Digite a segunda nota: ");
                double n2 = e.nextDouble();

                System.out.println("Digite a terceira nota: ");
                double n3 = e.nextDouble();

                double media = (n1+n2+n3)/3;

                System.out.println("Sua média é: " + media);

                e.close();

            }
        }