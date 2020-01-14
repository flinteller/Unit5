package com.company;

public class Item {

    private String part_number;

    private String description;

    private double price;

    public Item(String part_number, String description, double price){
        this.part_number = part_number;
        this.description = description;
        this.price = price;
        if(price < 0)
            this.price = 0.0;

    }

    public String toString() {
        return "Item: " + part_number +"\nDescription: " + description + "\nPrice: $" + price;
    }

    public double getTotalPrice(int quantity){
        if(quantity < 0)
            quantity = 0;
        return price * quantity;
    }


}
