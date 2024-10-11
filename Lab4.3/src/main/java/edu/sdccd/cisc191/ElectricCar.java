package edu.sdccd.cisc191;

public class ElectricCar extends Car implements Chargeable
{
    private int chargeLevel;

    public ElectricCar(String inManufactureName, int inMilesOnVehicle, int inPrice, int inNumberOfSeats, Option[] inOptions, int inNumberOfDoors)
    {
        super(inManufactureName, inMilesOnVehicle, inPrice, inNumberOfSeats, inOptions, inNumberOfDoors);
    }

    public int getBatteryCharge()
    {
        return chargeLevel;
    }

    public void chargeUp()
    {
        chargeLevel = 100;
    }
}
