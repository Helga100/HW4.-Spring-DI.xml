package org.example;

import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {

    private final ClassicalMusicPlayer classicalMusicPlayer;
    private final RockMusicPlayer rockMusicPlayer;

    public MusicPlayer(ClassicalMusicPlayer classicalMusicPlayer, RockMusicPlayer rockMusicPlayer) {
        this.classicalMusicPlayer = classicalMusicPlayer;
        this.rockMusicPlayer = rockMusicPlayer;
    }

    public void singClassicalMusic() {
        classicalMusicPlayer.sing();
    }

    public void singRockMusicPlayer() {
        rockMusicPlayer.sing();
    }

}

