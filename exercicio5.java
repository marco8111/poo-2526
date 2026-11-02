import java.util.Scanner;


public class exercicio5 {
    public static void main(String[] args){

        int horadeChegada;
        int minutodeChegada;
        int horadeAlmoco;
        int minutoSaidaAlmoco;
        int horaRegressoAlmoco;
        int minutoRegressoAlmoco;
        int horadeSaida;
        int minutodeSaida;

        int horasTrabalhadas;
        int minutosTrabalhados;
        int horastrabalhoTotalemMinutos;

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Insira a hora de chegada:");
        horadeChegada = sc.nextInt();
        System.out.println("E quantos minutos;");
        minutodeChegada = sc.nextInt();


        System.out.println("Insira a hora de saida para o almoço:");
        horadeAlmoco = sc.nextInt();
        System.out.println("E quantos minutos;");
        minutoSaidaAlmoco = sc.nextInt();


        System.out.println("A que horas regressou do almoço:");
        horaRegressoAlmoco = sc.nextInt();
        System.out.println("E quantos minutos;");
        minutoRegressoAlmoco = sc.nextInt();


        System.out.println("A que horas saiu do trabalho:");
        horadeSaida = sc.nextInt();
        System.out.println("E quantos minutos;");
        minutodeSaida = sc.nextInt();


        horasTrabalhadas = (horadeSaida - horadeChegada) - (horaRegressoAlmoco - horadeAlmoco);
        minutosTrabalhados = (minutoSaidaAlmoco - minutodeChegada) + (minutodeSaida - minutoRegressoAlmoco);

        horastrabalhoTotalemMinutos = (horasTrabalhadas * 60) + minutosTrabalhados;

        System.out.println("O total de horas trabalhadas é: " + horastrabalhoTotalemMinutos / 60 + " horas e " + horastrabalhoTotalemMinutos % 60 + " minutos.");
        
        //System.out.println("O total de minutos trabalhados é: " + horastrabalhoTotalemMinutos);

    }
}
