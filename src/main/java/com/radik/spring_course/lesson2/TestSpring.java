package com.radik.spring_course.lesson2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        try(ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml")){
            MusicPlayer2 musicPlayer = context.getBean("musicPlayer2", MusicPlayer2.class);
            musicPlayer.playMusic();

            System.out.println(musicPlayer.getName());
            System.out.println(musicPlayer.getVolume());

            ClassicalMusic2 classicalMusic2 = context.getBean("classicalMusic2",ClassicalMusic2.class);
            ClassicalMusic2 classicalMusic3 = context.getBean("classicalMusic2",ClassicalMusic2.class);
            System.out.println(classicalMusic2 == classicalMusic3);

            RockMusic2 rockMusic2 = context.getBean("rockMusic2", RockMusic2.class);
            RockMusic2 rockMusic3 = context.getBean("rockMusic2", RockMusic2.class);

            System.out.println(rockMusic2 == rockMusic3);
        }
    }
}
