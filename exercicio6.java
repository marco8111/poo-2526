

import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args){
        double temperatura;
        char unidade;
        System.out.println("\n============Conversor de temperatura============\n");
        Scanner sc = new Scanner(System.in);
        System.out.println("insira a temperatura: ");
        temperatura = sc.nextDouble();
        System.out.println(" Celsius (C) ou Farenheit (F)");
        unidade =  sc.next().charAt(0);

        if (unidade == 'c' || unidade == 'C'){
           double farenheit = (temperatura * 1.8) + 32;
            System.out.println("A sua temperatura convertida de Celsius para farenheit é:  " + farenheit + "F");
        }
        else if (unidade == 'f' || unidade == 'F'){
            double celsius = (temperatura -32) / 1.8;
            System.out.println("A sua temperatura convertida de Farenheit para Celsius é: " + celsius + "C");

        }

    }
}
