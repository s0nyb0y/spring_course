package com.radik.spring_course;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Rock implements Music {
    private final List<String> songs = new ArrayList<>();

    {
        songs.add("Numb");
        songs.add("In The End");
        songs.add("Given Up");
    }

    @Override
    public List<String> getSong() {
        return songs;
    }
}
