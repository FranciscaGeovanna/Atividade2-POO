import java.util.Scanner;

public class Q01{
    public static void main(String [ ] args){
        Scanner resposta = new Scanner(System.in);

        System.out.print("Informe um número de 1 a 9 para ver sua tabuada: ");
        int num = resposta.nextInt();

        if(num >= 1 && num <= 9){
            System.out.printf("\n========== TABUADA DO NÚMERO %d ==========", num);
            for (int i = 1; i <= 10; i++){
                int mult = num * i;
                System.out.printf("\n%2d X %2d = %2d", num, i, mult);
            }
        }
        else{
            System.out.println("\nError: Por favor digite um número entre 1 e 9");
        }
    }
}