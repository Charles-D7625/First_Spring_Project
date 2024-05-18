package com.example.demo.classes;

import com.example.demo.interfaces.Music;

public class ClassicalMusic implements Music {

    @Override
    public String getSong() {

        return "Classical Music";
    }

}
