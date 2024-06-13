package com.study.designpattern.creational.factoryMethod.clone.shipFactory;

import com.study.designpattern.creational.factoryMethod.clone.ship.Ship;

public interface ShipFactory {
    default Ship orderShip(String name, String email) {
        validate(name, email);

        prepareFor(name);

        Ship ship = createShip();

        sendEmailTo(email, ship);

        return ship;
    }

    private void validate(String name, String email) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("배 이름을 지어주세요.");
        }

        if (email == null || email.isBlank()) {
            throw new IllegalArgumentException("이메일을 입력해주세요.");
        }
    }

    private void prepareFor(String name) {
        System.out.println(name + " 만들 준비 중");
    }

    Ship createShip();

    private void sendEmailTo(String email, Ship ship) {
        System.out.println(ship.getName() + " 다 만들었습니다.");
    }

    
    
    
}
