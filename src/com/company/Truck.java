package com.company;

public class Truck {
    private String truckID;
    private double odometer;
    private double mpg;
    private double fuel;
    private final double CAPACITY = 20.0;
    private static double totalFuel;


    public Truck(String truckID){
        this(truckID, 0.0, 0.0, 0.0);
    }

    public Truck(String truckID, double odometer, double mpg, double fuel){
        this.truckID = truckID;
        this.odometer = odometer;
        this.mpg = mpg;
        this.fuel = fuel;
    }

    public double getCAPACITY() {
        return CAPACITY;
    }

    public double getFuel() {
        return fuel;
    }

    public double getMpg() {
        return mpg;
    }

    public double getOdometer() {
        return odometer;
    }

    public static double getTotalFuel() {
        return totalFuel;
    }

    public String getTruckID() {
        return truckID;
    }

    public void setMpg(double mpg) {
        this.mpg = mpg;
    }

    public boolean enoughFuel(double miles) {
        boolean enough = false;

        if((mpg * fuel)>= miles)
            enough = true;

        return enough;
    }

    public String drive(double miles){
        boolean temp = false;
        if(mpg == 0.0)
            fuel -= 0;
        else {
            temp = true;
        }

        if(enoughFuel(miles) && temp) {
            odometer += miles;
            fuel -= miles / mpg;
            return "Success!";
        }
        else
            return "Truck " + truckID + " does not have enough fuel to drive " + miles + " miles.";
    }

    public String fill(){
        totalFuel += (CAPACITY - fuel);
        fuel = CAPACITY;
        return "Success!";
    }

    public String fill(double gallons){
        if(fuel + gallons <= CAPACITY) {
            totalFuel += gallons;
            fuel += gallons;
            return "Success!";
        }
        else
            return "Truck " + truckID + ": Gallons exceeds tank capacity";
    }

    public String toString(){
        return "Truck: " + truckID + "\nOdometer: " + odometer + "\nMiles Per Gallon: " + mpg + "\nFuel: " + fuel;
    }


}
