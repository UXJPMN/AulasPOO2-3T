package AulaInterfacesExemploMediaPlayer;

public interface IMoviePlayer extends IPlayer {
    void movieSpeed (int speed);
    void subtitles (String subtitles);
    void setLanguage (String language);
}
