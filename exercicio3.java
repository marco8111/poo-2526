import java.util.Scanner;


public class exercicio3 {
    public static void main(String[] args){
        double emprestimoBancario;
        int duraçãoemAnos;
        double taxaJuroAnual;
        double mensalidade;
        double duraçãoemAnosemMeses;


        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o valor do emprestimo bancario:");
        emprestimoBancario = sc.nextDouble();

        System.out.println("Insira a duração do emprestimo em anos:");
        duraçãoemAnos = sc.nextInt();

        duraçãoemAnosemMeses = duraçãoemAnos * 12; //Converter para meses

        System.out.println("Insira a taxa de juro anual:");
        taxaJuroAnual = sc.nextDouble();

        double juroMes = taxaJuroAnual / 12.0;
        
        double baseMes = (1.0 + juroMes);

        mensalidade = ((juroMes * Math.pow(baseMes, duraçãoemAnosemMeses) * emprestimoBancario)/ (Math.pow(baseMes, duraçãoemAnosemMeses) - 1.0));

        System.out.println("A mensalidade do emprestimo bancario é: " + mensalidade);

    }
}
