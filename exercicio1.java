import java.util.Scanner;

public class exercicio1{
    public void main(String[] args) {
        double distanciaKM;
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira a distancia em milhas:");
        double distanciaMilhas = sc.nextDouble();
        
        distanciaKM = distanciaMilhas * 1.609;
        
        System.out.println("A distancia em KM é: " + distanciaKM);
    }
}
