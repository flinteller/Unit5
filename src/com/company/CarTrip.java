package com.company;

public class CarTrip {

    private double myStartOdometer;
    private double myEndOdometer;
    private double myTime;
    private double myGallonsUsed;

    public CarTrip(double myStartOdometer, double myEndOdometer, double myTime, double myGallonsUsed){
        this.myStartOdometer = myStartOdometer;
        this.myEndOdometer = myEndOdometer;
        this.myTime = myTime;
        this.myGallonsUsed = myGallonsUsed;

    }

    public CarTrip(){
        myStartOdometer = 0.0;
        myEndOdometer = 0.0;
        myTime = 0.0;
        myGallonsUsed = 0.0;
    }

    public double getMyEndOdometer() {
        return myEndOdometer;
    }

    public double getMyGallonsUsed() {
        return myGallonsUsed;
    }

    public double getMyStartOdometer() {
        return myStartOdometer;
    }

    public double getMyTime() {
        return myTime;
    }

    public double getTripDistance(){
        return myEndOdometer - myStartOdometer;
    }

    public double getAverageSpeed(){
        if(myTime == 0.0)
            return myTime;
        else
            return (myEndOdometer - myStartOdometer) / myTime;
    }

    public double getGasMileage(){
        if(myGallonsUsed == 0.0)
            return myGallonsUsed;
        else
            return (myEndOdometer - myStartOdometer) / myGallonsUsed;
    }

    public double getTotalGasPrice(double pricePerGallon){
        return myGallonsUsed * pricePerGallon;
    }

    public String toString(){
        return "Distance traveled: " + (myEndOdometer - myStartOdometer) + " miles";
    }

    public void setMyEndOdometer(double myEndOdometer) {
        this.myEndOdometer = myEndOdometer;
    }

    public void setMyGallonsUsed(double myGallonsUsed) {
        this.myGallonsUsed = myGallonsUsed;
    }

    public void setMyStartOdometer(double myStartOdometer) {
        this.myStartOdometer = myStartOdometer;
    }

    public void setMyTime(double myTime) {
        this.myTime = myTime;
    }
}
