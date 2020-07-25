package com.newton.threads.models;

public class CartItem {
    int id, quantity, price;
    String name, description;

    public CartItem(int id, int quantity, int price, String name, String description) {
        this.id = id;
        this.quantity = quantity;
        this.price = price;
        this.name = name;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
