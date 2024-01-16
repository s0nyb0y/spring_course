package com.radik.spring_course.lesson3;

import java.util.List;
import java.util.Random;

public class MusicPlayer {
    private final List<Music> musicGenre;

    public MusicPlayer(List<Music> musicGenre) {
        this.musicGenre = musicGenre;
    }

    public void playMusic() {
        Random random = new Random();
        System.out.println("Playing: " + musicGenre.get(random.nextInt(musicGenre.size())).getSong());

    }
}
