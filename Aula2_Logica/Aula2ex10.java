//Gabriel Tolcsvai de Cronis
//Análise e Desenvolvimento de Sistemas/ Senac/ 1º Semestre
//Construir um algoritmo para imprimir:o cálculo da área de um círculo com raio de 5 cm. (π = 3.14159)
//área do círculo = π * r2
public class Aula2ex10{
    public static void main(String[] args) {

        double pi = 3.14159;
        double raio = 5.0;

        double area = pi * Math.pow(raio, 2);
        System.out.printf("A área do círculo é: %.2f cm²%n", area);

    }
}