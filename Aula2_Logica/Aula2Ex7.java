//Gabriel Tolcsvai de Cronis
//Análise e Desenvolvimento de Sistemas/ Senac/ 1º Semestre
//Construir um algoritmo para imprimir em cada linha o resultado lógico das seguintes expressões: a) ((120 - 30) = (3 ˆ 30)) b)(não ((20 módulo 4)= 1) ou (9 != 9)) c)((5 módulo 2 ) > 3) d) (a = A)
public class Aula2Ex7 {
    public static void main(String[] args) {
     boolean resultado =((120-30)== Math.pow(3,30));
     System.out.println(resultado);

     boolean resultado2 =(!((20 % 4) == 1) || (9 != 9));
        System.out.println(resultado2);

             boolean resultado3 =((5 % 2)> 3);
        System.out.println(resultado3);

             boolean resultado4 =("a"=="A");
        System.out.println(resultado4);

        
    }
}