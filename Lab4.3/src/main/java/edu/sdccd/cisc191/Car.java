package edu.sdccd.cisc191;

public class Car extends Vehicle
{
    private int numberOfDoors;

    public Car(String inManufactureName, int inMilesOnVehicle, int inPrice, int inNumberOfSeats, Option[] inOptions, int inNumberOfDoors)
    {
        super(inManufactureName, inMilesOnVehicle, inPrice, inNumberOfSeats, inOptions);
        numberOfDoors = inNumberOfDoors;
    }

    public int getNumberOfDoors()
    {
        return numberOfDoors;
    }
}
