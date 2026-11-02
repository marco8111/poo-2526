
import java.util.Scanner;

public class exercicio9 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int valor;
        int contador = 0;
        int contadorInferior = 0;
        int somaValores = 0;

        System.out.println("Introudz um valor: ");
        valor = sc.nextInt();

        valor = 0;

        while(valor != -1){
            System.out.println("Digite um valor (ou -1 para sair): ");
            valor = sc.nextInt();
            

            if (valor < 250 && valor != -1) {
                contadorInferior++;
            }

            if (valor != -1) {
                somaValores += valor;
                contador++;
            }
            


        }

        System.out.println("O numero de peças produzidas é: " + contador);
        System.out.println("O numero médio de peças produzidas é: " + (somaValores / (double) contador));
        System.out.println("O numero de dias que a produção foi inferior a 250 é: " + contadorInferior);

        
    }
}
