package edu.baylor.ecs.csi5324.factoryMethod.product;

import java.math.BigDecimal;

public class Product {

	private String name;
	private String description;
	private BigDecimal price;

	public Product(String name, String describtion, BigDecimal price) {
		super();
		this.name = name;
		this.description = describtion;
		this.price = price;
	}

	public Product() {
	}

	public Product(String name) {
		this.name = name;
	}
    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return this.description;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getPrice() {
        return this.price;
    }
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescribtion() {
		return description;
	}

	public void setDescribtion(String description) {
		this.description = description;
	}

	public static Product make(String name) {
		return new Product(name);
	}

	public Product init(String describtion, BigDecimal price) {
		this.description = describtion;
		this.price = price;
		return this;
	}

}
