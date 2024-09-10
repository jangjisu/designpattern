package com.study.designpattern.creational.factoryMethod.clone.shipFactory;

import com.study.designpattern.creational.factoryMethod.clone.ship.Ship;
import com.study.designpattern.creational.factoryMethod.clone.ship.WhiteShip;

public class WhiteShipFactory implements ShipFactory {
    @Override
    public Ship createShip() {
        return new WhiteShip();
    }
}
