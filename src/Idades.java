import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class  Idades {

    public static void main(String[] args) throws IOException {

        Scanner leitor = new Scanner(System.in);
        int cont = 0;
        int soma = 0;
        int n    = 0;
        while (n >= 0) {
            n = leitor.nextInt();
            if (n >= 0) {
                soma += n;
                cont ++;
            }
        }
        double media = (double)soma / (double)cont;
        System.out.println(String.format("%.2f", media));
    }
}