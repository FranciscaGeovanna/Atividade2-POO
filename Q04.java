import java.util.Scanner;

public class Q04 {
    public static void main (String [ ] args){
        Scanner resposta = new Scanner(System.in);

        System.out.print("Informe a contação atual do dólar: ");
        float cot = resposta.nextFloat();

        System.out.print("Informe um valor em dólar: ");
        float dolar = resposta.nextFloat();

        float real = dolar * cot;

        System.out.printf("\n$ %.2f em Real é R$ %.2f", dolar, real);
    }
}