package edu.sdccd.cisc191;

public class GasCar extends Car implements Combustible
{
    private int numberOfDoors;
    private int fuelLevel;

    public GasCar(String inManufactureName, int inMilesOnVehicle, int inPrice, int inNumberOfSeats, Option[] inOptions, int inNumberOfDoors)
    {
        super(inManufactureName, inMilesOnVehicle, inPrice, inNumberOfSeats, inOptions, inNumberOfDoors);
        numberOfDoors = inNumberOfDoors;
    }

    public int getNumberOfDoors()
    {
        return numberOfDoors;
    }

    public int getFuelLevel()
    {
        return fuelLevel;
    }

    public void tankUp()
    {
        fuelLevel = 100;
    }
}
