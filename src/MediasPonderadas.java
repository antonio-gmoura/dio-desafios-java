import java.util.*;

public class MediasPonderadas
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int casos = input.nextInt();
        int cont = 0;
        while (cont < casos){

            double a = input.nextDouble();
            double b = input.nextDouble();
            double c = input.nextDouble();

            double media = ((a * 2) + (b * 3) + (c * 5)) / 10;

            System.out.printf("%.1f\n", media);

            cont++;
        }

    }
}