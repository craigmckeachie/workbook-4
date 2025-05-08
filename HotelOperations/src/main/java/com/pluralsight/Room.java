package com.pluralsight;



public class Room {
    //memory
    private int numberOfBeds= 0;
    private double price = 0;
    private boolean isOccupied = false;
    private boolean isDirty = false;


    public Room(int numberOfBeds, double price, boolean isOccupied, boolean isDirty) {
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.isOccupied = isOccupied;
        this.isDirty = isDirty;
    }


    //know
    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public double getPrice() {
        return price;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public boolean isAvailable() {
        return  !isDirty && !isOccupied;
    }

    public boolean isDirty() {
        return isDirty;
    }

    //DO
    public void checkIn(){
        if(this.isOccupied){
            throw new IllegalStateException("Cannot check in. Room already occupied");
        }
        this.isOccupied = true;
        this.isDirty = true;
    }

    public void checkOut(){
        this.isOccupied = false;
        cleanRoom();
    }

    public void cleanRoom(){
        isDirty = false;
    }

}
