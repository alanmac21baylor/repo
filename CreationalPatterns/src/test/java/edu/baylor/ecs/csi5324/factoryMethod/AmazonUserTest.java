package edu.baylor.ecs.csi5324.factoryMethod;

import edu.baylor.ecs.csi5324.factoryMethod.product.Product;
import edu.baylor.ecs.csi5324.factoryMethod.product.impl.AmazonProduct;
import edu.baylor.ecs.csi5324.factoryMethod.store.Store;
import edu.baylor.ecs.csi5324.factoryMethod.store.impl.Amazon;

public class AmazonUserTest extends UserTest {

	// pick a store
	protected Store makeStore() {
		return new Amazon();
	}

	protected Product makeProduct(String name) {
		return new AmazonProduct(name);
	}
}