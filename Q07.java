import java.util.Scanner;

public class Q07 {
    public static void main(String [ ] args){
        Scanner resposta = new Scanner(System.in);

        System.out.print("Informe o valor do saque (inteiro): ");
        int saque = resposta.nextInt();

        int n100 = saque / 100;
        int n50 = (saque % 100) / 50;
        int n10 = ((saque % 100) % 50) / 10;
        int n5 = (((saque % 100) % 50) % 10) / 5; 
        int n1 = (((saque % 100) % 50) % 10) % 5; 

        System.out.println("\nO valor do saque pode ser expresso em: ");
        System.out.printf("%d notas de R$100\n", n100);
        System.out.printf("%d notas de R$50\n", n50);
        System.out.printf("%d notas de R$10\n", n10);
        System.out.printf("%d notas de R$5\n", n5);
        System.out.printf("%d moedas de R$1", n1);
    }
}
