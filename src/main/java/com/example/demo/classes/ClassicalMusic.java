package com.example.demo.classes;

import com.example.demo.interfaces.Music;

public class ClassicalMusic implements Music {

    private ClassicalMusic() {

    }

    //Для получения через фабричный метод. Если bean scope="singleton", то он вызовется только 1 раз
    public static ClassicalMusic getClassicalMusic(){
        return new ClassicalMusic();
    }

    @Override
    public String getSong() {
        return "Classical Music";
    }

}
