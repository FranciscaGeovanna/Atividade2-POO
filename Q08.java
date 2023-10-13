import java.util.Scanner;

public class Q08 {
    public static void main(String [ ] args){
        Scanner resposta = new Scanner(System.in);

        // OCUPAÇÃO MÉDIA
        int ocupacaoSP = (42 * 40) / 100;
        int ocupacaoCP = (42 * 70) / 100;

        System.out.print("Informe o preço da diária normal: R$ ");
        float diariaN = resposta.nextFloat();

        float promo = (diariaN * 22) / 100;
        float diariCP = diariaN - promo;
        System.out.printf("\nValor da diária no período da promoção: R$ %.2f", diariCP);
       
        float valorMedSP = ((diariaN * ocupacaoSP) * 8); // EXISTEM 8 DIAS DE FIM DE SEMANA EM 1 MÊS
        System.out.printf("\nValor médio arrecadado sem a promoção durante um mês: R$ %.2f", valorMedSP);

        float valorMedCP = ((diariCP * ocupacaoCP) * 8);
        System.out.printf("\nValor médio arrecadado com a promoção durante um mês: R$ %.2f", valorMedCP);

        float lucroOuPrejuizo = valorMedCP - valorMedSP;

        if(valorMedCP > valorMedSP){
            System.out.printf("\nO hotel teve um lucro de: R$ %.2f", lucroOuPrejuizo);
        } 
        else{
            System.out.printf("\nO hotel teve um prejuízo de: R$ %.2f", lucroOuPrejuizo);
        }
    }
}