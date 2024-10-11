package edu.sdccd.cisc191;

public class HybridCar extends Car implements Combustible, Chargeable
{
    private int numberOfDoors;
    private int fuelLevel;
    private int chargeLevel;

    public HybridCar(String inManufactureName, int inMilesOnVehicle, int inPrice, int inNumberOfSeats, Option[] inOptions, int inNumberOfDoors)
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

    public int getBatteryCharge()
    {
        return chargeLevel;
    }

    public void tankUp()
    {
        fuelLevel = 100;
    }

    public void chargeUp()
    {
        chargeLevel = 100;
    }

}
