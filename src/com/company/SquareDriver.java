package com.company;
import java.util.Scanner;

public class SquareDriver {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter side length: ");
        double side = scan.nextDouble();

        Square s = new Square(side);

        System.out.println("The area is" + s.calculateArea());
        System.out.println(s);
    }

}
