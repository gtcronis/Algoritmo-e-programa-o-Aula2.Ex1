//Gabriel Tolcsvai de Cronis
//Em uma eleição presidencial, existem quatro candidatos.
//Os votos são informados através de um código:
//¨ 1, 2, 3 ou 4 - Voto para o respectivo candidato
//¨ 5 - Voto nulo
//¨ 6 - Voto em branco
//Faça um algoritmo que leia o voto de 10 eleitores.Calcule e mostre:
//¨ a) O total de votos para cada candidato;
//¨ b) O total de votos nulos;
//¨ c) O total de votos em branco;
//¨ d) O percentual dos votos brancos e nulos.


import java.util.Scanner;
public class Votos {
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        int candidato;
        int totalCand1=0;
        int totalCand2=0;
        int totalCand3=0;
        int totalCand4=0;


        int totalNulos=0;
        int totalBrancos=0;

        double percentualBrancos=0;
        double percentualNulos=0;

        for(int i =1;i <=10;i++){
        candidato=0;
            while (candidato < 1 || candidato > 6){
                System.out.println(
                        "Escolha uma das opções de voto:\n" +
                        "        1 - Candidato 1\n" +
                        "        2 - Candidato 2\n" +
                        "        3 - Candidato 3\n" +
                        "        4 - Candidato 4\n" +
                        "        5 - Voto NULO\n" +
                        "        6 - Voto em BRANCO\n" +
                        "        -------------------------\n" +
                        "    Digite uma das opções válidas: ");


                candidato=sc.nextInt();
            if (candidato < 1 || candidato >6){
                System.out.println("Opção inválida! Digite novamente: ");
            }
            }
            switch (candidato){
                case 1:
                   totalCand1++;
                break;
                 case 2:
                     totalCand2++;
                break;
                case 3:
                    totalCand3++;
                break;
                case 4:
                    totalCand4++;
                break;
                case 5:
                    totalNulos++;
                break;
                case 6:
                    totalBrancos++;
                break;

            }
                }
        System.out.println("Total votos Candidato 1: " + totalCand1);
        System.out.println("Total votos Candidato 2: " + totalCand2);
        System.out.println("Total votos Candidato 3: " + totalCand3);
        System.out.println("Total votos Candidato 4: " + totalCand4);
        System.out.println("Total votos nulos: " + totalNulos);
        System.out.println("Total votos em brancos: " + totalBrancos);

        System.out.println("O total de votos nulos é: "+ totalNulos);

        System.out.println("O total de votos em branco é: "+totalBrancos);

    percentualBrancos= (double) totalBrancos/10 * 100;
    System.out.println("O percentual de votos em branco é: "+ percentualBrancos +"%");

    percentualNulos= (double) totalNulos/10 * 100;
    System.out.println("O percentual de votos nulos é: "+percentualNulos+"%");


sc.close();
    }
}
