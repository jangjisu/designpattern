package com.study.designpattern.creational.factoryMethod.clone;

import com.study.designpattern.creational.factoryMethod.clone.ship.Ship;
import com.study.designpattern.creational.factoryMethod.clone.shipFactory.BlackShipFactory;
import com.study.designpattern.creational.factoryMethod.clone.shipFactory.WhiteShipFactory;

public class Client {
    //ConcreteCreator 클래스 ?

    public static void main(String[] args) {
        Client client = new Client();

        Ship whiteship = new WhiteShipFactory().orderShip("Whiteship", "jsjangdv@gmail.com");
        System.out.println(whiteship);

        Ship blackship = new BlackShipFactory().orderShip("Blackship", "jsjangdv@gmail.com");
        System.out.println(blackship);
    }
}
