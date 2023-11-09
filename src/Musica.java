public class Musica implements Midia{
    protected String nome;
    protected int duracao;

    public Musica(String nome, int duracao){
    this.nome = nome;
    this.duracao = duracao;}

    public void play(){
        System.out.println("Reproduzindo " + this.nome);
    }

    public void pause(){
        System.out.println("Pause");}

    public void next() {
        System.out.println("Tocando proxima musica.");
    }

    public void previous(){
        System.out.println("Tocando musica anterior.");
    }



}
