//Faça um algoritmo que receba duas notas de 6 alunos, calcule e mostre:
// A média aritmética das duas notas de cada aluno;
// Forneça a seguinte mensagem de acordo com a nota:
 //       ¨ REPROVADO se média é menor ou igual a 3.
 //       ¨ EXAME se média é acima de 3 e menor que 7.
 //       ¨ APROVADO maior ou igual a 7
// O total de alunos aprovados.
// O total de alunos de exame.
// O total de alunos reprovados.
//A média da classe.

import java.util.Scanner;

public class CalcNotas {
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        double n1,n2,media;
        int alunoAprovado =0;
        int alunoReprovado = 0;
        int alunoExame =0;
        double mediaClasse=0;

        for(int i =1; i<=6; i++) {
            System.out.println("Vamos calcular a sua média. Digite a primeira nota: ");
            n1 = sc.nextDouble();
            System.out.println("Digite a segunda nota: ");
            n2 = sc.nextDouble();

            media = (n1 + n2) / 2;

            if (media < 3) {
                System.out.println("REPROVADO");
                alunoReprovado++;
            } else if (media < 7) {
                System.out.println("EXAME");
                alunoExame++;
            } else {
                System.out.println("APROVADO");
                alunoAprovado++;
            }

            mediaClasse += media;
        }
                System.out.println("O total de alunos reprovados é: " + alunoReprovado);
                System.out.println("O total de alunos em exame é: " + alunoExame);
                System.out.println("O total de alunos aprovados é: "+ alunoAprovado);

                mediaClasse= mediaClasse / 6;

                System.out.println("**************\nA média da sala é: "+ mediaClasse);



        sc.close();


    }
}
