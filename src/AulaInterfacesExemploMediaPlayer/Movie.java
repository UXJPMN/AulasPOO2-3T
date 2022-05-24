package AulaInterfacesExemploMediaPlayer;

public class Movie implements IMedia {
    private String name;
    private int id;
    String[] directors;
    double time;
    String originalLanguage;
    String genre;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getId() {
        return id;
    }
}
