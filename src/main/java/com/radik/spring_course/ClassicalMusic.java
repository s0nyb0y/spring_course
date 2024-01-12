package com.radik.spring_course;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ClassicalMusic implements Music {
    List<String> songs = new ArrayList<>();

    {
        songs.add("Утро");
        songs.add("К Элизе");
        songs.add("Лунный свет");
    }

    @Override
    public List<String> getSong() {
        return songs;
    }
}
