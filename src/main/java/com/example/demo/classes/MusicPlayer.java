package com.example.demo.classes;

import java.util.ArrayList;
import java.util.Random;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.example.demo.interfaces.Music;

public class MusicPlayer {

    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;

    private Music music;

    private ArrayList<Music> musicList = new ArrayList<>();

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    public MusicPlayer(@Qualifier("rockMusic") Music music) {
        this.music = music;
    }
    
    public MusicPlayer(ArrayList<Music> musicList) {
        this.musicList = musicList;
    }

    public void PlayMusic() {

        Random rand = new Random();

        System.out.println("Playing: " + musicList.get(rand.nextInt(musicList.size())).getSong());
    }
}
