package org.example;

import java.util.ArrayList;
import java.util.List;

public class ClassicalMusicPlayer implements Sing {

    private ArrayList<Song> songs;

    public ClassicalMusicPlayer(ArrayList<Song> songs) {
        this.songs = songs;
    }

    public void sing() {
        System.out.println("You are listening: ");
        songs.forEach(song -> System.out.println(song.getName() + "composer is " + song.getComposer()));
    }
}
