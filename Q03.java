import java.util.Scanner;

public class Q03{
    public static void main(String [ ] args){
        Scanner resposta = new Scanner(System.in);

        System.out.print("Informe o tempo gasto na viagem em horas: ");
        float tempo = resposta.nextFloat();

        System.out.print("\nInforme a velocidade média em km/h: ");
        float vm = resposta.nextFloat();

        float distancia = tempo * vm;

        float litros = distancia / 12;

        System.out.print("\nSua velocidade média: " + vm + " KM/H");
        System.out.print("\nSeu tempo gasto: " + tempo + " H");
        System.out.print("\nDistância percorrida: " + distancia + " KM");
        System.out.print("\nQuantidade de litros de combustível ultilizada na viagem: " + litros + " L");
    }
}