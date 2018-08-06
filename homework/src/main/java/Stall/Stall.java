package Stall;

public abstract class Stall {

    String name;
    String ownerName;
    int parkingSpot;

    Stall(String name, String ownerName, int parkingSpot){

        this.name = name;
        this.ownerName = ownerName;
        this.parkingSpot = parkingSpot;

    }

    public String getName(){
        return this.name;
    }

    public String getOwnerName(){
        return this.ownerName;
    }

    public int getParkingSpot(){
        return this.parkingSpot;
    }


}
