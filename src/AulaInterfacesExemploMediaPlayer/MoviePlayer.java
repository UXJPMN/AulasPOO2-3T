package AulaInterfacesExemploMediaPlayer;

import java.util.ArrayList;

public class MoviePlayer implements IMoviePlayer{
    ArrayList<Movie> movieList;
    Movie currentMovie;
    String currentLanguage;

    @Override
    public void movieSpeed(int speed) {
        System.out.println("O filme: " + currentMovie.getName() + " está na velocidade: " + speed);
    }

    @Override
    public void subtitles(String subtitles) {
        System.out.println("Legendas definidas para o filme: " + currentMovie.getName());
    }

    @Override
    public void setLanguage(String language) {
        currentLanguage = language;
        System.out.println("A língua que o filme está executando é: " + currentLanguage);
    }

    @Override
    public void play(int id) {
        currentMovie = movieList.get(id);

        System.out.println("Agora passando o filme: " + currentMovie.getName());
    }

    @Override
    public void pause() {
        System.out.println("O filme " + currentMovie.getName() + " está pausado.");
    }

    @Override
    public void stop() {
        System.out.println("O filme " + currentMovie.getName() + " parou.");
    }

    @Override
    public void restart() {
        System.out.println("O filme " + currentMovie.getName() + " reiniciou.");
    }

    @Override
    public void skip() {
        int index = 0;
        for (int i = 0; i < movieList.size(); i++) {
            if (currentMovie.getId() == movieList.get(i).getId()) {
                index = i;
            }
        }

        if (index + 1 < movieList.size()) {
            currentMovie = movieList.get(index);
            System.out.println("Passando o filme: " + currentMovie.getName());
        } else {
            currentMovie = null;
            System.out.println("Acabaram os filmes.");
        }
    }

    @Override
    public void forwards(int seconds) {
        System.out.println("O filme " + currentMovie.getName() + " adiantou " + seconds + "s");
    }

    @Override
    public void backwards(int seconds) {
        System.out.println("O filme " + currentMovie.getName() + " voltou " + seconds + "s");
    }

    @Override
    public void loop() {
        System.out.println("O filme " + currentMovie.getName() + " vai recomeçar ao fim.");
    }
}
