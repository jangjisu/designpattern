package com.study.designpattern.creational.singleton.clone;

public class Settings {
    //private 생성 시 new 를 통해 생성자를 할 수 없게됨.
    private Settings() {}

    private static Settings instance;

    public static Settings getInstance() {
        if(instance == null){
            instance = new Settings();
        }
        return instance;
    }

}
