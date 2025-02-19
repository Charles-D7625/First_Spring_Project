package com.example.demo.classes;

import org.springframework.stereotype.Component;

import com.example.demo.interfaces.Music;

public class RockMusic implements Music{

    @Override
    public String getSong() {
        return "Rock music";
    }
    
}
