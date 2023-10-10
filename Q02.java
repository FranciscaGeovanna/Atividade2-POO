import java.util.Scanner;

public class Q02 {
    public static void main(String [ ] args){
        Scanner resposta = new Scanner(System.in);

        System.out.print("Informe uma temperatura em graus Celsius: ");
        float grausC = resposta.nextFloat();

        float grausF = (9 * grausC + 160) / 5;

        System.out.printf("\n%.2f°C em graus Fahrenheit é: %.2f°F", grausC, grausF);
    }
}
