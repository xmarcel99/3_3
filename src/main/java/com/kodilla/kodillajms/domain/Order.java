package com.kodilla.kodillajms.domain;

import java.io.Serializable;

public class Order implements Serializable {

    private String productName;
    private Double price;

    public Order(String productName, Double price) {
        this.productName = productName;
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public Double getPrice() {
        return price;
    }

    public String showOrder() {
        return "Order: " + productName + ", price: " + price;
    }
}
