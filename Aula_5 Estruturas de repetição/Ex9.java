import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int codigo;
        int quantidade;
        double preco = 0;
        double totalProduto;
        double totalCompra = 0;
        char continuar = 'S';  

        do {
            System.out.println("Digite o código do produto:");
            codigo = sc.nextInt();

            switch (codigo) {
                case 100:
                    preco = 1.20;
                    break;
                case 101:
                    preco = 1.30;
                    break;
                case 102:
                    preco = 1.50;
                    break;
                case 103:
                    preco = 1.20;
                    break;
                case 104:
                    preco = 1.30;
                    break;
                case 105:
                    preco = 1.00;
                    break;
                default:
                    System.out.println("Código inválido! Tente novamente.");
                    continue; 
            }

            System.out.println("Digite a quantidade:");
            quantidade = sc.nextInt();

            totalProduto = preco * quantidade;
            totalCompra += totalProduto;

            System.out.println("Total deste produto: R$ " + totalProduto);

            System.out.println("Deseja comprar mais algum produto? (S/N)");
            continuar = sc.next().toUpperCase().charAt(0);

        } while (continuar == 'S');

        System.out.println("=== Valor total da compra: R$ " + totalCompra+ " ===");


        sc.close();
    }
}
