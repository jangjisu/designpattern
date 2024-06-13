package com.study.designpattern.creational.singleton.clone;

public class App {
    public static void main(String[] args) {
        //1. 새로운 생성자를 통해 만들 경우, 서로의 instance 가 동일하지 않게 된다.
        //Settings settings = new Settings();
        //Settings settings1 = new Settings();
        //System.out.println(settings != settings1);

        //2. static 메소드를 통해 new 생성자로 Settings 만들기
        Settings settings = Settings.getInstance();
        Settings settings1 = Settings.getInstance();
        System.out.println(settings == settings1);



    }
}
