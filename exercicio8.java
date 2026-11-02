import java.util.Scanner;

public class exercicio8 {
    public static void main(String[] args){

        float montanteaPagar;

        Scanner sc = new Scanner(System.in);

        System.out.println("Qual é a conta da pessoa: ");
        montanteaPagar = sc.nextFloat();

        if (montanteaPagar > 2000) {
            System.out.println("O valor a pagar é: " + (montanteaPagar - (montanteaPagar * 0.02)));
        }
        else if(montanteaPagar >= 2000 && montanteaPagar < 5000){
            System.out.println("O valor a pagar é: " + (montanteaPagar - (montanteaPagar * 0.04)));
        }
        else if(montanteaPagar >= 5000){
            System.out.println("O valor a pagar é: " + (montanteaPagar - (montanteaPagar * 0.075)));

        }
    }
}
