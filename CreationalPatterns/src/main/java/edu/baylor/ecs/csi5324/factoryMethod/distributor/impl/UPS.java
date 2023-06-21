package edu.baylor.ecs.csi5324.factoryMethod.distributor.impl;

import edu.baylor.ecs.csi5324.factoryMethod.cart.Cart;
import edu.baylor.ecs.csi5324.factoryMethod.distributor.Distributor;

public class UPS extends Distributor {

    @Override
    public void ship(Cart cart) {
        System.out.println("Shipping via UPS: " + cart.getTotal());
    }
    
}
