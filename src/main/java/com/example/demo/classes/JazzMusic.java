package com.example.demo.classes;

import com.example.demo.interfaces.Music;

public class JazzMusic implements Music {
    
    @Override
    public String getSong() {
        return "JAZZ!";
    }
}
