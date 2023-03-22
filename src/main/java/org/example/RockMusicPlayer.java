package org.example;

import java.util.ArrayList;

public class RockMusicPlayer implements Sing {
    private ArrayList<Song> songs;

    public RockMusicPlayer(ArrayList<Song> songs) {
        this.songs = songs;
    }

    @Override
    public void sing() {
        System.out.println("You are listening: ");
        songs.forEach(songs -> System.out.println(songs.getName() + "composer is " + songs.getComposer()));
    }
}
