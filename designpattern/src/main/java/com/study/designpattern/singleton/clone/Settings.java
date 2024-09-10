package com.study.designpattern.creational.singleton.clone;

import java.io.Serializable;

public class Settings implements Serializable {
    //private 생성 시 new 를 통해 생성자를 할 수 없게됨.
    private Settings() {}

    //1. Synchronized 키워드 사용하기
    // 단점 : 동기화 처리 때문에 성능 단점

    private static Settings instance1;

    public static synchronized Settings getInstance1() {
        if(instance1 == null){
            instance1 = new Settings();
        }
        return instance1;
    }

    //2. eager initalization(이른 초기화) 사용하기
    // 단점 : 미리 만들어야함
    private static final Settings INSTANCE2 = new Settings();

    public static Settings getInstance2() {
        return INSTANCE2;
    }

    //3. double checked locking
    // 변수를 volatile 로 선언해야함
    // volatile은 변수를 Main memory에 저장하겠다는 뜻.
    // main memory 가 아닌 CPU cache 에 저장된 데이터를 읽는 경우, 타 CPU cache에 접근한 경우, instance 가 null인지 체크가 넘어갈 수 있다.
    // 그리고, synchronized 를 선언해주지 않으면 멀티스레드 환경에서, main memory 에 여러 곳에서 접근하는 상황 (race condition) 을 해결할 수 없다.

    // 단점: 1.5 java 부터만 동작한다/ 멀티 스레드 개념을 알아야한다. 복잡하다
    private static volatile Settings instance3;

    public static Settings getInstance3() {
        if(instance3 == null){
            synchronized (Settings.class) {
                if(instance3 == null) {
                    instance3 = new Settings();
                }
            }
        }
        return instance3;
    }

    //4. static inner 클래스 사용하기
    // 모든 요구사항을 충족할 수 있다.
    private static class SettingsHolder {
        private static final Settings INSTANCE = new Settings();
    }

    public static Settings getInstance4() {
        return SettingsHolder.INSTANCE;
    }

    //역직렬화 대응방안
    protected Object readResolve() {
        return getInstance4();
    }


}
