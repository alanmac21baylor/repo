package edu.baylor.ecs.csi5324.factoryMethod.store.impl;

import edu.baylor.ecs.csi5324.factoryMethod.distributor.impl.UPS;
import edu.baylor.ecs.csi5324.factoryMethod.store.Store;

public class Amazon extends Store {

    public Amazon() {
        super();
        this.getDistributorList().clear();
        this.addDistributor(new UPS());
    }

    @Override
    protected String getStoreName() {
        return "Amazon";
    }
}
