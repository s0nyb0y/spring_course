package com.radik.spring_course.lesson2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer2 {
    private Music music;
    @Value("${music.name}")
    private String name;
    @Value("${music.volume}")
    private int volume;

    @Autowired
    public MusicPlayer2(@Qualifier("rockMusic2") Music music) {
        this.music = music;
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    public void playMusic() {
        System.out.println("Playing: " + music.getSong());
    }
}
