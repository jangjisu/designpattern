package com.study.designpattern.creational.singleton.clone;

public class review {

    //자바에서 enum 을 사용하지 않고 싱글톤 패턴을 구현하는 방법

    //1. synchronized 키워드를 사용해 생성되지 않은 경우, 생성하도록 활용가능
    // 하지만, 멀티스레드 환경인 스프링에서 한번에 하나만 접근이 가능해 성능적으로 좋지 않음

    //2. 미리 생성해둔 인스턴스를 반환하도록 하는경우
    // 하지만 ,미리 생성해야해 사용하지 않는 경우에도 생성이 되고 첫 시작시 로딩하는 시간이 길 수 있음

    //3. 객체가 생성되지 않은 경우에만 synchronized 키워드를 사용해 생성하도록 활용
    // 하지만, volatile로 변수가 선언되어야함 (Main Memory 에 들고 있어야함)

    //4. static inner Method 를 통해 생성할 수 있음

    private static class reviewHolder {
        private static final review INSTANCE = new review();
    }

    public static review getInstance() {
        return reviewHolder.INSTANCE;
    }

    //private 생성자와 static 메소드를 사용하는 방법의 단점은?
    // 1. 사용자가 마음먹고 reflection, 직렬화 역직렬화를 통해 생성할 수 있다. 미리 생성되어, 첫 로딩에 시간이 더 오래걸린다

    //enum을 사용해 싱글톤 패턴을 구현하는 방법의 장점과 단점은?
    // reflection 등 모든 경우의 수를 차단할 수 있다.
    // 단점 : 미리 만들어 진다는 것, 상속을 쓰지 못한다.

}
