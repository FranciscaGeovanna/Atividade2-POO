import java.util.Scanner;

public class Q09 {
    public static void main(String [ ] args){
        Scanner resposta = new Scanner(System.in);

        System.out.print("Informe um valor inteiro de 3 dígitos: ");
        int num = resposta.nextInt();

        if(num <= 100 || num >= 999){
            System.out.println("\nErro: Por favor, tente com um valor de apenas 3 dígitos");
        }
        else{
            System.out.println("\nO valor original é: " + num);

            int num1 = num / 100;
            int aux = num % 100;
            int num2 = aux / 10;
            int num3 = aux % 10;
            num = (num3 * 100) + (num2 * 10) + num1;

            System.out.println("O valor invertido é: " + num);
        }
    }
}
