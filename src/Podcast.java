public class Podcast implements Midia{

    protected String nome;
    protected int duracao;
    protected String canal;

    public Podcast(String nome, int duracao, String canal){
        this.nome = nome;
        this.duracao = duracao;
        this.canal = canal;
    }
    public  void play(){
        System.out.println("Reproduzindo " + this.nome + " de " + this.canal);
    }

    public void pause(){
        System.out.println("Pause");
    }

    public void next() {
        System.out.println("Tocando proxima musica.");
    }

    public void previous() {
        System.out.println("Tocando musica anterior.");
    }}