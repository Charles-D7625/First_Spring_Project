package com.example.demo.classes;

import com.example.demo.interfaces.Music;

public class MusicPlayer {

    private Music music;

    public MusicPlayer() {

    }

    public MusicPlayer(Music music) {
        this.music = music;
    }

    public void PlayMusic() {
        System.out.println("Playing: " + music.getSong());
    }
}
