import java.util.Scanner;

public class Q05 {
    public static void main(String [ ] args){
        Scanner resposta = new Scanner(System.in);

        System.out.println("Informe sua idade em anos, meses e dias...");
        System.out.print("Anos: ");
        int anos = resposta.nextInt();

        System.out.print("Meses: ");
        int meses = resposta.nextInt();

        System.out.print("Dias: ");
        int dias = resposta.nextInt();

        int anosDias = anos * 265;
        int mesesDias = meses * 30;
        int result = anosDias + mesesDias + dias;

        System.out.print("\nSua idade expressa em dias: " + result);
    }
}
