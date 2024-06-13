package com.study.designpattern.creational.singleton.clone;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class App {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, FileNotFoundException, IOException, ClassNotFoundException {
        Settings settings = Settings.getInstance4();
        Settings settings1 = Settings.getInstance4();
        System.out.println(settings == settings1); //true

        //reflection
        Constructor<Settings> declaredConstructor = Settings.class.getDeclaredConstructor();
        declaredConstructor.setAccessible(true);

        Settings settings2 = declaredConstructor.newInstance();

        System.out.println(settings == settings2); //false

        //Serialize (직렬화 & 역직렬화)
        try (ObjectOutput out = new ObjectOutputStream(new FileOutputStream("setting.obj"))) {
            out.writeObject(settings);
        }

        try (ObjectInput input = new ObjectInputStream(new FileInputStream("setting.obj"))) {
            settings2 = (Settings) input.readObject();
        }

        System.out.println(settings == settings2); //false

        //enum 으로 사용하는 경우, 위와같이 사용가능
        Setting setting = Setting.INSTANCE;

        Setting setting1 = Setting.INSTANCE;

        System.out.println(setting == setting1);







    }
}
