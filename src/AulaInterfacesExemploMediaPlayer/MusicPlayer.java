package AulaInterfacesExemploMediaPlayer;

import java.util.ArrayList;

public class MusicPlayer implements IMusicPlayer{
    ArrayList<Music> musicList;
    Music currentMusic;

    @Override
    public void play(int id) {
        currentMusic = musicList.get(id);

        System.out.println("Tocando a música: " + currentMusic.getName());
    }

    @Override
    public void pause() {
        System.out.println("Pausou a música: " + currentMusic.getName());
    }

    @Override
    public void stop() {
        System.out.println("Parou a música: " + currentMusic.getName());
    }

    @Override
    public void restart() {
        System.out.println("Reiniciando a música: " + currentMusic.getName());
    }

    @Override
    public void skip() {
        int index = 0;
        for (int i = 0; i < musicList.size(); i++) {
            if (currentMusic.getId() == musicList.get(i).getId()) {
                index = i;
            }
        }

        if (index + 1 < musicList.size()) {
            currentMusic = musicList.get(index);
            System.out.println("Tocando a música: " + currentMusic.getName());
        } else {
            currentMusic = null;
            System.out.println("Acabaram as músicas.");
        }
    }

    @Override
    public void forwards(int seconds) {
        System.out.println("Adiantou a música: "+ currentMusic + " " + seconds + "s.");
    }

    @Override
    public void backwards(int seconds) {
        System.out.println("Voltou a música: "+ currentMusic + " " + seconds + "s.");
    }

    @Override
    public void loop() {
        System.out.println("A música: " + currentMusic.getName() + " será repetida.");
    }

    @Override
    public void returnArtists() {
        System.out.println("Os artistas presentes na música: " + currentMusic.getName() + " são:");
        for (String artist: currentMusic.artists) {
            System.out.println(artist);
        }
    }

    @Override
    public void returnTime() {
        double mins =  Math.floor(currentMusic.time / 60);
        double seconds = currentMusic.time % 60;
        System.out.println("A música " + currentMusic.getName() + "tem " + mins + ":" + seconds);
    }

    public MusicPlayer() {
        currentMusic = null;
    }

}
