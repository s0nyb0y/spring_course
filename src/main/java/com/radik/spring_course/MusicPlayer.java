package com.radik.spring_course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class MusicPlayer {
    private final ClassicalMusic classicalMusic;
    private final Rock rock;

    @Autowired
    public MusicPlayer(ClassicalMusic classicalMusic, Rock rock) {
        this.classicalMusic = classicalMusic;
        this.rock = rock;
    }

    public void playMusic(MusicGenre genre) {
        Random random = new Random();
        int randomNumber = random.nextInt(3);
        if (genre == MusicGenre.CLASSICAL_MUSIC) {
            System.out.println(classicalMusic.getSong().get(randomNumber));
        } else {
            System.out.println(rock.getSong().get(randomNumber));
        }
    }
}
