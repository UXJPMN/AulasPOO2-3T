package AulaInterfacesExemploMediaPlayer;

public interface IPlayer {
    void play(int id);
    void pause();
    void stop();
    void restart();
    void skip();
    void forwards(int seconds);
    void backwards(int seconds);
    void loop();
}
