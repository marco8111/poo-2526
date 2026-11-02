import java.util.Scanner;

public class exercicio7 {
    public static void main(String[] args){
        float notaAvalPeriodica;
        float notaAvalFinal;
        

        Scanner sc = new Scanner(System.in);

        System.out.println("\n============Calculadora de média de aluno============\n");

        System.out.println("Insira a nota da avaliação periodica:");
        notaAvalPeriodica = sc.nextFloat();

        System.out.println("Insira a nota da avaliação final:");
        notaAvalFinal = sc.nextFloat();



        double notaFinal = 0.30*notaAvalPeriodica + 0.70*notaAvalFinal;

        if (notaAvalPeriodica < 6 || notaAvalFinal < 6){
            System.out.println("A média doa aluno eh: " + notaFinal + " Reprovado por uma das notas ser nota inferior à minima");
        }
        else{
            if (notaFinal >= 17){
                System.out.println("A média doa aluno eh: " + notaFinal + " Aprovado com distinção");
            }
            else if (notaFinal >= 9.5){
                System.out.println("A média doa aluno eh: " + notaFinal + " Aprovado");
            }
            else{
                System.out.println("A média doa aluno eh: " + notaFinal + " Reprovado");
            }
        }

        
    }
}