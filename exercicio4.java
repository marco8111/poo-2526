import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args){
        float qtdadeSegundos;
        int qtdadeMinutos;
        int qtdadeHoras;
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira a quantidade de segundos:");
        qtdadeSegundos = sc.nextFloat();

        qtdadeMinutos = (int)qtdadeSegundos / 60;
        qtdadeHoras = qtdadeMinutos / 60;

        System.out.println("A quantidade de segundos convertida em HH:MM:SS é: " + qtdadeHoras + ":" + (qtdadeMinutos % 60) + ":" + (int)(qtdadeSegundos % 60));


    }


}
