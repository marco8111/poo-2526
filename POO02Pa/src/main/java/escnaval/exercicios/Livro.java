import java.util.Scanner;



public class Livro{
    private String titulo;
    private String autor;
    private int anoPublicacao;
    private String genero;
    private boolean disponibilidade;

    //Construtores com todos os atributos
    public Livro(String titulo, String autor, int anoPublicacao, String genero, boolean disponibilidade){
        this.titulo= titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.genero = genero;
        this.disponibilidade = disponibilidade;
    }

    //constutor com apenas título e autor
    public Livro( String titulo, String autor){
        this(titulo, autor, 0, "Não especificado", false);
    }

    // Getters e setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public String getAutor(){
        return autor;
    }

    public void setAutor(String autor){
        this.autor= autor;

    }

    public int getAnoPublicacao(){
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao){
        this.anoPublicacao = anoPublicacao;

    }

    public String getGenero(){
        return genero;
    }

    public void setGenero(String genero){
        this.genero = genero;
    }

    public boolean isDisponibilidade(){
        return disponibilidade;
    }

    public void setDisponibilidade(boolean disponibilidade){
        this.disponibilidade = disponibilidade;
    }


    //método para mostrar a saída formatada

    public String formatarInfos(){
        return "Livro:\nTítulo:" + titulo + "\nAutor: " + autor + "\nAno de Publicação: " + anoPublicacao + "\nGenero: " + genero + "\nDisponibilidade: " + (disponibilidade ? "Disponível" : "Indisponível");

    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Livro livro1 = new Livro("1984", "George Orwell", 1949, "Distopia", true);
        Livro livro2 = new Livro("O Senhor dos Anéis", "J.R.R.");
        Livro livro3 = new Livro("Dom Quixote", "Miguel de Cervantes", 1605, "Romance", false);
    
        
        System.out.println(livro1.formatarInfos());
        System.out.println(livro2.formatarInfos());
        System.out.println(livro3.formatarInfos());
    

        //criar coleção de n livros da classe Livro

        System.out.println("Quantos livros quer adicionar?");
        
        int n = sc.nextInt();
        Livro[] livros = new Livro[n];
        for(int i=0; i <= livros.length; i++){
            livros[i] = new Livro("Título" + i, "Autor" + i);
        }

        //Exibir informações de todos os livros na coleção
        for(Livro livro : livros){
            System.out.println(livro.formatarInfos());
        }

    }



}