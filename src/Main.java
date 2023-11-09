

public class Main {
    public static void main(String[] args) {
       Musica musica1 = new Musica("Year Zero" , 180);
       Musica musica2 = new Musica("Griftwood",300);
       Musica musica3 = new Musica("Twenties",200);
       Podcast podcast1 = new Podcast("ep302",800,"Petit Journal");
       Podcast podcast2 = new Podcast("ep303",850, "Codando");

       musica1.play();
       musica1.pause();
       musica1.next();
       podcast2.play();
       podcast2.pause();




    }
}