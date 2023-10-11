import java.util.Scanner;

public class Q06{
    public static void main(String [ ] args){
        Scanner resposta = new Scanner(System.in);

        System.out.print("Informe a duração do evento em segundos: ");
        int segundos = resposta.nextInt();

        int horas = segundos / 3600; // QUANTIDADE DE SEGUNDOS EM 1 HORA
        int resto = segundos % 3600;
        int minuntos = resto / 60; // QUANTIDADE DE SEGUNDOS RM 1 MINUTO
        int seg = segundos % 60;

        System.out.print("\nA duração do evento foi de " + horas + ":" + minuntos + ":" + seg);
    } 
}