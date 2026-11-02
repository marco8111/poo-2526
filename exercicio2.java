
import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args){
        double quantiaDolares;
        double quantiaEuros;
        double quantiaEurosFinal;
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira a quantia em Dólares:");
        quantiaDolares = sc.nextDouble();

        quantiaEuros = (quantiaDolares / 1.2);

        quantiaEurosFinal = quantiaEuros - 2.0;

        System.out.println("A quantia em Euros (-2 euros de operaçaõ) é : " + quantiaEurosFinal);
    }
}
