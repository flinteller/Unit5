package com.company;

public class Hardware {

    public static void main(String[] args){
        Item item1 = new Item("4343", "Circular Saw", 122.50);
        Item item2 = new Item("9876", "Hammer", 19.75);
        Item item3 = new Item("1239", "Level", 12.99);

        System.out.println(item1.getTotalPrice(2) + item2.getTotalPrice(5) + item3.getTotalPrice(12));


        System.out.println(item1);
        System.out.println(item2);
        System.out.println(item3);

    }

}
