package com.example.demo.configurations;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.example.demo.classes.ClassicalMusic;
import com.example.demo.classes.JazzMusic;
import com.example.demo.classes.MusicPlayer;
import com.example.demo.classes.RockMusic;
import com.example.demo.interfaces.Music;

@Configuration
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {

    private ArrayList<Music> musicList = new ArrayList<>();
    
    @Bean
    public ClassicalMusic classicalMusic() {
        return ClassicalMusic.getClassicalMusic();
    }

    @Bean
    public RockMusic rockMusic() {
        return new RockMusic();
    }

    @Bean JazzMusic jazzMusic() {
        return new JazzMusic();
    }

    @Bean
    public MusicPlayer musicPlayer() {

        musicList.add(classicalMusic());
        musicList.add(rockMusic());
        musicList.add(jazzMusic());

        return new MusicPlayer(musicList);
    }

}
