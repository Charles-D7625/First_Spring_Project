package com.example.demo.classes;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.interfaces.Music;

public class MusicPlayer {

    //private Music music;
    private List<Music> musicList = new ArrayList<>();

    private String name;
    private int volume;

    public MusicPlayer() {

    }

    public MusicPlayer(List<Music> musicList) {
        this.musicList = musicList;
    }
    
    public void setMusic(Music music) {
        this.musicList.add(music);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public void PlayMusic() {
        
        for (Music music : musicList) {
            System.out.println("Playing: " + music.getSong());
        }
    }
}
