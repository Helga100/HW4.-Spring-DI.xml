package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Main {
    public static void main(String[] args) {
       ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("org.example.Config.xml");
        MusicPlayer musicPlayer = context.getBean("MusicPlayer", MusicPlayer.class);
        musicPlayer.singClassicalMusic();
        musicPlayer.singRockMusicPlayer();

    }
}
