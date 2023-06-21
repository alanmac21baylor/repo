package edu.baylor.ecs.csi5324.factoryMethod.product.impl;

import edu.baylor.ecs.csi5324.factoryMethod.product.Product;
import java.math.BigDecimal;

public class AmazonProduct extends Product {
    public AmazonProduct(String name) {
        super(name);
    }

    @Override
    public Product init(String description, BigDecimal price) {
        setDescription(description);
        setPrice(price);
        return this;
    }

    @Override
    public BigDecimal getPrice() {
        BigDecimal discountMultiplier = new BigDecimal("0.9");
        return super.getPrice().multiply(discountMultiplier);
    }
}
